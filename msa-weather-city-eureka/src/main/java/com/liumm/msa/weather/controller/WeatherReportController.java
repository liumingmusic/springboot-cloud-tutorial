/**   
 * @Title: WeatherDataController.java 
 * @Package com.liumm.micro.weather.controller
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月11日 上午10:42:28 
 * @version V1.0   
 */
package com.liumm.msa.weather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liumm.msa.weather.service.CityDataService;
import com.liumm.msa.weather.vo.City;

/** 
 * @ClassName: WeatherReportController 
 * @Description: 控制层代码
 * @author liumm 
 * @date 2018年3月11日 上午10:42:28 
 *  
 */
@RestController
@RequestMapping("/cities")
public class WeatherReportController {

	@Autowired
	private CityDataService cityDataService;

	/**
	 * 
	 * @Description: 获取城市信息
	 * @param cityId 城市编号
	 * @return:
	 * @throws Exception 
	 */
	@GetMapping
	public List<City> listCity() throws Exception {
		return cityDataService.getCityList();
	}

}
