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
import org.springframework.web.bind.annotation.PathVariable;

import com.liumm.msa.weather.vo.City;
import com.liumm.msa.weather.vo.WeatherResponse;

/** 
 * @ClassName: IDataClient 
 * @Description: API网关调用，统一规定请求的路径，统一管理请求
 * @author liumm 
 * @date 2018年3月26日 下午8:47:16 
 *  
 */
@FeignClient(value = "msa-weather-eureka-client-zuul")
public interface IDataClient {

	/**
	 * 获取城市列表
	 * @Description: (这里用一句话描述这个方法的作用) 
	 * @return
	 * @throws Exception:
	 */
	@GetMapping(value = "/city/cities/list")
	List<City> listCity() throws Exception;

	/**
	 * 根据城市名称获取城市的天气
	 * @Description: (这里用一句话描述这个方法的作用) 
	 * @return
	 * @throws Exception:
	 */
	@GetMapping(value = "/data/weather/cityName/{cityName}")
	WeatherResponse getWeatherDataByCityName(@PathVariable(name = "cityName") String cityName) throws Exception;

	/**
	 * 根据城市的编号获取城市信息
	 * @Description: (这里用一句话描述这个方法的作用) 
	 * @return
	 * @throws Exception:
	 */
	@GetMapping(value = "/data/weather/cityId/{cityId}")
	WeatherResponse getWeatherDataByCityId(@PathVariable(name = "cityId") String cityId) throws Exception;

}
