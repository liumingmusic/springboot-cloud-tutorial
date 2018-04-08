/**   
 * @Title: ResultInfo.java 
 * @Package com.liumm.msa.weather.utils 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年4月8日 下午11:05:27 
 * @version V1.0   
 */
package com.liumm.msa.weather.utils;

import java.io.Serializable;

/** 
 * @ClassName: ResultInfo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liumm 
 * @date 2018年4月8日 下午11:05:27 
 *  
 */
public class ResponseResult<T> implements Serializable {

	private static final long serialVersionUID = -6971432748349225813L;

	/**
	 * 200表示成功，>=400表示失败,<400系统保留
	 */
	private int code = 200;

	/**
	 * 提示信息
	 */
	private String msg = "";

	/**
	 * 返回数据
	 */
	private T result;

	/**
	 * 
	 * @Description: 有详细信息
	 * @param result
	 * @return 返回数据
	 */
	public static <U> ResponseResult<?> success(final U result) {
		return build(200, "", result);
	}

	/**
	 * 
	 * @Description: 带查询消息返回
	 * @param msg 带消息返回数据
	 * @param result 结果数据
	 * @return 返回数据
	 */
	public static <U> ResponseResult<?> success(String msg, U result) {
		return build(200, msg, result);
	}

	/**
	 * 
	 * @Description: 带查询消息返回
	 * @param msg 带消息返回数据
	 * @param detail 带详细消息
	 * @param result 结果数据
	 * @return 返回数据
	 */
	public static <U> ResponseResult<?> success(int code, String msg, U result) {
		return build(code, msg, result);
	}

	/**
	 * 
	 * @Description: 有详细信息
	 * @param result
	 * @return 返回数据
	 */
	public static <U> ResponseResult<?> failure(U result) {
		return build(500, "系统异常", result);
	}

	/**
	 * 
	 * @Description: 带查询消息返回
	 * @param msg 带消息返回数据
	 * @param result 结果数据
	 * @return 返回数据
	 */
	public static <U> ResponseResult<?> failure(String msg, U result) {
		return build(500, msg, result);
	}

	/**
	 * 
	 * @Description: 带查询消息返回
	 * @param msg 带消息返回数据
	 * @param detail 带详细消息
	 * @param result 结果数据
	 * @return 返回数据
	 */
	public static <U> ResponseResult<?> failure(int code, String msg, final U result) {
		return build(code, msg, result);
	}

	/**
	 * 
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @param code
	 * @param msg
	 * @param detailMsg
	 * @param result
	 * @return 返回数据
	 */
	public static <U> ResponseResult<?> build(final int code, final String msg, final U result) {
		return new ResponseResult<>(code, msg, result);
	}

	/** 
	 * @Title: 
	 * @Description: 
	 * @param code
	 * @param msg
	 * @param detailMsg
	 * @param result 
	 */
	public ResponseResult(int code, String msg, T result) {
		this.code = code;
		this.msg = msg;
		this.result = result;
	}

	/** 
	 * @return code 
	 */
	public int getCode() {
		return code;
	}

	/** 
	 * @param code 要设置的 code 
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/** 
	 * @return msg 
	 */
	public String getMsg() {
		return msg;
	}

	/** 
	 * @param msg 要设置的 msg 
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/** 
	 * @return result 
	 */
	public T getResult() {
		return result;
	}

	/** 
	 * @param result 要设置的 result 
	 */
	public void setResult(T result) {
		this.result = result;
	}

	/** 
	 * @return serialversionuid 
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
