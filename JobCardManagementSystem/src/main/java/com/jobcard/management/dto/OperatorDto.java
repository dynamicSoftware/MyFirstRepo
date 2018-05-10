package com.jobcard.management.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class OperatorDto extends UserDto {

	private static final long serialVersionUID = 2177597077308906264L;

	private Date joiningDate;
	private Double salary;

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
