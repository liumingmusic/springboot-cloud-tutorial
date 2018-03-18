/**   
 * @Title: WeatherReportServiceImpl.java 
 * @Package com.liumm.micro.weather.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月18日 下午1:50:48 
 * @version V1.0   
 */
package com.liumm.micro.weather.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liumm.micro.weather.service.WeatherDataService;
import com.liumm.micro.weather.service.WeatherReportService;
import com.liumm.micro.weather.vo.WeatherData;
import com.liumm.micro.weather.vo.WeatherResponse;

/** 
 * @ClassName: WeatherReportServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年3月18日 下午1:50:48 
 *  
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

	public static final Logger LOGGER = LoggerFactory.getLogger(WeatherReportServiceImpl.class);

	@Autowired
	private WeatherDataService weatherDataService;

	/**
	 * @Title: getWeatherDataByCityId
	 * @Description: 
	 * @param cityId
	 * @return 
	 */
	@Override
	public WeatherData getWeatherDataByCityId(String cityId) {
		WeatherResponse weather = weatherDataService.getWeatherDataByCityId(cityId);
		return weather.getData();
	}

}
