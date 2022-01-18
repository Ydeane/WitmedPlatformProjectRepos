package com.yrx.witmedPlatform.system.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yrx.witmedPlatform.entity.system.admin.pojo.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <b>智慧医疗信息平台 - 系统管理功能 - 系统菜单数据持久层接口</b>
 *
 * @author Ydeane
 * @date 2022-01-18
 */
@Repository
public interface  MenuDao extends BaseMapper<Menu> {
	/**
	 * 根据上级菜单和角色信息查询菜单列表
	 * @param queryMap
	 * @return
	 */
	List<Menu> findMenuListByParentAndRole(Map<String, Object> queryMap) throws Exception;
}
