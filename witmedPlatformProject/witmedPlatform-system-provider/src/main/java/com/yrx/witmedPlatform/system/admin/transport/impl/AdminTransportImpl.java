package com.yrx.witmedPlatform.system.admin.transport.impl;

import com.yrx.witmedPlatform.system.admin.pojo.vo.AdminVO;
import com.yrx.witmedPlatform.system.admin.service.AdminService;
import com.yrx.witmedPlatform.system.admin.transport.AdminTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>系统功能-系统人员传输层接口实现类</b>
 *
 * @author Ydeane
 * @date 2022-1-6
 * @version 1.0.0
 */
@RestController("adminTransport")
@RequestMapping("/system/admin/admin/trans")
public class AdminTransportImpl implements AdminTransport {
	@Autowired
	private AdminService adminService;

	/**
	 * <b>根据手机号码查询用户信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/cellphone")
	@Override
	public AdminVO getAdminVOByCellphone(@RequestParam String cellphone) throws Exception {
		return adminService.getAdminVOByCellphone(cellphone);
	}
}
