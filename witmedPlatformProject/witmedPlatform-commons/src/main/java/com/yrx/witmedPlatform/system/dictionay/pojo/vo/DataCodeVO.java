package com.yrx.witmedPlatform.system.dictionay.pojo.vo;

import com.yrx.witmedPlatform.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能-系统数据元值域代码视图信息</b>
 *
 * @author Ydene
 * @date 2022-1-4
 * @version 1.0.0
 */
@Data
public class DataCodeVO extends BaseVO {
	private static final long serialVersionUID = -8362617915019604672L;
	private Long id;       //主键
	private DataCodeVO parentVO;  //上级数据元
	private String codeName;  //数据元值
	private String name;      //数据元值说明
}
