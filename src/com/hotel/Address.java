package com.hotel;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
@MappedSuperclass
public class Address {
	@Column(name="city")
	String city;
	@Column(name="state")
	String state;
	@Column(name="landmark")
	String landmark;
	@Column(name="pincode")
	String pincode;
	public String getCity() {
		return city;
	}
	public Address() {
		super();
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	

}
