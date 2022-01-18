package com.yrx.witmedPlatform.system.admin.pojo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * <b>Meta视图类</b>
 *
 * @author Ydeane
 * @date --
 */
@Data
public class Meta implements Serializable {
	private static final long serialVersionUID = -5048782505199782216L;
	private String title;   //网页名称
	private String icon;    //网页图标
}
