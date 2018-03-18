/**   
 * @Title: YesterdayWeather.java 
 * @Package com.liumm.micro.weather.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月11日 下午8:54:36 
 * @version V1.0   
 */
package com.liumm.micro.weather.vo;

import java.io.Serializable;

/** 
 * @ClassName: YesterdayWeather 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年3月11日 下午8:54:36 
 *  
 */
public class YesterdayWeather implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */
	private static final long serialVersionUID = -4951503813644708482L;

	private String date;

	private String high;

	private String fx;

	private String low;

	private String fl;

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
	 * @return fx 
	 */
	public String getFx() {
		return fx;
	}

	/** 
	 * @param fx 要设置的 fx 
	 */
	public void setFx(String fx) {
		this.fx = fx;
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
	 * @return fl 
	 */
	public String getFl() {
		return fl;
	}

	/** 
	 * @param fl 要设置的 fl 
	 */
	public void setFl(String fl) {
		this.fl = fl;
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
