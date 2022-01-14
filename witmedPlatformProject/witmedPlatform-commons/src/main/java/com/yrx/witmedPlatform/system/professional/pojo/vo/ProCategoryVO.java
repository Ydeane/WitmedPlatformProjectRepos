package com.yrx.witmedPlatform.system.professional.pojo.vo;

import com.yrx.witmedPlatform.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能-系统专业技术职务（职称）类别信息视图信息</b>
 *
 * @author Ydene
 * @date 2022-1-4
 * @version 1.0.0
 */
@Data
public class ProCategoryVO extends BaseVO {
	private static final long serialVersionUID = 1767090746824260451L;
	private Long id;    //主键
	private String code;   //类别编码
	private String name;   //类别名称
}
