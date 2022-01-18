package com.yrx.witmedPlatform.entity.system.admin.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yrx.witmedPlatform.base.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
* <b>系统菜单信息表</b>
*
* @author Ydeane
* @date 2022-01-12
* @version 1.0.0
*/
@Data
@TableName("sys_menu")
public class Menu extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.AUTO)
	private Long id;                        // 主键
	@TableField(value = "parent")
	private String parent;                        // 上级菜单
	@TableField(value = "name")
	private String name;                        // 菜单文本
	@TableField(value = "code")
	private String code;                        // 角色编码
	@TableField(value = "path")
	private String path;                        // 链接地址
	@TableField(value = "component")
	private String component;                   //菜单组件
	@TableField(value = "title")
	private String title;                       //菜单标题
	@TableField(value = "icon")
	private String icon;                        // 菜单图标样式
	@TableField(value = "sort")
	private Integer sort;                        // 排序
}