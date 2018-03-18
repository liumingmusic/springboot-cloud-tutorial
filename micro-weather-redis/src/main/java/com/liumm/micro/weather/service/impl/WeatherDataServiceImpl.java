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
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
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

	private final static Logger LOGGER = LoggerFactory.getLogger(WeatherDataServiceImpl.class);

	private static final String WEATHER_URI = "http://wthrcdn.etouch.cn/weather_mini?";

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

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
	 * @param url 请求的URL地址
	 * @return:
	 */
	private WeatherResponse getWeatherDataByUrl(String url) {
		// 返回实体消息
		WeatherResponse entity = null;
		String strBody = null;
		ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
		// 先判断缓存中是否存在
		if (stringRedisTemplate.hasKey(url)) {
			strBody = ops.get(url);
		} else {
			// 缓存不存在，请求数据
			ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
			strBody = responseEntity.getBody();
			if (responseEntity.getStatusCodeValue() == 200) {
				// 缓存不存在的数据，请求成功之后放在缓存中，让后设置超时时间为30分钟
				ops.set(url, strBody, 30, TimeUnit.MINUTES);
			}
		}
		// 转换为对应的实体消息
		ObjectMapper mapper = new ObjectMapper();
		// 具体的值进行判断
		try {
			entity = mapper.readValue(strBody, WeatherResponse.class);
		} catch (IOException e) {
			LOGGER.error("实体转换异常", e);
		}
		return entity;
	}

}
