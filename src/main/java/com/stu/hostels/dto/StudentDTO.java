package com.stu.hostels.dto;

import java.io.Serializable;
import java.util.Date;

public class StudentDTO implements Serializable {

	private String name;
	private int age;
	private Date d_o_b;
	private String educationDetails;
	private String relegion;
	private String gender;
	private String hostelName;
	private String Location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getD_o_b() {
		return d_o_b;
	}

	public void setD_o_b(Date d_o_b) {
		this.d_o_b = d_o_b;
	}

	public String getEducationDetails() {
		return educationDetails;
	}

	public void setEducationDetails(String educationDetails) {
		this.educationDetails = educationDetails;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getRelegion() {
		return relegion;
	}

	public void setRelegion(String relegion) {
		this.relegion = relegion;
	}

}
