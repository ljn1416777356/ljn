/**
 * @(#)User.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	张茂修  2017年12月15日
 */
package com.zmx.domain;

import com.zmx.util.Column;
import com.zmx.util.Table;

/**
 * TODO 填写功能说明
 * @author 张茂修
 */
@Table("emp")
public class User {

	@Column("empid")
	private Integer id;
	@Column("uname")
	private String username;
	private String sex;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
