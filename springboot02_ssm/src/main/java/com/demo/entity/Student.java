package com.demo.entity;

import java.io.Serializable;

public class Student implements Serializable {

	private int stu_id;
	private String stu_name;
	private String sex;
	private int class_id;
	
	public Student() {
		
	}
	
	public Student(int stu_id, String stu_name, String sex, int class_id) {
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.sex = sex;
		this.class_id = class_id;
	}
	
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", stu_name=" + stu_name + ", sex=" + sex + ", class_id=" + class_id + "]";
	}
	
}
