/**   
 * @Title: CustomException.java 
 * @Package com.liumm.msa.weather.exception 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年4月8日 下午9:03:40 
 * @version V1.0   
 */
package com.liumm.msa.weather.exception;

/** 
 * @ClassName: CustomException 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年4月8日 下午9:03:40 
 *  
 */
public class CustomException extends Exception {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */
	private static final long serialVersionUID = -2191892825747905873L;

	/** 
	 * @Title: 
	 * @Description:  
	 */
	public CustomException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** 
	 * @Title: 
	 * @Description: 
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace 
	 */
	public CustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/** 
	 * @Title: 
	 * @Description: 
	 * @param message
	 * @param cause 
	 */
	public CustomException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/** 
	 * @Title: 
	 * @Description: 
	 * @param message 
	 */
	public CustomException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/** 
	 * @Title: 
	 * @Description: 
	 * @param cause 
	 */
	public CustomException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
