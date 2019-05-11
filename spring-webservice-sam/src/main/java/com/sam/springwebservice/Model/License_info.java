package com.sam.springwebservice.Model;

import javax.persistence.*;

import lombok.*;

/*
 *@Author : Ayeon
 *@Date : 2019.05.05
 *@Description : License_info table object //자격증 정보
*/

@Getter
@Setter
@Entity
@Table(name = "license_info")
public class License_info {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String license_ID = "";
	@Column
	private String license_name = "";

	@ManyToOne
	@JoinColumn(name = "user_num")
	private User_info user_info;


//getter, setter
/*

	public String getLicenseID() {
		return license_ID;
	}
	public void setLicenseID(String license_ID) {
		this.license_ID = license_ID;
	}
	
	public String getLicenseName() {
		return license_name;
	}
	public void setLicenseName(String license_name) {
		this.license_name = license_name;
	}

	public User_info getUser_info() {
		return user_info;
	}

	public void setUser_info(User_info user_info) {
		this.user_info = user_info;
	}

 */
}
