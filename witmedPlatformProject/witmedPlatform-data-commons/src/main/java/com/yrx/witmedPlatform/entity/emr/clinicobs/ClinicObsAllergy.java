package com.yrx.witmedPlatform.entity.emr.clinicobs;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yrx.witmedPlatform.base.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
* <b>急诊留观病历过敏史详情表</b>
*
* @author Ydeane
* @date 2022-01-12
* @version 1.0.0
*/
@Data
@TableName("emr_clinic_obs_allergy")
public class ClinicObsAllergy extends BaseEntity {
private static final long serialVersionUID = 1L;
		@TableId(type = IdType.NONE)
		private String id;                        // 主键
	        @TableField(value = "emrClinicObs")
	        private String emrClinicObs;                        // 所属急诊留观病历
	        @TableField(value = "history")
	        private String history;                        // 过敏史
	        @TableField(value = "allergen")
	        private String allergen;                        // 过敏原
	        @TableField(value = "allSx")
	        private String allSx;                        // 过敏症状
	        @TableField(value = "allSxCode")
	        private String allSxCode;                        // 过敏症状代码
	        @TableField(value = "allergenCode")
	        private String allergenCode;                        // 过敏原代码
	        @TableField(value = "medicant")
	        private String medicant;                        // 过敏药物名称
	        @TableField(value = "statusCode")
	        private String statusCode;                        // 过敏病情状态代码
	        @TableField(value = "markCode")
	        private String markCode;                        // 过敏史标识代码
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