/**   
 * @Title: WeatherDataController.java 
 * @Package com.liumm.micro.weather.controller
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月11日 上午10:42:28 
 * @version V1.0   
 */
package com.liumm.msa.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liumm.msa.weather.service.WeatherDataService;
import com.liumm.msa.weather.vo.WeatherResponse;

/** 
 * @ClassName: WeatherDataController 
 * @Description: 控制层代码
 * @author liumm 
 * @date 2018年3月11日 上午10:42:28 
 *  
 */
@RestController
@RequestMapping("/weather")
public class WeatherDataController {

	@Autowired
	private WeatherDataService weatherDataService;

	/**
	 * 
	 * @Description: 根据城市名称获取天气消息
	 * @param cityName 城市名称
	 * @return:
	 */
	@GetMapping("/cityName/{cityName}")
	public WeatherResponse getWeatherDataByCityName(@PathVariable(name = "cityName") String cityName) {
		return weatherDataService.getWeatherDataByCityName(cityName);
	}

	/**
	 * 
	 * @Description: 根据城市编号获取天气消息
	 * @param cityId 城市编号
	 * @return:
	 */
	@GetMapping("/cityId/{cityId}")
	public WeatherResponse getWeatherDataByCityId(@PathVariable(name = "cityId") String cityId) {
		return weatherDataService.getWeatherDataByCityId(cityId);
	}

}
