package com.yrx.witmedPlatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>智慧医疗信息平台-系统功能模块-Consumer启动类</b>
 *
 * @author Ydeane
 * @date 2021-12-30
 * @version 1.0.0
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SystemConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(SystemConsumerStarter.class,args);
	}
}
