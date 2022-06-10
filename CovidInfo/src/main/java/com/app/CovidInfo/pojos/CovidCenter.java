package com.app.CovidInfo.pojos;

public class CovidCenter {
	
	String name;
	String city;
	String state;
	String pincode;
	
	public CovidCenter(	String name,String city,String state,String pincode) {
		this.name = name;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "CovidCenter [name=" + name + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}
