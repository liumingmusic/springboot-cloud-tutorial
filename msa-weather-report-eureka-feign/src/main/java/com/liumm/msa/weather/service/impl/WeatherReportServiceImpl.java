/**   
 * @Title: WeatherReportServiceImpl.java 
 * @Package com.liumm.micro.weather.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月18日 下午1:50:48 
 * @version V1.0   
 */
package com.liumm.msa.weather.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.liumm.msa.weather.service.IWeatherDataFeignClient;
import com.liumm.msa.weather.service.WeatherReportService;
import com.liumm.msa.weather.vo.WeatherData;

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

	private IWeatherDataFeignClient weatherDataFeignClient;

	/**
	 * @Title: getWeatherDataByCityId
	 * @Description: 
	 * @param cityId
	 * @return 
	 */
	@Override
	public WeatherData getWeatherDataByCityId(String cityId) {
		WeatherData data = null;
		try {
			// 改为由天气数据API微服务来提供
			data = weatherDataFeignClient.getWeatherDataByCityId(cityId).getData();
		} catch (Exception e) {
			LOGGER.error("系统异常", e);
		}
		return data;
	}

}
