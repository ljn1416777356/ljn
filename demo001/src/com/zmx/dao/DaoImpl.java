/**
 * @(#)DaoImpl.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	张茂修  2017年12月15日
 */
package com.zmx.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

import com.zmx.util.Column;
import com.zmx.util.Table;

/**
 * TODO 填写功能说明
 * @author 张茂修
 */
public class DaoImpl<T> {
	/**
	 * 
	 * 根据注解标签来完成对数据表的保存操作
	 * @param t
	 */
	public void save(T t){
		Properties pro = new Properties();
		
		String tableName = "";
		//获取表---判断一下类是否使用了自定义的注解标签
		Class<?> clazz = t.getClass();
		Table table = clazz.getAnnotation(Table.class);
		if(table!=null){
			//表名称
			tableName = table.value();
		}
		//---------保存时需要获取属性名称或属性的注解----------------------------------------------
		OutputStream out = null;
		try {
			//通过反射把t对象打开，获取get方法
			Field[] fields = clazz.getDeclaredFields();	
			for(Field field:fields){
				//获取注解标签，因为保存到文件中的key就是自定义注解标签的值。
				Column col = field.getAnnotation(Column.class);
				//获取get方法
				Method method = clazz.getMethod("get"+field.getName().substring(0,1).toUpperCase()+
                        field.getName().substring(1));
				//使用使用过注解
				if(col!=null){					
					pro.setProperty(col.value(),method.invoke(t).toString());
				}else{
					pro.setProperty(field.getName(),method.invoke(t).toString());
				}
			}			
			 out = new FileOutputStream("c:/database/"+tableName+"/a.properties");
			pro.store(out, "");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(out != null){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
























































