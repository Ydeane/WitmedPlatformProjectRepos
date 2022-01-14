package com.yrx.witmedPlatform.system.hospital.pojo.vo;

import com.yrx.witmedPlatform.base.pojo.vo.BaseVO;
import com.yrx.witmedPlatform.system.dictionay.pojo.vo.DataCodeVO;
import com.yrx.witmedPlatform.system.dictionay.pojo.vo.DivisionVO;
import com.yrx.witmedPlatform.system.position.pojo.vo.PositionVO;
import lombok.Data;

/**
 * <b>系统功能-医院视图信息</b>
 *
 * @author Ydene
 * @date 2022-1-4
 * @version 1.0.0
 */
@Data
public class HospitalVO extends BaseVO {
	private static final long serialVersionUID = -7906169222748337723L;
	private Long id;             //主键
	private String name;            //机构名称
	private String authority;       //上级主管机构名称
	private String orgCode;        //机构组织机构代码
	private String charge;         //机构负责人（法人）
	private DataCodeVO addressCatCode; //标识地址类别的代码
	private DivisionVO province;       //所在省份
	private DivisionVO city;           //所在市
	private DivisionVO country;        //所在区县
	private String town;           //地址-乡（镇、街道办事处）
	private String village;        //地址-村（街、路、弄等）
	private String doorNo;         //地址-门牌号码
	private String zipCode;        //邮政编码
	private DivisionVO divisionCode;   //行政区划代码
	private DataCodeVO cellphoneCat;   //联系电话-类别信息
	private String cellphone;      //联系电话-号码
	private String email;          //电子邮箱地址
}
