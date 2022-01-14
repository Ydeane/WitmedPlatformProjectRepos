package com.yrx.witmedPlatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>注册中心启动类</b>
 *
 * @author Ydeane
 * @date
 * @since
 */
@EnableEurekaServer
@SpringBootApplication
public class WitmedplatformRegistryStarter {
	public static void main(String[] args) {
		SpringApplication.run(WitmedplatformRegistryStarter.class,args);
	}
}
