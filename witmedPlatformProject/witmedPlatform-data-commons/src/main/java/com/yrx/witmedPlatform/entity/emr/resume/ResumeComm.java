package com.yrx.witmedPlatform.entity.emr.resume;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yrx.witmedPlatform.base.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
* <b>病历概要数据通信详情表</b>
*
* @author Ydeane
* @date 2022-01-12
* @version 1.0.0
*/
@Data
@TableName("emr_resume_comm")
public class ResumeComm extends BaseEntity {
private static final long serialVersionUID = 1L;
		@TableId(type = IdType.NONE)
		private String id;                        // 主键
	        @TableField(value = "emrResume")
	        private String emrResume;                        // 所属病历概要数据
	        @TableField(value = "phoneCat")
	        private String phoneCat;                        // 联系电话-类别
	        @TableField(value = "phoneCatCode")
	        private String phoneCatCode;                        // 联系电话-类别代码
	        @TableField(value = "phoneNo")
	        private String phoneNo;                        // 联系电话-号码
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