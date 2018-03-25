package com.liumm.micro.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 
 * @ClassName: MicroWeatherApplication 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年3月24日 下午8:53:01 
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MicroWeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroWeatherApplication.class, args);
	}
}
