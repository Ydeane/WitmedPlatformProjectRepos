package com.yrx.witmedPlatform.system.admin.pojo.vo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * <b>系统功能-用户登录信息视图</b>
 *
 * @author Ydeane
 * @date 2022-1-6
 */
public class AdminLoginVO implements Serializable {
	private static final long serialVersionUID = 443627843672641112L;
	@NotBlank(message = "未填写手机号码")
	@Pattern(regexp = "1[0-9]{10}", message = "手机号码格式错误")
	private String cellphone;                       // 登录手机号码
	@NotBlank(message = "未填写登录密码")
	@Pattern(regexp = "[A-Za-z0-9_@#]{6,}", message = "登录密码格式错误")
	private String password;                        // 用户登录密码
	private String token;                           //登陆成功后Token信息
	private AdminVO adminVO;                        //登录成功后的用户信息

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public AdminVO getAdminVO() {
		return adminVO;
	}

	public void setAdminVO(AdminVO adminVO) {
		this.adminVO = adminVO;
	}
}
