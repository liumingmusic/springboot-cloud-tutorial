/**   
 * @Title: WeatherDataServiceImpl.java 
 * @Package com.liumm.micro.weather.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月11日 下午9:08:56 
 * @version V1.0   
 */
package com.liumm.msa.weather.service.impl;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.liumm.msa.weather.service.WeatherDataService;

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

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	/**
	 * @Title: syncWeatherDataById
	 * @Description: 
	 * @param id 
	 */
	@Override
	public void syncWeatherDataById(String id) {
		// 返回实体消息
		ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
		String strBody = null;
		// 请求url地址
		String url = WEATHER_URI + "citykey=" + id;
		// 缓存不存在，请求数据
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
		strBody = responseEntity.getBody();
		if (responseEntity.getStatusCodeValue() == 200) {
			// 缓存不存在的数据，请求成功之后放在缓存中，让后设置超时时间为30分钟
			ops.set(url, strBody, 30, TimeUnit.MINUTES);
		}
	}

	/**
	 * @Title: syncWeatherDataByName
	 * @Description: 
	 * @param name 
	 */
	@Override
	public void syncWeatherDataByName(String name) {
		// 返回实体消息
		ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
		String strBody = null;
		// 请求url地址
		String url = WEATHER_URI + "city=" + name;
		// 缓存不存在，请求数据
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
		strBody = responseEntity.getBody();
		if (responseEntity.getStatusCodeValue() == 200) {
			// 缓存不存在的数据，请求成功之后放在缓存中，让后设置超时时间为30分钟
			ops.set(url, strBody, 30, TimeUnit.MINUTES);
		}
	}

}
