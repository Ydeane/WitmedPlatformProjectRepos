package com.yrx.witmedPlatform.entity.system.hospital;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yrx.witmedPlatform.base.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
* <b>医院信息表</b>
*
* @author Ydeane
* @date 2022-01-12
* @version 1.0.0
*/
@Data
@TableName("sys_hospital")
public class Hospital extends BaseEntity {
private static final long serialVersionUID = 1L;
		@TableId(type = IdType.NONE)
		private Integer id;                        // 主键
	        @TableField(value = "name")
	        private String name;                        // 机构名称
	        @TableField(value = "authority")
	        private String authority;                        // 上级主管机构名称
	        @TableField(value = "orgCode")
	        private String orgCode;                        // 组织机构代码
	        @TableField(value = "orgLeader")
	        private String orgLeader;                        // 机构负责人
	        @TableField(value = "addrCatCode")
	        private String addrCatCode;                        // 标识地址类别的代码
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
	        @TableField(value = "division")
	        private String division;                        // 行政区划代码
	        @TableField(value = "phoneCat")
	        private String phoneCat;                        // 联系电话-类别信息
	        @TableField(value = "phone")
	        private String phone;                        // 联系电话-号码
	        @TableField(value = "email")
	        private String email;                        // 电子邮件地址
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