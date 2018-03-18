/**   
 * @Title: ForecastWeather.java 
 * @Package com.liumm.micro.weather.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月11日 下午8:56:34 
 * @version V1.0   
 */
package com.liumm.micro.weather.vo;

import java.io.Serializable;

/** 
 * @ClassName: ForecastWeather 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年3月11日 下午8:56:34 
 *  
 */
public class ForecastWeather implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */
	private static final long serialVersionUID = 3742838296883859383L;

	private String date;

	private String high;

	private String fengli;

	private String low;

	private String fengxiang;

	private String type;

	/** 
	 * @return date 
	 */
	public String getDate() {
		return date;
	}

	/** 
	 * @param date 要设置的 date 
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/** 
	 * @return high 
	 */
	public String getHigh() {
		return high;
	}

	/** 
	 * @param high 要设置的 high 
	 */
	public void setHigh(String high) {
		this.high = high;
	}

	/** 
	 * @return fengli 
	 */
	public String getFengli() {
		return fengli;
	}

	/** 
	 * @param fengli 要设置的 fengli 
	 */
	public void setFengli(String fengli) {
		this.fengli = fengli;
	}

	/** 
	 * @return low 
	 */
	public String getLow() {
		return low;
	}

	/** 
	 * @param low 要设置的 low 
	 */
	public void setLow(String low) {
		this.low = low;
	}

	/** 
	 * @return fengxiang 
	 */
	public String getFengxiang() {
		return fengxiang;
	}

	/** 
	 * @param fengxiang 要设置的 fengxiang 
	 */
	public void setFengxiang(String fengxiang) {
		this.fengxiang = fengxiang;
	}

	/** 
	 * @return type 
	 */
	public String getType() {
		return type;
	}

	/** 
	 * @param type 要设置的 type 
	 */
	public void setType(String type) {
		this.type = type;
	}

}
