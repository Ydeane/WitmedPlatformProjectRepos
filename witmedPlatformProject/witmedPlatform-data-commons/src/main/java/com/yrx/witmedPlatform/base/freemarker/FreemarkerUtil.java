package com.yrx.witmedPlatform.base.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.util.ResourceUtils;

import java.io.*;

/**
 * <b>Freemarker代码生成器工具类</b>
 *
 * @author Ydeane
 * @date 2022-1-5
 * @version 1.0.0
 */
public class FreemarkerUtil {
	public static boolean createFile(Entity entity){
		//创建Freemarker Configuration对象
		Configuration configuration = new Configuration(Configuration.VERSION_2_3_31);
		try{
			//获得位于resources路径下的freemarker文件
			String freemarkerPath = ResourceUtils.getURL("classpath:").getPath()+"freemarker";
			//设置所使用的Freemarker的模板所在的路径位置
			configuration.setDirectoryForTemplateLoading(new File(freemarkerPath));
			//生成目标文件的编码格式
			configuration.setDefaultEncoding("UTF-8");
			//设定所需要生成目标文件的freemarker目标是哪个
			Template template = configuration.getTemplate("entity.ftl");
			//classpath路径：/D:/JetBrains/WitmedPlatformProjectRepo/WitmedPlatformProject/witmedPlatform-data-commons/target/classes/
			//计划保存的路径：D:\JetBrains\WitmedPlatformProjectRepo\WitmedPlatformProject\witmedPlatform-data-commons\src\main\java\com\yrx\witmedPlatform\system\admin\pojo\entity
			String targetPath = ResourceUtils.getURL("classpath:").getPath();
			//截取路径，切换路径到src下
			targetPath = targetPath.substring(0, targetPath.indexOf("target/classes/"));
			//形成目标文件所在文件夹路径
			targetPath = targetPath +"src/main/java/";
			//将所对应的包结构变为文件夹结构，连接到目标文件加路径下
			targetPath = targetPath + entity.getPackageName().replace(".", "/") + "/";
			//根据路径和生成文件创建对应的File对象
			File targetFile = new File(targetPath + entity.getClassName() + ".java");
			//为了能够得到对应输出的文件，那么需要使用到输出流将生成的文件传输到硬盘上。
			//创建字符输出流
			BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));
			//使用freemarker生成对应的文件
			template.process(entity, bw);
			bw.close();
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
}
