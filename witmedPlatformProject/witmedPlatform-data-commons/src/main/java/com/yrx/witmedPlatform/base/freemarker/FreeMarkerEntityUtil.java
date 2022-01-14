package com.yrx.witmedPlatform.base.freemarker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * <b></b>
 *
 * @author
 * @date
 * @since
 */
public class FreeMarkerEntityUtil {
	public static void main(String[] args) {
		//获得数据库连接对象
		Connection connection = ConnectionUtil.getConnection();
		//获得表中的字段数量
//		String sqlCount = "select count(column_name) from information_schema.columns " +
//				"where TABLE_SCHEMA = 'witmedplatform_db' and TABLE_NAME = 'sys_role' ";

		//设定随需要执行的sql语句
		String sql= "select column_name,data_type,column_comment from information_schema.columns" +
				" where TABLE_SCHEMA = 'witmedplatform_db' and TABLE_NAME = 'sys_role' " +
				"order by ordinal_position asc ";

		try {
			//创建Preparedstatement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//进行执行
			ResultSet resultSet = preparedStatement.executeQuery(sql);

			//循环结果集，创建Property集合
			List<Property> propertyList = new ArrayList<Property>();
			while (resultSet.next()){
				//提取相关数据
				String type = resultSet.getString("data_type");
				String name = resultSet.getString("column_name");
				String comment = resultSet.getString("column_comment");
				//将数据库的数据类型变为Java是数据类型
				if ("int".equalsIgnoreCase(type)) {
					type = "Long";
				} else if ("varchar".equalsIgnoreCase(type)) {
					type = "String";
				} else if ("timestamp".equals(type)) {
					type = "Date";
				}
				//创建Property对象
				Property property = new Property();
				property.setType(type);
				property.setName(name);
				property.setComment(comment);
				propertyList.add(property);
			}
			//创建一个Entity对象
			Entity entity = new Entity();
			entity.setPackageName("com.yrx.witmedPlatform.system.admin.pojo.entity");
			entity.setClassName("Role");
			entity.setPropertyList(propertyList);
			//调用freemarker工具类生成实体类
			if(FreemarkerUtil.createFile(entity)){
				System.out.println("目标文件生成成功！");
			}else{
				System.out.println("目标文件生成失败！");
			}
		}catch (Exception e){
			e.printStackTrace();
		}

	}
}
