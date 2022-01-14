package com.yrx.witmedPlatform.system.professional.pojo.vo;

import com.yrx.witmedPlatform.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能-系统专业职务等级视图信息</b>
 *
 * @author Ydene
 * @date 2022-1-4
 * @version 1.0.0
 */
@Data
public class ProRankVO extends BaseVO {
	private static final long serialVersionUID = 8531598633624471398L;
	private Long id;    //主键
	private String code;   //等级编码
	private String name;   //等级名称
}
