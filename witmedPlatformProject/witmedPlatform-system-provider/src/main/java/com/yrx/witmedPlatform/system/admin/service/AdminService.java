package com.yrx.witmedPlatform.system.admin.service;

import com.yrx.witmedPlatform.system.admin.pojo.vo.AdminVO;
import org.springframework.stereotype.Service;

/**
 * <b>系统功能-系统人员业务层接口</b>
 *
 * @author Ydeane
 * @version 1.0.0
 * @date 2022-1-6
 */
public interface AdminService {
	/**
	 * 根据手机号码查询用户信息
	 * @param cellphone
	 * @return
	 */
	AdminVO getAdminVOByCellphone(String cellphone);
}
