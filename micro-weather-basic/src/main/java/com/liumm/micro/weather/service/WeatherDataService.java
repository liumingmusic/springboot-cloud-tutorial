/**   
 * @Title: WeatherDataService.java 
 * @Package com.liumm.micro.weather.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月11日 下午9:00:36 
 * @version V1.0   
 */
package com.liumm.micro.weather.service;

import com.liumm.micro.weather.vo.WeatherResponse;

/** 
 * @ClassName: WeatherDataService 
 * @Description: 接口类
 * @author liumm 
 * @date 2018年3月11日 下午9:00:36 
 *  
 */
public interface WeatherDataService {

	/**
	 * 根据城市名称查询天气消息
	 * @Description: (这里用一句话描述这个方法的作用) 
	 * @param cityName 城市名称
	 * @return:
	 */
	public WeatherResponse getWeatherDataByCityName(String cityName);

	/**
	 * 
	 * @Description: 根据城市的id查询数据消息
	 * @param cityId 城市id
	 * @return:
	 */
	public WeatherResponse getWeatherDataByCityId(String cityId);

}
