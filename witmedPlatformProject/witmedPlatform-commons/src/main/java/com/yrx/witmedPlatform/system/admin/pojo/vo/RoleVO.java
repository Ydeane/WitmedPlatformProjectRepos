package com.yrx.witmedPlatform.system.admin.pojo.vo;

import com.yrx.witmedPlatform.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能-系统角色功能视图信息</b>
 *
 * @author Ydene
 * @date 2022-1-4
 * @version 1.0.0
 */
@Data
public class RoleVO extends BaseVO {
	private static final long serialVersionUID = -96523922871336503L;
	private Long id;   //主键
	private String code;  //角色编码
	private String name;  //角色名称
}
