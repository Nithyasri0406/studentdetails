package com.example.studentdetail.entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;

@Entity
public class Details {
	
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Integer stuId;
       private String name;
       private String email;
       private String phoneNo;
       private String address;
       
        
	public Details() {
		super();
	}
	

	public Details(String name, String email, String phoneNo, String address) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	public Integer getStuid() {
		return stuId;
	}
	public void setStuid(Integer stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneNo;
	}
	public void setPhoneno(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
