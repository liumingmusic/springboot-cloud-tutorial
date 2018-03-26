/**   
 * @Title: ICityFeignClient.java 
 * @Package com.liumm.msa.weather.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月26日 下午8:47:16 
 * @version V1.0   
 */
package com.liumm.msa.weather.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.liumm.msa.weather.vo.City;

/** 
 * @ClassName: ICityFeignClient 
 * @Description: 客户端调用
 * @author liumm 
 * @date 2018年3月26日 下午8:47:16 
 *  
 */
@FeignClient(value = "msa-weather-city-eureka")
public interface ICityFeignClient {

	/**
	 * 获取城市列表
	 * @Description: (这里用一句话描述这个方法的作用) 
	 * @return
	 * @throws Exception:
	 */
	@GetMapping(value = "/cities/list")
	List<City> listCity() throws Exception;

}
