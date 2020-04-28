package com.example.jhonDewey.entity.model;


import java.io.Serializable;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
@Entity(name = "usuario")
public class User implements Serializable {

	
	private static final long serialVersionUID = -6833167247955613395L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_user;
	
	@Column(length = 150)
	private String firstName;
	@Column(length = 150) 
	private String lastName;
	@Column(unique = true) 
	private String email;
	@Column(unique = true) 
	private String username;
	@Column(length = 150)
	private String password;
	@Transient 
	private String confirmPassword;
	public long getId_user() {
		return id_user;
	}
	public void setId_user(long id_user) {
		this.id_user = id_user;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "User [id_user=" + id_user + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", username=" + username + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}
	
	
}
