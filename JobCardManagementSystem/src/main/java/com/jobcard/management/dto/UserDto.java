package com.jobcard.management.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class UserDto implements Serializable{

	private static final long serialVersionUID = 1519373129837746243L;
	
	private Integer userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	private String userRole;
	private String userContact;
	private String userGender;
	private String state;
	private String city;
	private String street;
	
	
	/*@Autowired
	private AddressDto userAddress;*/

	/*public AddressDto getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(AddressDto userAddress) {
		this.userAddress = userAddress;
	}*/

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", userRole=" + userRole + ", userContact=" + userContact + ", userGender="
				+ userGender +"]";
	}

}
