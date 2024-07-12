package com.hiber.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Userdetails")
public class Userdetails {

	@Id
	@Column(name = "U_id", nullable=false,unique=true)
	private long U_id;
	private String U_name;
	private long Aadhar_no;
	private long phone_no;
	private String Address;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL )
	@JoinColumn(name = "U_id")
    private List <Orderdetails> orderdetails;

	public long getU_id() {
		return U_id;
	}

	public void setU_id(long u_id) {
		U_id = u_id;
	}

	public String getU_name() {
		return U_name;
	}

	public void setU_name(String u_name) {
		U_name = u_name;
	}

	public long getAadhar_no() {
		return Aadhar_no;
	}

	public void setAadhar_no(long aadhar_no) {
		Aadhar_no = aadhar_no;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public List<Orderdetails> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<Orderdetails> orderdetails) {
		this.orderdetails = orderdetails;
	}

	@Override
	public String toString() {
		return "Userdetails [U_id=" + U_id + ", U_name=" + U_name + ", Aadhar_no=" + Aadhar_no + ", phone_no="
				+ phone_no + ", Address=" + Address + ", orderdetails=" + orderdetails + "]";
	}

	
}
