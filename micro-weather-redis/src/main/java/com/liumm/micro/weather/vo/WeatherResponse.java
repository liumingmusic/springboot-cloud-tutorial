/**   
 * @Title: WeatherResponseEntity.java 
 * @Package com.liumm.micro.weather.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月11日 下午8:44:53 
 * @version V1.0   
 */
package com.liumm.micro.weather.vo;

import java.io.Serializable;

/** 
 * @ClassName: 天气消息实体类
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年3月11日 下午8:44:53 
 *  
 */
public class WeatherResponse implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */
	private static final long serialVersionUID = -230239881379350469L;

	// 天气实体消息
	private WeatherData data;

	// 状态码
	private Integer status;

	// 状态文字
	private String desc;

	/** 
	 * @return data 
	 */
	public WeatherData getData() {
		return data;
	}

	/** 
	 * @param data 要设置的 data 
	 */
	public void setData(WeatherData data) {
		this.data = data;
	}

	/** 
	 * @return status 
	 */
	public Integer getStatus() {
		return status;
	}

	/** 
	 * @param status 要设置的 status 
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/** 
	 * @return desc 
	 */
	public String getDesc() {
		return desc;
	}

	/** 
	 * @param desc 要设置的 desc 
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
