package com.yrx.witmedPlatform.system.admin.pojo.vo;

import com.yrx.witmedPlatform.base.pojo.vo.BaseVO;
import com.yrx.witmedPlatform.system.dictionay.pojo.vo.EducationVO;
import com.yrx.witmedPlatform.system.dictionay.pojo.vo.IdentityVO;
import com.yrx.witmedPlatform.system.hospital.pojo.vo.DepartmentVO;
import com.yrx.witmedPlatform.system.professional.pojo.vo.ProRankVO;
import com.yrx.witmedPlatform.system.professional.pojo.vo.ProTitleVO;
import lombok.Data;

/**
 * <b>系统功能-系统人员信息视图信息</b>
 *
 * @author Ydene
 * @date 2022-1-4
 * @version 1.0.0
 */
@Data
public class AdminVO extends BaseVO {
	private static final long serialVersionUID = 8202976683206239592L;
	private String id;               //主键
	private String no;               //人员工号
	private String name;             //人员姓名
	private String cellphone;        //联系电话
	private String password;         //登陆密码
	private String roleVO;               //人员角色
	private String identityVO;       //人员身份
	private String departmentVO;   //所属部门
	private String technicalPos;     //服务者专业技术职务（职称）
	private String educationVO;        //服务者学历
	private String professionalName; //服务者所学专业
	private String technicalPosRank; //服务者专业技术职务（职称）等级

}
