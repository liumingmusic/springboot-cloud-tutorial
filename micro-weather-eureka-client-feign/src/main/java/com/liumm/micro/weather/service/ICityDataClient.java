/**   
 * @Title: ICityData.java 
 * @Package com.liumm.micro.weather.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月25日 下午4:40:20 
 * @version V1.0   
 */
package com.liumm.micro.weather.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** 
 * @ClassName: ICityData 
 * @Description: 使用feign进行服务之间的调用
 * @author liumm 
 * @date 2018年3月25日 下午4:40:20 
 *  
 */
@FeignClient("msa-weather-city-eureka")
public interface ICityDataClient {

	/**
	 * 服务调用的具体实例
	 * @Description: (这里用一句话描述这个方法的作用) 
	 * @return:
	 */
	@RequestMapping(value = "/cities/list", method = RequestMethod.GET)
	String listCity();

}
