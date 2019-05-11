package com.sam.springwebservice.Model;

import java.sql.Date;
import javax.persistence.*;

import lombok.*;

/*
 *@Author : Ayeon
 *@Date : 2019.05.05
 *@Description : Education_info table object //정부 기업 교육 경험 정보
*/


@Getter
@Setter
@Entity
@Table(name = "Education_info")
public class Education_info {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String education_ID; //교육 ID
	@Column
	private String education_name; //교육 활동 명
	@Column
	private Date education_period; //교육 기간
	@Column
	private String education_content; //활동 내용

	@ManyToOne
	@JoinColumn(name = "user_num")
	private User_info user_info;


//getter, setter
/*

	public String getEducationID() {
		return education_ID;
	}
	public void setEducationID(String edcuation_ID) {
		this.education_ID = education_ID;
	}
	
	public String getEducationName() {
		return education_name;
	}
	public void setEducationName(String education_name) {
		this.education_name = education_name;
	}
	
	public Date getEducationPeriod() {
		return education_period;
	}
	public void setEducationPeriod(Date education_period) {
		this.education_period = education_period;
	}
	
	public String getEducationContent() {
		return education_content;
	}
	public void setEducationContent(String education_content) {
		this.education_content = education_content;
	}

	public User_info getUser_info() {
		return user_info;
	}

	public void setUser_info(User_info user_info) {
		this.user_info = user_info;
	}

 */
}
