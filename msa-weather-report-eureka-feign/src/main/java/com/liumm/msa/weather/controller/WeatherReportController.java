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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.liumm.msa.weather.service.ICityFeignClient;
import com.liumm.msa.weather.service.WeatherReportService;
import com.liumm.msa.weather.vo.City;

/** 
 * @ClassName: WeatherReportController 
 * @Description: 控制层代码
 * @author liumm 
 * @date 2018年3月11日 上午10:42:28 
 *  
 */
@RestController
@RequestMapping("/report")
public class WeatherReportController {

	@Autowired
	private WeatherReportService weatherReportService;

	@Autowired
	private ICityFeignClient cityFeignClient;

	/**
	 * 
	 * @Description: 根据城市编号获取天气消息
	 * @param cityId 城市编号
	 * @return:
	 * @throws Exception 
	 */
	@GetMapping("/cityId/{cityId}")
	public ModelAndView getWeatherReportByCityId(@PathVariable(name = "cityId") String cityId, Model model)
			throws Exception {
		// TODO 改为由城市数据API微服务来提供数据
		List<City> cityList = null;
		try {
			// TODO 改为由城市数据API微服务提供数据
			cityList = cityFeignClient.listCity();
		} catch (Exception e) {
		}
		// 添加数据
		model.addAttribute("title", "天气预报");
		model.addAttribute("cityId", cityId);
		model.addAttribute("cityList", cityList);
		model.addAttribute("report", weatherReportService.getWeatherDataByCityId(cityId));
		// 视图返回
		return new ModelAndView("weather/report", "reportModel", model);
	}

}
