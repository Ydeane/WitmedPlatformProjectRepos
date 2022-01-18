package com.yrx.witmedPlatform.entity.system.admin.util;

import com.yrx.witmedPlatform.entity.system.admin.pojo.Admin;
import com.yrx.witmedPlatform.entity.system.admin.pojo.Menu;
import com.yrx.witmedPlatform.system.admin.pojo.vo.AdminVO;
import com.yrx.witmedPlatform.system.admin.pojo.vo.MenuVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * <b>实体与视图转换工具类</b>
 *
 * @author Ydeane
 * @date 2022-1-6
 * @version 1.0.0
 */
@Mapper(componentModel = "spring")
public interface PojoMapper {
	PojoMapper INSTANCE = Mappers.getMapper(PojoMapper.class);

	/**
	 * 将实体对象转换为视图对象
	 * @param admin
	 * @return
	 */

	@Mapping(source = "role",target = "roleVO.code")
	AdminVO parseToVO(Admin admin);

	/**
	 * 将实体对象转换位视图对象
	 */
	@Mapping(source = "title",target = "meta.title")
	@Mapping(source = "icon",target = "meta.icon")
	MenuVO parseToVO(Menu menu);

	/**
	 * 将实体列表转换为视图列表
	 */
	@Mapping(source = "title",target = "meta.title")
	@Mapping(source = "icon",target = "meta.icon")
	List<MenuVO> parseToVOList(List<Menu> menuList);

}
