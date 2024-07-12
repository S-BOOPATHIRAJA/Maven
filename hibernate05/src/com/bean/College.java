package com.bean;

public class College {
	private int No_of_staffs;
	public int getNo_of_staffs() {
		return No_of_staffs;
	}
	public void setNo_of_staffs(int no_of_staffs) {
		No_of_staffs = no_of_staffs;
	}
	public String getDept_name() {
		return Dept_name;
	}
	public void setDept_name(String dept_name) {
		Dept_name = dept_name;
	}
	public String getHod_name() {
		return Hod_name;
	}
	public void setHod_name(String hod_name) {
		Hod_name = hod_name;
	}
	private String Dept_name;
	private String Hod_name;
	@Override
	public String toString() {
		return "College [No_of_staffs=" + No_of_staffs + ", Dept_name=" + Dept_name + ", Hod_name=" + Hod_name + "]";
	}
	
	

}
