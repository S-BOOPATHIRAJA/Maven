package com.bean;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "student")
public class Student {

	private int s_id;
	private String name;
	private String address;
	private int marks;
	
	
	
    public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}
	public Student(int s_id, String name, String address, int marks) {
		super();
		this.s_id = s_id;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	public Student()
	{
		
	}
	

	

}
