package com.yrx.witmedPlatform.system.professional.pojo.vo;

import com.yrx.witmedPlatform.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能-系统专业技术职务（职称）信息视图信息表</b>
 *
 * @author Ydene
 * @date 2022-1-4
 * @version 1.0.0
 */
@Data
public class ProTitleVO extends BaseVO {
	private static final long serialVersionUID = 4426916304941505547L;
	private Long id;       //主键
	private ProCategoryVO category;  //所属类别
	private ProRankVO rank;      //所属等级
	private String code;      //专业职务编码
	private String name;      //专业职务名称
}
