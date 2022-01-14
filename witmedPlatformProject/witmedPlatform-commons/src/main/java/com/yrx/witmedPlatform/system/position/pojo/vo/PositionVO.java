package com.yrx.witmedPlatform.system.position.pojo.vo;

import com.yrx.witmedPlatform.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能-系统职务视图信息</b>
 *
 * @author Ydene
 * @date 2022-1-4
 * @version 1.0.0
 */
@Data
public class PositionVO extends BaseVO {
	private static final long serialVersionUID = 1922278023577775141L;
	private Long id;    //主键
	private String code;   //职务编号
	private String name;   //职务名称
}
