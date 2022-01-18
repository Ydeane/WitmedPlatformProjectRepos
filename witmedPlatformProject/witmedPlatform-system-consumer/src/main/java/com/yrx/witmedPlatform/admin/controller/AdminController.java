package com.yrx.witmedPlatform.admin.controller;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.digest.MD5;
import com.yrx.witmedPlatform.base.controller.BaseController;
import com.yrx.witmedPlatform.base.pojo.enums.Status;
import com.yrx.witmedPlatform.base.pojo.vo.ResponseVO;
import com.yrx.witmedPlatform.base.util.BaseConstants;
import com.yrx.witmedPlatform.base.util.RedisUtil;
import com.yrx.witmedPlatform.base.util.TokenUtil;
import com.yrx.witmedPlatform.system.admin.pojo.vo.AdminLoginVO;
import com.yrx.witmedPlatform.system.admin.pojo.vo.AdminVO;
import com.yrx.witmedPlatform.system.admin.pojo.vo.MenuVO;
import com.yrx.witmedPlatform.system.admin.pojo.vo.RoleVO;
import com.yrx.witmedPlatform.system.admin.transport.AdminTransport;
import com.yrx.witmedPlatform.system.admin.transport.MenuTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <b>系统功能—系统人员控制层</b>
 *
 * @author Ydeane
 * @date  2022-1-6
 * @version 1.0.0
 */
@CrossOrigin
@RestController("adminController")
@RequestMapping("/system/admin/admin")
public class AdminController extends BaseController {
	@Autowired
	private AdminTransport adminTransport;
	@Autowired
	private MenuTransport menuTransport;
	@Autowired
	private RedisUtil redisUtil;

	/**
	 * <b>用户使用登录视图进行用户登录操作</b>
	 * @param adminLoginVO
	 * @param result
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/login")
	public ResponseVO loginAdmin(@RequestBody@Validated AdminLoginVO adminLoginVO, BindingResult result)
			throws Exception {
		// 判断是否存在用户登录信息错误
		if (result.hasErrors()) {
			return ResponseVO.error("手机号码或登录密码错误");
		}
		// 根据手机号码查询用户信息
		AdminVO adminVO = adminTransport.getAdminVOByCellphone(adminLoginVO.getCellphone());
		// 判断能够查询到用户信息
		if (adminVO == null) {
			// 未能够查询到用户信息
			return ResponseVO.error("手机号码或登录密码错误");
		}
		// 判断该用户是否处于禁用状态
		if (Status.STATUS_DISABLE.getCode().equals(adminVO.getStatus())) {
			return ResponseVO.error("该用户禁止登录系统");
		}
		// 判断用户登录密码是否正确
		if (!adminVO.getPassword().equals(MD5.create().digestHex(adminLoginVO.getPassword()))) {
			// 登录密码错误
			return ResponseVO.error("手机号码或登录密码错误");
		}
		// 生成 Token 信息
		Map<String, String> claimMap = new HashMap<String, String>();
		claimMap.put("id", adminVO.getId());
		claimMap.put("no", adminVO.getNo());
		String token = TokenUtil.createToken(claimMap, BaseConstants.EXPIRE_AUTH_SEC);
		if (StrUtil.isNotBlank(token)) {
			// 成功生成 Token，将该信息存储到 Redis 中
			if (redisUtil.saveToRedis(token, adminVO, BaseConstants.EXPIRE_AUTH_SEC)) {
				// 存储成功，将信息设定到响应消息头对应位置
				// response.setHeader(BaseConstants.TOKEN_KEY, token);
				adminLoginVO.setToken(token);
				adminLoginVO.setAdminVO(adminVO);
				return ResponseVO.success("登录成功", adminLoginVO);
			}
		}
		return ResponseVO.exception(new Exception("登录失败"));
	}

	/**
	 * 根据token获得当前登录用户信息
	 * @param token
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/info")
	public  ResponseVO getLoginUserByToken(String token) throws Exception{

		// 以 token 作为 key，从 Redis 中获取该用户信息即可
		AdminVO adminVO = (AdminVO) redisUtil.findFromRedis(token, AdminVO.class);
		if (adminVO != null) {
			// 根据用户信息获得该用户的角色信息
			RoleVO roleVO = adminVO.getRoleVO();
			// 根据角色信息查询该角色所对应的功能菜单集合，并且形成树形结构
			List<MenuVO> menuVOList = menuTransport.getMenuVOListByRoleVO(roleVO);
			adminVO.setMenuVOList(menuVOList);
			// 根据 Token 从 Redis 中成功获得当前登录用户信息
			return ResponseVO.success("获取当前登录用户成功", adminVO);
		}
		return ResponseVO.error("未获得当前登录用户信息");
	}
}
