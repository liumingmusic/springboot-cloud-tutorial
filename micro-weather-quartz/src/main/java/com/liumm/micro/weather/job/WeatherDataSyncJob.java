/**   
 * @Title: WeatherDataSyncJob.java 
 * @Package com.liumm.micro.weather.job 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月17日 下午9:34:56 
 * @version V1.0   
 */
package com.liumm.micro.weather.job;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.liumm.micro.weather.service.CityDataService;
import com.liumm.micro.weather.service.WeatherDataService;
import com.liumm.micro.weather.vo.City;

/** 
 * @ClassName: WeatherDataSyncJob 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年3月17日 下午9:34:56 
 *  
 */
@Component
public class WeatherDataSyncJob {

	private final static Logger LOGGER = LoggerFactory.getLogger(WeatherDataSyncJob.class);

	@Autowired
	private CityDataService cityDataService;

	@Autowired
	private WeatherDataService weatherDataService;

	/**
	 * 三十分钟进行数据同步
	 * @Description: (这里用一句话描述这个方法的作用) :
	 */
	@Scheduled(fixedDelay = 1000 * 60 * 30)
	public void syncWeatherById() {
		List<City> cityList = null;
		// 获取城市ID
		try {
			cityList = cityDataService.getCityList();
		} catch (Exception e) {
			LOGGER.error("获取城市信息失败", e);
		}
		LOGGER.info("Start Sync Weather....");
		// 遍历城市数据，请求天气信息
		for (City city : cityList) {
			String cityId = city.getCityId();
			LOGGER.info("sync cityID: " + cityId + "," + city.getCityName());
			weatherDataService.syncWeatherDataById(cityId);
		}
		LOGGER.info("End Sync Weather....");
	}

	@Scheduled(fixedDelay = 1000 * 10)
	public void syncWeatherByName() {
	}

}
