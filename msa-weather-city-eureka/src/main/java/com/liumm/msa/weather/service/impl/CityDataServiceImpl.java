/**   
 * @Title: CityDataServiceImpl.java 
 * @Package com.liumm.micro.weather.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月17日 下午10:54:39 
 * @version V1.0   
 */
package com.liumm.msa.weather.service.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.liumm.msa.weather.service.CityDataService;
import com.liumm.msa.weather.util.XmlBuilder;
import com.liumm.msa.weather.vo.City;
import com.liumm.msa.weather.vo.CityList;

/** 
 * @ClassName: CityDataServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年3月17日 下午10:54:39 
 *  
 */
@Service
public class CityDataServiceImpl implements CityDataService {

	/**
	 * @Title: getCityList
	 * @Description: 获取城市列表
	 * @return
	 * @throws Exception 
	 */
	@Override
	public List<City> getCityList() throws Exception {
		// 读取XML文件
		ClassPathResource resource = new ClassPathResource("citylist.xml");
		BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream(), "utf-8"));
		StringBuffer buffer = new StringBuffer();
		String line = "";
		while ((line = br.readLine()) != null) {
			buffer.append(line);
		}
		br.close();
		// XML转为Java对象
		CityList cityList = (CityList) XmlBuilder.xmlStrToObject(CityList.class, buffer.toString());
		return cityList.getCityList();
	}

}
