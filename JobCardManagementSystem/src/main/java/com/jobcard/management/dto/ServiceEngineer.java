package com.jobcard.management.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ServiceEngineer extends UserDto {

	private static final long serialVersionUID = 1811421316200973369L;
	
	private String experience;
	private Date joiningDate;
	private String specialist;
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

	@Override
	public String toString() {
		return "ServiceEngineer [experience=" + experience + ", joiningDate=" + joiningDate + ", specialist="
				+ specialist + ", salary=" + salary + ", getExperience()=" + getExperience() + ", getJoiningDate()="
				+ getJoiningDate() + ", getSpecialist()=" + getSpecialist() + ", getSalary()=" + getSalary()
				+ ", getUserGender()=" + getUserGender()
				+ ", getUserEmail()=" + getUserEmail() + ", getUserContact()=" + getUserContact() + ", getUserId()="
				+ getUserId() + ", getUserName()=" + getUserName() + ", getUserPassword()=" + getUserPassword()
				+ ", getUserRole()=" + getUserRole() + "]";
	}

	
	
	/*@Override
	public String toString() {
		return "\nGender =" + getUserGender() + ", \nEmail =" + getUserEmail()
				+ ", \nContact =" + getUserContact() + ", \nName =" + getUserName() + ", \nPassword ="
				+ getUserPassword() + ", \nRole =" + getUserRole();
	}*/

}