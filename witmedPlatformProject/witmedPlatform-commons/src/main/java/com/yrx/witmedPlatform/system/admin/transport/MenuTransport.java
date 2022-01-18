package com.yrx.witmedPlatform.system.admin.transport;

import com.yrx.witmedPlatform.system.admin.pojo.vo.MenuVO;
import com.yrx.witmedPlatform.system.admin.pojo.vo.RoleVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * <b>智慧医疗信息平台 - 系统管理功能 - 系统菜单传输层接口</b>
 *
 * @author Ydeane
 * @version 1.0.0
 * @date 2022-01-18
 */
@FeignClient(name = "witmedPlatform-system-provider")
public interface MenuTransport {
	/**
	 * 根据角色信息查询对应的角色菜单信息
	 * @param roleVO
	 * @return
	 */
	@PostMapping("/system/admin/admin/trans/list")
	List<MenuVO> getMenuVOListByRoleVO(@RequestBody RoleVO roleVO) throws Exception;
}
