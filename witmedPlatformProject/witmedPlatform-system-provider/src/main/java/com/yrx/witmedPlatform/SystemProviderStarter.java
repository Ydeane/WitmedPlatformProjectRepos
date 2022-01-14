package com.yrx.witmedPlatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b>智慧医疗信息平台-系统功能模块-provider启动类</b>
 *
 * @author Ydeane
 * @date 2021-12-30
 * @version 1.0.0
 */
@MapperScan("com.yrx.witmedPlatform.system.*.dao")
@EnableEurekaClient
@SpringBootApplication
public class SystemProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(SystemProviderStarter.class,args);
	}
}
