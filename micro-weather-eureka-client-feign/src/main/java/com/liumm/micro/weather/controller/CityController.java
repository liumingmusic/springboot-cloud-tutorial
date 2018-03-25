/**   
 * @Title: CityController.java 
 * @Package com.liumm.micro.weather.controller 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月25日 下午4:44:37 
 * @version V1.0   
 */
package com.liumm.micro.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.liumm.micro.weather.service.ICityDataClient;

/** 
 * @ClassName: CityController 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年3月25日 下午4:44:37 
 *  
 */
@RestController
public class CityController {
	
	@Autowired
	private ICityDataClient cityDataClient;
	
	@RequestMapping(value = "/cities", method = RequestMethod.GET)
	public String listCity() {
		// 通过Feign客户端来查找
		String body = cityDataClient.listCity();
		return body;
	}
}
