/**   
 * @Title: WeatherDataServiceImpl.java 
 * @Package com.liumm.micro.weather.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月11日 下午9:08:56 
 * @version V1.0   
 */
package com.liumm.micro.weather.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.liumm.micro.weather.service.WeatherDataService;
import com.liumm.micro.weather.vo.WeatherResponse;

/** 
 * @ClassName: WeatherDataServiceImpl 
 * @Description: 业务实现类
 * @author liumm 
 * @date 2018年3月11日 下午9:08:56 
 *  
 */
@Service
public class WeatherDataServiceImpl implements WeatherDataService {

	private static final String WEATHER_URI = "http://wthrcdn.etouch.cn/weather_mini?";

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * @Title: getWeatherDataByCityName
	 * @Description: 
	 * @param cityName
	 * @return 
	 */
	@Override
	public WeatherResponse getWeatherDataByCityName(String cityName) {
		// 请求url地址
		String url = WEATHER_URI + "city=" + cityName;
		WeatherResponse entity = getWeatherDataByUrl(url);
		// 消息实体返回
		return entity;
	}

	/**
	 * @Title: getWeatherDataByCityId
	 * @Description: 
	 * @param cityId
	 * @return 
	 */
	@Override
	public WeatherResponse getWeatherDataByCityId(String cityId) {
		// 请求url地址
		String url = WEATHER_URI + "citykey=" + cityId;
		WeatherResponse entity = getWeatherDataByUrl(url);
		// 消息实体返回
		return entity;
	}

	/** 
	 * @Description: (这里用一句话描述这个方法的作用) 
	 * @param url
	 * @return:
	 */
	private WeatherResponse getWeatherDataByUrl(String url) {
		// 返回实体消息
		WeatherResponse entity = null;
		// 请求数据
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
		// 转换为对应的实体消息
		ObjectMapper mapper = new ObjectMapper();
		// 具体的值进行判断
		if (responseEntity.getStatusCodeValue() == 200) {
			try {
				entity = mapper.readValue(responseEntity.getBody(), WeatherResponse.class);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return entity;
	}

}
