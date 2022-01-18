package com.yrx.witmedPlatform.system.admin.transport.impl;

import com.yrx.witmedPlatform.system.admin.pojo.vo.MenuVO;
import com.yrx.witmedPlatform.system.admin.pojo.vo.RoleVO;
import com.yrx.witmedPlatform.system.admin.service.AdminService;
import com.yrx.witmedPlatform.system.admin.service.MenuService;
import com.yrx.witmedPlatform.system.admin.transport.MenuTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <b>智慧医疗信息平台 - 系统管理功能 - 系统菜单传输层接口实现类</b>
 *
 * @author Ydeane
 * @date 2022-01-18
 */
@RestController("menuTransport")
@RequestMapping("/system/admin/admin/trans")
public class MenuTransportImpl implements MenuTransport {
	@Autowired
	private MenuService menuService;

	/**
	 * 根据角色信息查询对应的角色菜单信息
	 * @param roleVO
	 * @return
	 */
	@PostMapping("/list")
	@Override
	public List<MenuVO> getMenuVOListByRoleVO(@RequestBody RoleVO roleVO) throws Exception{
		return menuService.getMenuVOListByRoleVO(roleVO);
	}
}
