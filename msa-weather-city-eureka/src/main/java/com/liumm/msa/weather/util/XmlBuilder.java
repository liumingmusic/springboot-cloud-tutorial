/**   
 * @Title: XmlBuilder.java 
 * @Package com.liumm.micro.weather.util 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author liumm   
 * @date 2018年3月17日 下午10:45:07 
 * @version V1.0   
 */
package com.liumm.msa.weather.util;

import java.io.Reader;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/** 
 * @ClassName: XmlBuilder 
 * @Description: xml文件转实体类
 * @author liumm 
 * @date 2018年3月17日 下午10:45:07 
 *  
 */
public class XmlBuilder {

	/**
	 * 
	 * @Description: 将xml文件转换为pojo
	 * @param clazz
	 * @param strXml
	 * @return
	 * @throws Exception:
	 */
	public static Object xmlStrToObject(Class<?> clazz, String strXml) throws Exception {
		Object xmlObject = null;
		Reader reader = null;
		JAXBContext context = JAXBContext.newInstance(clazz);
		// 转换对象
		Unmarshaller unmarshaller = context.createUnmarshaller();
		reader = new StringReader(strXml);
		xmlObject = unmarshaller.unmarshal(reader);
		// 关闭
		if (null != reader) {
			reader.close();
		}
		return xmlObject;
	}

}
