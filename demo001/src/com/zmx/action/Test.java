/**
 * @(#)Test.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	张茂修  2017年12月15日
 */
package com.zmx.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * a
 * bc
 * cde
 * @author 张茂修
 */
public class Test {	
	
	public static void main(String[] args) {
		Stream.generate(()->Math.random()*10)
		      .limit(5)
		      .forEach(System.out::println);
	}
}


class User{
	private String username;
	private Integer age;
	
	public User() {
	}
	public User(String username, Integer age) {
		this.username = username;
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + "]";
	}	
}








































