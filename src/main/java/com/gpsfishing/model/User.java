package com.gpsfishing.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@NotBlank
	private String userName;
	@NotNull
	@NotBlank
	private String fullName;
	@NotNull
	private Timestamp bithDate;
	@NotNull
	@NotBlank
	private String phoneNumber;
	@Email
	@NotNull
	@NotBlank
	private String mail;
	
	public User() {}

	public User(Long id, @NotNull @NotBlank String userName, @NotNull @NotBlank String fullName,
			@NotNull Timestamp bithDate, @NotNull @NotBlank String phoneNumber, @NotNull @NotBlank String mail) {
		this.id = id;
		this.userName = userName;
		this.fullName = fullName;
		this.bithDate = bithDate;
		this.phoneNumber = phoneNumber;
		this.mail = mail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Timestamp getBithDate() {
		return bithDate;
	}

	public void setBithDate(Timestamp bithDate) {
		this.bithDate = bithDate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", fullName=" + fullName + ", bithDate=" + bithDate
				+ ", phoneNumber=" + phoneNumber + ", mail=" + mail + "]";
	}
}
