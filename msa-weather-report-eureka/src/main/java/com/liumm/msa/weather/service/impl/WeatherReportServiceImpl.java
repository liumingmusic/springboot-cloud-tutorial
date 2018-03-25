/**   
 * @Title: WeatherReportServiceImpl.java 
 * @Package com.liumm.micro.weather.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月18日 下午1:50:48 
 * @version V1.0   
 */
package com.liumm.msa.weather.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.liumm.msa.weather.service.WeatherReportService;
import com.liumm.msa.weather.vo.ForecastWeather;
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

	/**
	 * @Title: getWeatherDataByCityId
	 * @Description: 
	 * @param cityId
	 * @return 
	 */
	@Override
	public WeatherData getWeatherDataByCityId(String cityId) {
		// TODO 改为由天气数据API微服务来提供
		WeatherData data = new WeatherData();
		data.setAqi("81");
		data.setCity("深圳");
		data.setGanmao("容易感冒！多穿衣");
		data.setWendu("22");

		List<ForecastWeather> forecastList = new ArrayList<>();

		ForecastWeather forecast = new ForecastWeather();
		forecast.setDate("25日星期天");
		forecast.setType("晴");
		forecast.setFengxiang("无风");
		forecast.setHigh("高温 11度");
		forecast.setLow("低温 1度");
		forecastList.add(forecast);

		forecast = new ForecastWeather();
		forecast.setDate("26日星期天");
		forecast.setType("晴");
		forecast.setFengxiang("无风");
		forecast.setHigh("高温 11度");
		forecast.setLow("低温 1度");
		forecastList.add(forecast);

		forecast = new ForecastWeather();
		forecast.setDate("27日星期天");
		forecast.setType("晴");
		forecast.setFengxiang("无风");
		forecast.setHigh("高温 11度");
		forecast.setLow("低温 1度");
		forecastList.add(forecast);

		forecast = new ForecastWeather();
		forecast.setDate("28日星期天");
		forecast.setType("晴");
		forecast.setFengxiang("无风");
		forecast.setHigh("高温 11度");
		forecast.setLow("低温 1度");
		forecastList.add(forecast);

		forecast = new ForecastWeather();
		forecast.setDate("29日星期天");
		forecast.setType("晴");
		forecast.setFengxiang("无风");
		forecast.setHigh("高温 11度");
		forecast.setLow("低温 1度");
		forecastList.add(forecast);

		data.setForecast(forecastList);
		
		return data;
	}

}
