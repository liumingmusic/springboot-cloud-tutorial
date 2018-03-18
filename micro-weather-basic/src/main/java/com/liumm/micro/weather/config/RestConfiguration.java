/**   
 * @Title: RestConfiguration.java 
 * @Package com.liumm.micro.weather.config 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月11日 下午9:39:04 
 * @version V1.0   
 */
package com.liumm.micro.weather.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/** 
 * @ClassName: RestConfiguration 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年3月11日 下午9:39:04 
 *  
 */
@Configuration
public class RestConfiguration {

	@Autowired
	private RestTemplateBuilder builder;

	/**
	 * 主要作用在于WeatherDataServiceImpl中有RestTemplate注入
	 * @Description: 
	 * @return:
	 */
	@Bean
	public RestTemplate restTemplate() {
		return builder.build();
	}

}
