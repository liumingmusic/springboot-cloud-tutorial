/**   
 * @Title: CityList.java 
 * @Package com.liumm.micro.weather.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月17日 下午10:41:36 
 * @version V1.0   
 */
package com.liumm.msa.weather.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/** 
 * @ClassName: CityList 
 * @Description: 城市集合
 * @author liumm 
 * @date 2018年3月17日 下午10:41:36 
 *  
 */
@XmlRootElement(name = "c")
@XmlAccessorType(XmlAccessType.FIELD)
public class CityList {

	@XmlElement(name = "d")
	private List<City> cityList;

	/** 
	 * @return cityList 
	 */
	public List<City> getCityList() {
		return cityList;
	}

	/** 
	 * @param cityList 要设置的 cityList 
	 */
	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}

}
