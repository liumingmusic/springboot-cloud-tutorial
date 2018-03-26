/**   
 * @Title: IWeatherData.java 
 * @Package com.liumm.msa.weather.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月26日 下午8:55:13 
 * @version V1.0   
 */
package com.liumm.msa.weather.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.liumm.msa.weather.vo.WeatherResponse;

/** 
 * @ClassName: IWeatherData 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年3月26日 下午8:55:13 
 *  
 */
@FeignClient(value = "msa-weather-data-eureka")
public interface IWeatherDataFeignClient {

	/**
	 * 根据城市名称获取城市的天气
	 * @Description: (这里用一句话描述这个方法的作用) 
	 * @return
	 * @throws Exception:
	 */
	@GetMapping(value = "/weather/cityName/{cityName}")
	WeatherResponse getWeatherDataByCityName(@PathVariable(name = "cityName") String cityName) throws Exception;

	/**
	 * 根据城市的编号获取城市信息
	 * @Description: (这里用一句话描述这个方法的作用) 
	 * @return
	 * @throws Exception:
	 */
	@GetMapping(value = "/weather/cityId/{cityId}")
	WeatherResponse getWeatherDataByCityId(@PathVariable(name = "cityId") String cityId) throws Exception;

}
