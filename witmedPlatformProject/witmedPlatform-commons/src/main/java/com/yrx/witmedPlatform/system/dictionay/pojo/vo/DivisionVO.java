package com.yrx.witmedPlatform.system.dictionay.pojo.vo;

import com.yrx.witmedPlatform.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能-行政区划视图信息</b>
 *
 * @author Ydene
 * @date 2022-1-4
 * @version 1.0.0
 */
@Data
public class DivisionVO extends BaseVO {
	private static final long serialVersionUID = 3589165332598350942L;
	private Long id;       //主键
	private DivisionVO parentVO;  //上级行政区划
	private String code;      //区划编码
	private String name;      //区划名称
}
