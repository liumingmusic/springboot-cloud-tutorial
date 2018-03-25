/**   
 * @Title: WeatherDataService.java 
 * @Package com.liumm.micro.weather.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月11日 下午9:00:36 
 * @version V1.0   
 */
package com.liumm.msa.weather.service;

/** 
 * @ClassName: WeatherDataService 
 * @Description: 接口类
 * @author liumm 
 * @date 2018年3月11日 下午9:00:36 
 *  
 */
public interface WeatherDataService {

	/**
	 * 
	 * @Description: 根据城市ID同步数据
	 * @param id:
	 */
	void syncWeatherDataById(String id);

	/**
	 * 
	 * @Description: 根据城市名称同步数据
	 * @param id:
	 */
	void syncWeatherDataByName(String name);

}
