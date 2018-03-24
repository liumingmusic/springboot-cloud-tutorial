package com.liumm.micro.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @ClassName: MicroWeatherApplication 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年3月24日 下午8:53:01 
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class MicroWeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroWeatherApplication.class, args);
	}
}
