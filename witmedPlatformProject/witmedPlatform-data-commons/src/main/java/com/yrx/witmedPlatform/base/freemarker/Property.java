package com.yrx.witmedPlatform.base.freemarker;

import java.io.Serializable;

/**
 * <b></b>
 *
 * @author
 * @date
 * @since
 */
public class Property implements Serializable {
	private static final long serialVersionUID = -4308732148037389781L;
	private String type;     //属性数据类型
	private String name;     //属性名
	private String comment;  //注解

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
