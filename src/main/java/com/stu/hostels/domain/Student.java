package com.stu.hostels.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "studenthostel")
public class Student {

	public Student() {

	}

	private String sno;
	private String name;
	private int age;
	private String gender;
	private Date d_o_b;
	private String educationDetails;
	private String hostelName;
	private String location;

	@Id
	@GenericGenerator(name = "client_id", strategy = "com.stu.hostels.idGenerator.StudentIdGenerator")
	@GeneratedValue(generator = "client_id")
	@Column(name = "sno")
	@Type(type = "string")
	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	@Column(name = "name")
	@Type(type = "string")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "age")
	@Type(type = "int")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column(name = "gender")
	@Type(type = "string")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "dob")
	@Type(type = "date")
	public Date getD_o_b() {
		return d_o_b;
	}

	public void setD_o_b(Date d_o_b) {
		this.d_o_b = d_o_b;
	}

	@Column(name = "education_details")
	@Type(type = "string")
	public String getEducationDetails() {
		return educationDetails;
	}

	public void setEducationDetails(String educationDetails) {
		this.educationDetails = educationDetails;
	}

	@Column(name = "hostel_name")
	@Type(type = "string")
	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	@Column(name = "Location")
	@Type(type = "string")
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
