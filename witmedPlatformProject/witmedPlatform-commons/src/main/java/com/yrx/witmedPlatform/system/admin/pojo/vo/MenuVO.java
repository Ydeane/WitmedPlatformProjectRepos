package com.yrx.witmedPlatform.system.admin.pojo.vo;

import com.yrx.witmedPlatform.base.pojo.vo.BaseVO;
import lombok.Data;
import java.util.List;

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
	private String name;   //菜单文本
	private String path;    //链接地址
	private String component;   //菜单组件
	private Meta meta;       //路由页面显示图标
	private List<MenuVO> children;     //下级菜单（路由集合）

}
