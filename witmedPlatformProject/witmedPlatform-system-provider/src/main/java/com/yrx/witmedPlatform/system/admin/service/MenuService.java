package com.yrx.witmedPlatform.system.admin.service;

import com.yrx.witmedPlatform.system.admin.pojo.vo.MenuVO;
import com.yrx.witmedPlatform.system.admin.pojo.vo.RoleVO;

import java.util.List;

/**
 * <b>智慧医疗信息平台 - 系统管理功能 - 系统菜单业务层接口</b>
 *
 * @author Ydeane
 * @version 1.0.0
 * @date 2022-01-18
 */
public interface MenuService {
	/**
	 * 根据角色信息查询对应的角色菜单信息
	 * @param roleVO
	 * @return
	 */
	List<MenuVO> getMenuVOListByRoleVO(RoleVO roleVO) throws Exception;
}
