package com.yrx.witmedPlatform.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <b>基础信息功能-基础控制层类</b>
 * <p>
 *     基础控制层依赖注入了如下属性：<br/>
 *     1、HttpServletRequest
 *     2、httpServletResponse
 *     3、HttpSession
 *     本项目所有功能控制层类都必须继承于本基础控制层
 * </p>
 * @author Ydeane
 * @date 2021-12-29
 * @since
 */
@Controller("baseController")
public class BaseController {
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpSession session;

}
