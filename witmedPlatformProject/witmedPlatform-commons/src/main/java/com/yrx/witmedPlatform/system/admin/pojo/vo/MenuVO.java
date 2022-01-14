package com.yrx.witmedPlatform.system.admin.pojo.vo;

import com.yrx.witmedPlatform.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能-系统功能菜单信息视图信息</b>
 *
 * @author Ydene
 * @date 2022-1-4
 * @version 1.0.0
 */
@Data
public class MenuVO extends BaseVO {
	private static final long serialVersionUID = -5485162763223002923L;
	private Long id;    //主键
	private String code;   //菜单编码
	private MenuVO parentVO;   //上级功能菜单
	private String text;   //菜单文本
	private String url;    //链接地址
	private String icon;   //菜单图标样式
	private Integer sort;   //排序
}
