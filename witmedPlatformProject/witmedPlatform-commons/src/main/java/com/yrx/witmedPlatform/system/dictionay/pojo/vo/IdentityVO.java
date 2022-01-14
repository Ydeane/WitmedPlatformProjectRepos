package com.yrx.witmedPlatform.system.dictionay.pojo.vo;

import com.yrx.witmedPlatform.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能-系统身份视图信息</b>
 *
 * @author Ydene
 * @date 2022-1-4
 * @version 1.0.0
 */
@Data
public class IdentityVO extends BaseVO {
	private static final long serialVersionUID = -4451954520404611766L;
	private Long id;   //主键
	private String code;  //身份编号
	private String name;  //身份信息
}
