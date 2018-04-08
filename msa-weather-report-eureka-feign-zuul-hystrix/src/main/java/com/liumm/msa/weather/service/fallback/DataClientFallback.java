/**   
 * @Title: DataClientFallback.java 
 * @Package com.liumm.msa.weather.service.fallback 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年4月8日 下午8:57:39 
 * @version V1.0   
 */
package com.liumm.msa.weather.service.fallback;

import java.util.List;

import org.springframework.stereotype.Component;

import com.liumm.msa.weather.exception.CustomException;
import com.liumm.msa.weather.service.IDataClient;
import com.liumm.msa.weather.vo.City;
import com.liumm.msa.weather.vo.WeatherResponse;

/** 
 * @ClassName: DataClientFallback 
 * @Description: 业务异常回调函数
 * @author liumm 
 * @date 2018年4月8日 下午8:57:39 
 *  
 */
@Component
public class DataClientFallback implements IDataClient {

	/**
	 * @Title: listCity
	 * @Description: 
	 * @return
	 * @throws Exception 
	 */
	@Override
	public List<City> listCity() throws Exception {
		throw new CustomException("客户端调用失败");
	}

	/**
	 * @Title: getWeatherDataByCityName
	 * @Description: 
	 * @param cityName
	 * @return
	 * @throws Exception 
	 */
	@Override
	public WeatherResponse getWeatherDataByCityName(String cityName) throws Exception {
		throw new CustomException("客户端调用失败");
	}

	/**
	 * @Title: getWeatherDataByCityId
	 * @Description: 
	 * @param cityId
	 * @return
	 * @throws Exception 
	 */
	@Override
	public WeatherResponse getWeatherDataByCityId(String cityId) throws Exception {
		throw new CustomException("客户端调用失败");
	}

}
