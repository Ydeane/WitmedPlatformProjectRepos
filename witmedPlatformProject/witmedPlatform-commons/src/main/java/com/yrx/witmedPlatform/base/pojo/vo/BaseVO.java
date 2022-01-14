package com.yrx.witmedPlatform.base.pojo.vo;
import java.io.Serializable;
import java.util.Date;

/**
 * <b>基础信息功能-基础试图信息</b>
 * <p>
 *     基础视图信息设置了如下属性：
 *     1、status:系统状态
 *     2、createBy:创建人
 *     3、createdTime:创建时间
 *     4、modifiedBy:修改人
 *     5、modifiedTime：修改时间
 *     本项目所有功能视图信息都必须继承于本基础视图信息
 * </p>
 * @author Ydeane
 * @date 2021-12-29
 * @since
 */
public class BaseVO implements Serializable {
	private static final long serialVersionUID = -4120087871332742740L;
	private String status;    //系统状态：0-禁止，1-启用
	private String createBy;  //创建人
	private Date createdTime;   //创建时间
	private String modifiedBy;  //修改人
	private Date modifiedTime;   //修改时间

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
