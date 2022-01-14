package com.yrx.witmedPlatform.base.util;

import com.yrx.witmedPlatform.entity.system.admin.Admin;
import com.yrx.witmedPlatform.system.admin.pojo.vo.AdminVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

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
	AdminVO parseToVO(Admin admin);
}
