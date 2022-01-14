package com.yrx.witmedPlatform.system.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yrx.witmedPlatform.entity.system.admin.Admin;
import org.springframework.stereotype.Repository;

/**
 * <b>系统功能-系统人员数据持久层接口</b>
 *
 * @author Ydeane
 * @date 2022-1-6
 * @version 1.0.0
 */
@Repository
public interface AdminDao extends BaseMapper<Admin> {

}
