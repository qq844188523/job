package com.shprj.entity;

import java.util.Date;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Future;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

public class User {
	@NotEmpty(message="登录账号不能为空!!!!!!!!!!!!！")
//	@NotEmpty
	private String loginName;
//	@Pattern(regexp="[0-9a-zA-Z]{6,30}", message="密码是6-30个字符，必须是字母或数字组合！")
	@Pattern(regexp="[0-9a-zA-Z]{6,30}")
	private String password;
	@NotEmpty(message="邮箱不能为空！")
	@Email(message="邮件格式不正确！")
	private String email;
	@Past(message="生日不能晚于当前时间！")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	@Future(message="注册时间不能早于当前时间！")
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date registTime;
	@DecimalMin(value="1000.00", message="工资必须大于1000")
	@DecimalMax(value="10000.00", message="工资必须小于10000")
	@NumberFormat(pattern="#,###.##")
	private Double salary;
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getRegistTime() {
		return registTime;
	}
	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
