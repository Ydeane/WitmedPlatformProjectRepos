package com.yrx.witmedPlatform.entity.emr.referral;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yrx.witmedPlatform.base.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
* <b>转诊（院）记录转入转出医院科室情表</b>
*
* @author Ydeane
* @date 2022-01-12
* @version 1.0.0
*/
@Data
@TableName("emr_referral_hospital")
public class ReferralHospital extends BaseEntity {
private static final long serialVersionUID = 1L;
		@TableId(type = IdType.NONE)
		private String id;                        // 主键
	        @TableField(value = "emrReferral")
	        private String emrReferral;                        // 所属转诊（院）记录
	        @TableField(value = "orgName")
	        private String orgName;                        // 机构名称
	        @TableField(value = "orgCode")
	        private String orgCode;                        // 机构组织机构代码
	        @TableField(value = "orgLeader")
	        private String orgLeader;                        // 机构负责人（法人）
	        @TableField(value = "orgAddress")
	        private String orgAddress;                        // 机构地址
	        @TableField(value = "deptName")
	        private String deptName;                        // 科室名称
	        @TableField(value = "orgRole")
	        private String orgRole;                        // 机构角色
	        @TableField(value = "orgRoleCode")
	        private String orgRoleCode;                        // 机构角色代码
	        @TableField(value = "servName")
	        private String servName;                        // 服务者姓名
	        @TableField(value = "servRole")
	        private String servRole;                        // 服务者职责（角色）
	        @TableField(value = "servRoleCode")
	        private String servRoleCode;                        // 服务者职责（角色）代码
	        @TableField(value = "servtechTitle")
	        private String servtechTitle;                        // 服务者专业技术职务
	        @TableField(value = "servEdu")
	        private String servEdu;                        // 服务者学历
	        @TableField(value = "servMajor")
	        private String servMajor;                        // 服务者所学专业
	        @TableField(value = "servTechRank")
	        private String servTechRank;                        // 服务者专业技术职务等级
	        @TableField(value = "servPost")
	        private String servPost;                        // 服务者职务
	        @TableField(value = "referralMark")
	        private String referralMark;                        // 转入转出标记：0-转出，1-转入
	        @TableField(value = "status")
	        private String status;                        // 系统状态：0-禁用，1-启用
	        @TableField(value = "createdBy")
	        private String createdBy;                        // 创建人
	        @TableField(value = "createdTime")
	        private Date createdTime;                        // 创建时间
	        @TableField(value = "modifiedBy")
	        private String modifiedBy;                        // 修改人
	        @TableField(value = "modifiedTime")
	        private Date modifiedTime;                        // 修改时间
}