package com.yrx.witmedPlatform.system.admin.transport;

import com.yrx.witmedPlatform.system.admin.pojo.vo.AdminVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <b>系统功能-系统人员传输层</b>
 *
 * @author Ydeane
 * @date    2022-1-6
 * @version 1.0.0
 */
@FeignClient(name = "witmedPlatform-system-provider")
public interface AdminTransport {
	/**
	 * <b>根据手机号码查询用户信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/system/admin/admin/trans/cellphone")
	//@RequestParam传递参数的注解
	AdminVO getAdminVOByCellphone(@RequestParam String cellphone) throws Exception;
}
