package com.yrx.witmedPlatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b></b>
 *
 * @author Ydeane
 * @date --
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class OpcConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(OpcConsumerStarter.class,args);
	}
}

