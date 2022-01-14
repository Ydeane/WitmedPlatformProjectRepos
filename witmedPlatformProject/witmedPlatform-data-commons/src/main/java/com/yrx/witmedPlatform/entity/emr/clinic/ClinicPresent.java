package com.yrx.witmedPlatform.entity.emr.clinic;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yrx.witmedPlatform.base.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
* <b>门（急）诊病历现病史详情表</b>
*
* @author Ydeane
* @date 2022-01-12
* @version 1.0.0
*/
@Data
@TableName("emr_clinic_present")
public class ClinicPresent extends BaseEntity {
			private static final long serialVersionUID = 1L;
			@TableId(type = IdType.NONE)
			private String id;                        // 主键
	        @TableField(value = "emrClinic")
	        private String emrClinic;                        // 所属门（急）诊病历
	        @TableField(value = "onsetDate")
	        private Date onsetDate;                        // 起病时间
	        @TableField(value = "onsetDesc")
	        private String onsetDesc;                        // 起病情况描述
	        @TableField(value = "sxOnsetReason")
	        private String sxOnsetReason;                        // 症状开始原因/诱因
	        @TableField(value = "sxCh")
	        private String sxCh;                        // 症状特点
	        @TableField(value = "sxAcc")
	        private String sxAcc;                        // 伴随症状
	        @TableField(value = "pastTrt")
	        private String pastTrt;                        // 本疾病既往诊疗经过
	        @TableField(value = "baseTrt")
	        private String baseTrt;                        // 基础疾病诊疗情况
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