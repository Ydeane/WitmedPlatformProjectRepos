package com.yrx.witmedPlatform.system.dictionay.pojo.vo;

import com.yrx.witmedPlatform.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能-系统学历信息视图信息</b>
 *
 * @author Ydene
 * @date 2022-1-4
 * @version 1.0.0
 */
@Data
public class EducationVO extends BaseVO {
	private static final long serialVersionUID = 2135497142978358048L;
	private Long id;       //主键
	private String code;      //学历编号
	private String name;      //学历名称
}
