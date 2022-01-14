package com.yrx.witmedPlatform.entity.pa.patient;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yrx.witmedPlatform.base.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
* <b>病人联系地址信息表</b>
*
* @author Ydeane
* @date 2022-01-12
* @version 1.0.0
*/
@Data
@TableName("pa_patient_addr")
public class PatientAddr extends BaseEntity {
private static final long serialVersionUID = 1L;
		@TableId(type = IdType.NONE)
		private String id;                        // 主键
	        @TableField(value = "patient")
	        private String patient;                        // 病人信息
	        @TableField(value = "addrCat")
	        private String addrCat;                        // 地址类别
	        @TableField(value = "province")
	        private String province;                        // 地址-省（自治区、直辖市）
	        @TableField(value = "city")
	        private String city;                        // 地址-市（地区）
	        @TableField(value = "county")
	        private String county;                        // 地址-县（区）
	        @TableField(value = "countryside")
	        private String countryside;                        // 地址-乡（镇、街道办事处）
	        @TableField(value = "village")
	        private String village;                        // 地址-村（街、路、弄等）
	        @TableField(value = "doorNo")
	        private String doorNo;                        // 地址-门牌号码
	        @TableField(value = "zipcode")
	        private String zipcode;                        // 邮政编码
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