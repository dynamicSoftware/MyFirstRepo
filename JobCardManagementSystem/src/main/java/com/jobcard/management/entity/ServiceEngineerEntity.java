package com.jobcard.management.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SERVICE_ENGINEER_DETAILS")
public class ServiceEngineerEntity extends UserEntity{
	
	@Column(name="EXPERIENCE")
	private String experience;
	@Column(name="JOINING_DATE")
	private Date joiningDate;
	@Column(name="SPECIALIST")
	private String specialist;
	@Column(name="SALARY")
	private Double salary;

	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
