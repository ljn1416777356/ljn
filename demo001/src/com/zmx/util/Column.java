/**
 * @(#)Column.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	张茂修  2017年12月15日
 */
package com.zmx.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * TODO 填写功能说明
 * @author 张茂修
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
	String value() default "";
}
