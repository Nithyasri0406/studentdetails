package com.example.studentdetail.entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;

@Entity
public class details {
	
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Integer stuid;
       private String name;
       private String email;
       private String phoneno;
       private String address;
       
        
	public details() {
		super();
	}
	

	public details(String name, String email, String phoneno, String address) {
		super();
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.address = address;
	}

	public Integer getStuid() {
		return stuid;
	}
	public void setStuid(Integer stuid) {
		this.stuid = stuid;
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
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
