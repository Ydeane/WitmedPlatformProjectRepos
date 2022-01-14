package com.yrx.witmedPlatform.system.hospital.pojo.vo;

import com.yrx.witmedPlatform.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能-医院部门视图信息</b>
 *
 * @author Ydene
 * @date 2022-1-4
 * @version 1.0.0
 */
@Data
public class DepartmentVO extends BaseVO {
	private static final long serialVersionUID = -6637222490063183298L;
	private Long id;        //主键
	private HospitalVO hospitalVO; //所属医院
	private DepartmentVO parentVO;  //上级部门
	private String code;        //部门编码
	private String name;        //部门名称
}
