/**   
 * @Title: WeatherData.java 
 * @Package com.liumm.micro.weather.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月11日 下午8:49:46 
 * @version V1.0   
 */
package com.liumm.msa.weather.vo;

import java.io.Serializable;
import java.util.List;

/** 
 * @ClassName: WeatherData 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年3月11日 下午8:49:46 
 *  
 */
public class WeatherData implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */
	private static final long serialVersionUID = -6412545890794196146L;

	private YesterdayWeather yesterday;

	private String city;

	private String aqi;

	private List<ForecastWeather> forecast;

	private String ganmao;

	private String wendu;

	/** 
	 * @return yesterday 
	 */
	public YesterdayWeather getYesterday() {
		return yesterday;
	}

	/** 
	 * @param yesterday 要设置的 yesterday 
	 */
	public void setYesterday(YesterdayWeather yesterday) {
		this.yesterday = yesterday;
	}

	/** 
	 * @return forecast 
	 */
	public List<ForecastWeather> getForecast() {
		return forecast;
	}

	/** 
	 * @param forecast 要设置的 forecast 
	 */
	public void setForecast(List<ForecastWeather> forecast) {
		this.forecast = forecast;
	}

	/** 
	 * @return city 
	 */
	public String getCity() {
		return city;
	}

	/** 
	 * @param city 要设置的 city 
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/** 
	 * @return aqi 
	 */
	public String getAqi() {
		return aqi;
	}

	/** 
	 * @param aqi 要设置的 aqi 
	 */
	public void setAqi(String aqi) {
		this.aqi = aqi;
	}

	/** 
	 * @return ganmao 
	 */
	public String getGanmao() {
		return ganmao;
	}

	/** 
	 * @param ganmao 要设置的 ganmao 
	 */
	public void setGanmao(String ganmao) {
		this.ganmao = ganmao;
	}

	/** 
	 * @return wendu 
	 */
	public String getWendu() {
		return wendu;
	}

	/** 
	 * @param wendu 要设置的 wendu 
	 */
	public void setWendu(String wendu) {
		this.wendu = wendu;
	}

}
