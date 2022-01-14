package com.yrx.witmedPlatform.base.freemarker;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * <b>JDBC连接数据持久层工具类</b>
 *
 * @author Ydeane
 * @date 2022-1-5
 * @version 1.0.0
 */
public class ConnectionUtil {
	//创建四个基本属性信息
	private static String driverName = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/witmedplatform_db?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&useSSL=false&allowPublicKeyRetrieval=true";
	private static String username = "root";
	private static String password = "root";
	//创建threadlocal对象
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();
	//静态代码块
	static{
		try{
			Class.forName(driverName);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		Connection connection = threadLocal.get();
		if(connection == null){
			try{
				connection = DriverManager.getConnection(url,username,password);
				threadLocal.set(connection);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return connection;
	}
}
