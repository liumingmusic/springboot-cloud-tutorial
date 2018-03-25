/**   
 * @Title: City.java 
 * @Package com.liumm.micro.weather.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月17日 下午10:33:26 
 * @version V1.0   
 */
package com.liumm.msa.weather.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/** 
 * @ClassName: City 
 * @Description: 城市数据信息
 * @author liumm 
 * @date 2018年3月17日 下午10:33:26 
 *  
 */
public class City {

	private String cityId;

	private String cityName;

	private String cityCode;

	private String province;

	/** 
	 * @return cityId 
	 */
	public String getCityId() {
		return cityId;
	}

	/** 
	 * @param cityId 要设置的 cityId 
	 */
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	/** 
	 * @return cityName 
	 */
	public String getCityName() {
		return cityName;
	}

	/** 
	 * @param cityName 要设置的 cityName 
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/** 
	 * @return cityCode 
	 */
	public String getCityCode() {
		return cityCode;
	}

	/** 
	 * @param cityCode 要设置的 cityCode 
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	/** 
	 * @return province 
	 */
	public String getProvince() {
		return province;
	}

	/** 
	 * @param province 要设置的 province 
	 */
	public void setProvince(String province) {
		this.province = province;
	}

}
