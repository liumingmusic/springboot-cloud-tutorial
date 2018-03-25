/**   
 * @Title: WeatherReportService.java 
 * @Package com.liumm.micro.weather.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月18日 下午1:48:25 
 * @version V1.0   
 */
package com.liumm.msa.weather.service;

import com.liumm.msa.weather.vo.WeatherData;

/** 
 * @ClassName: WeatherReportService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年3月18日 下午1:48:25 
 *  
 */
public interface WeatherReportService {

	/**
	 * 根据城市ID获取城市天气
	 * @Description: (这里用一句话描述这个方法的作用) 
	 * @param cityId
	 * @return:
	 */
	public WeatherData getWeatherDataByCityId(String cityId);

}
