package com.yrx.witmedPlatform.entity.opc.register;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yrx.witmedPlatform.base.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
* <b>病人就诊信息表</b>
*
* @author Ydeane
* @date 2022-01-12
* @version 1.0.0
*/
@Data
@TableName("opc_register_record")
public class RegisterRecord extends BaseEntity {
private static final long serialVersionUID = 1L;
		@TableId(type = IdType.NONE)
		private String id;                        // 主键
	        @TableField(value = "patient")
	        private String patient;                        // 病人信息
	        @TableField(value = "emrNo")
	        private String emrNo;                        // 病历号
	        @TableField(value = "clinicNo")
	        private String clinicNo;                        // 门诊号
	        @TableField(value = "department")
	        private String department;                        // 科室信息
	        @TableField(value = "doctor")
	        private String doctor;                        // 医生信息
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