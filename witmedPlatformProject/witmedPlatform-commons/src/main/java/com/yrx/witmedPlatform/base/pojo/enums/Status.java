package com.yrx.witmedPlatform.base.pojo.enums;

/**
 * <b>基础信息功能-系统状态枚举信息</b>
 *
 * @author Ydeane
 * @date 2021-12-29
 * @since
 */
public enum Status {
	STATUS_ENABLE("1","启用"),
	STATUS_DISABLE("0","禁用")
	;
	private String code; //状态编码
	private String remark; //状态说明

	private Status(String code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
