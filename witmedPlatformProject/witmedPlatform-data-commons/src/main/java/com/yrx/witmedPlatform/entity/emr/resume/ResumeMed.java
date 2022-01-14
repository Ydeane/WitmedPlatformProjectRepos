package com.yrx.witmedPlatform.entity.emr.resume;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yrx.witmedPlatform.base.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
* <b>病历概要数据用药详情表</b>
*
* @author Ydeane
* @date 2022-01-12
* @version 1.0.0
*/
@Data
@TableName("emr_resume_med")
public class ResumeMed extends BaseEntity {
private static final long serialVersionUID = 1L;
		@TableId(type = IdType.NONE)
		private String id;                        // 主键
	        @TableField(value = "emrResume")
	        private String emrResume;                        // 所属病历概要数据
	        @TableField(value = "medUsage")
	        private String medUsage;                        // 药物用法
	        @TableField(value = "usageRate")
	        private String usageRate;                        // 药物使用-频率
	        @TableField(value = "medUnit")
	        private String medUnit;                        // 药物使用-剂量单位
	        @TableField(value = "perDosage")
	        private Double perDosage;                        // 药物使用-次剂量
	        @TableField(value = "totalDosage")
	        private Double totalDosage;                        // 药物使用-总剂量
	        @TableField(value = "wayCode")
	        private String wayCode;                        // 药物使用-途径代码
	        @TableField(value = "medName")
	        private String medName;                        // 药物名称
	        @TableField(value = "dosageForm")
	        private String dosageForm;                        // 药物剂型代码
	        @TableField(value = "medCat")
	        private String medCat;                        // 药物类型
	        @TableField(value = "medNameCode")
	        private String medNameCode;                        // 药物名称代码
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