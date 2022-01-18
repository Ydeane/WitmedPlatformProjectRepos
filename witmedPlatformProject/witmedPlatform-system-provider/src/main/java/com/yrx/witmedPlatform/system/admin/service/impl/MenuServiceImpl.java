package com.yrx.witmedPlatform.system.admin.service.impl;

import com.yrx.witmedPlatform.entity.system.admin.pojo.Menu;
import com.yrx.witmedPlatform.entity.system.admin.util.PojoMapper;
import com.yrx.witmedPlatform.system.admin.dao.MenuDao;
import com.yrx.witmedPlatform.system.admin.pojo.vo.MenuVO;
import com.yrx.witmedPlatform.system.admin.pojo.vo.RoleVO;
import com.yrx.witmedPlatform.system.admin.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <b>智慧医疗信息平台 - 系统管理功能 - 系统菜单业务层接口实现类</b>
 *
 * @author Ydeane
 * @date 2022-01-18
 */
@Service("menuService")
@Transactional
public class MenuServiceImpl implements MenuService {
	@Autowired
	private MenuDao menuDao;


	/**
	 * 根据角色视图查询对应的菜单信息
	 * @param roleVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<MenuVO> getMenuVOListByRoleVO(RoleVO roleVO) throws Exception{
		//创建查询数据，根据parent和role信息，查询以及菜单
		Map<String, Object> queryMap = new HashMap<String, Object>();
		queryMap.put("parent", null);
		queryMap.put("role", roleVO.getCode());
		//进行一级菜单查询
		List<Menu> parentList = menuDao.findMenuListByParentAndRole(queryMap);
		//床架一个集合用来存储所有的菜单信息
		List<MenuVO> menuVOList = new ArrayList<MenuVO>();
		//提取二级菜单信息
		//判断一级菜单列表是否有信息
		if(!parentList.isEmpty()){
			//开始遍历一级菜单
			for (Menu menu:parentList){
				//将实体对象转换为视图对象
				MenuVO menuVO = PojoMapper.INSTANCE.parseToVO(menu);
				//给二级菜单添加其对应的parent
				queryMap.put("parent", menu.getParent());
				//根据一级菜单查询二级菜单
				List<Menu> childrenList = menuDao.findMenuListByParentAndRole(queryMap);
				//将二级菜单实体列表转换为视图列表
				List<MenuVO> childrenListVO = PojoMapper.INSTANCE.parseToVOList(childrenList);
				//将二级菜单添加到一级菜单中
				menuVO.setChildren(childrenListVO);
				menuVOList.add(menuVO);
			}
		}
		return menuVOList;
	}
}
