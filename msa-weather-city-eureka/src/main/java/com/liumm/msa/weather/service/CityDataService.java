/**   
 * @Title: CityDataService.java 
 * @Package com.liumm.micro.weather.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月17日 下午10:53:02 
 * @version V1.0   
 */
package com.liumm.msa.weather.service;

import java.util.List;

import com.liumm.msa.weather.vo.City;

/** 
 * @ClassName: CityDataService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年3月17日 下午10:53:02 
 *  
 */
public interface CityDataService {

	/**
	 * 
	 * @Description: 获取城市列表
	 * @return
	 * @throws Exception:
	 */
	public List<City> getCityList() throws Exception;

}
