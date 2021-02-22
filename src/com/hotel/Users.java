package com.hotel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="user_details")
public class Users extends Address {
	public Users(String city, String state, String landmark, String pincode) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users() {
		super();
	}
    
	@Column(name="name")
	@NotEmpty(message="Please enter name") 
	String name;
    
    
	@Column(name="phonenumber")
	@Digits(integer=12,fraction=0,message="Please enter valid Ph No.")
	@Length(min=8,max=12,message="Size of phone must not be less than 8")
	String phoneno;
	
	
	@Column(name="userid")
	@Id
	int userid;
	
	
	@Column(name="email")
	@Email(message="Please enter valid email")
	String emailid;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	@Override
	public String toString() {
		return "Users [name=" + name + ", phoneno=" + phoneno + ", address=" + ", userid=" + userid
				+ ", emailid=" + emailid + "]";
	}
	
	
	
	

}
