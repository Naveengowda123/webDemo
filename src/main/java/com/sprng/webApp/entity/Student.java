package com.sprng.webApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	String roll;
	String name;
	String branch;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String roll, String name, String branch) {
		super();
		this.roll = roll;
		this.name = name;
		this.branch = branch;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", branch=" + branch + "]";
	}
    
}
