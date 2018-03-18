/**   
 * @Title: RedisTest.java 
 * @Package com.liumm.micro.weather.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月17日 下午9:03:26 
 * @version V1.0   
 */
package com.liumm.micro.weather.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/** 
 * @ClassName: RedisTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年3月17日 下午9:03:26 
 *  
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Test
	public void test() {
		Boolean hasKey = stringRedisTemplate.hasKey("liumm");
		System.out.println(hasKey);
	}

}
