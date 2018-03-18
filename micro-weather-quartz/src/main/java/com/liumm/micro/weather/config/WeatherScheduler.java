/**   
 * @Title: WeatherScheduler.java 
 * @Package com.liumm.micro.weather.config 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月17日 下午9:57:39 
 * @version V1.0   
 */
package com.liumm.micro.weather.config;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

/** 
 * @ClassName: WeatherScheduler 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年3月17日 下午9:57:39 
 *  
 */
@Component
public class WeatherScheduler {

	@Bean
	public TaskScheduler taskScheduler() {
		ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
		taskScheduler.setPoolSize(10);
		taskScheduler.setThreadNamePrefix("定时任务:");
		return taskScheduler;
	}

}
