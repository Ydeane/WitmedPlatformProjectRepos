package com.yrx.witmedPlatform.system.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yrx.witmedPlatform.entity.system.admin.util.PojoMapper;
import com.yrx.witmedPlatform.entity.system.admin.pojo.Admin;
import com.yrx.witmedPlatform.system.admin.dao.AdminDao;
import com.yrx.witmedPlatform.system.admin.pojo.vo.AdminVO;
import com.yrx.witmedPlatform.system.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <b>系统功能-系统人员业务层接口实现类</b>
 *
 * @author Ydeane
 * @date 2022-1-6
 * @version 1.0.0
 */
@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;

	/**
	 * 根据手机号码查询用户信息
	 * @param cellphone
	 * @return
	 */
	@Override
	public AdminVO getAdminVOByCellphone(String cellphone) {
		//创建mybatisPlus查询对象
		QueryWrapper<Admin> queryWrapper= new QueryWrapper<Admin>();
		queryWrapper.eq("cellphone", cellphone);
		//进行查询
		Admin admin = adminDao.selectOne(queryWrapper);
		//判断是否查询到信息
		if(admin != null){
			//将实体转换为视图对象
			return PojoMapper.INSTANCE.parseToVO(admin);
		}
		return null;
	}
}
