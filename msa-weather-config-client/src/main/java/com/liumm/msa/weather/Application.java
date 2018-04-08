package com.liumm.msa.weather;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @ClassName: 主程序入口
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年3月11日 下午8:31:24 
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Application {

	@Value("${name}")
	String name;

	@RequestMapping("/get")
	String hello() {
		return "Hello " + name + "!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
