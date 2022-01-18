package com.yrx.witmedPlatform.entity.system.admin.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yrx.witmedPlatform.base.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
* <b>系统角色信息表</b>
*
* @author Ydeane
* @date 2022-01-12
* @version 1.0.0
*/
@Data
@TableName("sys_role")
public class Role extends BaseEntity {
private static final long serialVersionUID = 1L;
			@TableId(type = IdType.NONE)
			private Integer id;                        // 主键
	        @TableField(value = "code")
	        private String code;                        // 角色编码
	        @TableField(value = "name")
	        private String name;                        // 角色名称
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