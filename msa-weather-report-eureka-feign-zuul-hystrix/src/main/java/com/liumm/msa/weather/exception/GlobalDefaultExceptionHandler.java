/**   
 * @Title: GlobalDefaultExceptionHandler.java 
 * @Package com.liumm.msa.weather.exception 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年4月8日 下午9:10:20 
 * @version V1.0   
 */
package com.liumm.msa.weather.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liumm.msa.weather.utils.ResponseResult;

/** 
 * @ClassName: GlobalDefaultExceptionHandler 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年4月8日 下午9:10:20 
 *  
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ResponseResult<?> defaultErrorHandler(HttpServletRequest req, Exception e) {
		System.out.println(e.getMessage());
		return ResponseResult.failure(500, "系统异常", null);
	}

}
