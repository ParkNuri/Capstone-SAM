package com.sam.springwebservice.Model;

import javax.persistence.*;

import lombok.*;

/*
 *@Author : Ayeon
 *@Date : 2019.05.05
 *@Description : Interest_job_info table object //관심 직무 정보
*/


@Getter
@Setter
@Entity
@Table(name = "interest_job_info")
public class Interest_job_info {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String interest_job_ID = ""; //관심 직무
	@Column
	private String interest_job_1 = "";
	@Column
	private String interest_job_2 = "";
	@Column
	private String interest_job_3 = "";

	@ManyToOne
	@JoinColumn(name = "user_num")
	private User_info user_info;



//getter, setter
/*
	public String getInterestJobID() {
		return interest_job_ID;
	}
	public void setInterestJobID(String interest_job_ID) {
		this.interest_job_ID = interest_job_ID;
	}
	
	public String getInterestJob1() {
		return interest_job_1;
	}
	public void setInterestJob1(String interest_job_2) {
		this.interest_job_2 = interest_job_2;
	}
	
	public String getInterestJob2() {
		return interest_job_2;
	}
	public void setInterestJob2(String interest_job_2) {
		this.interest_job_2 = interest_job_2;
	}
	
	public String getInterestJob3() {
		return interest_job_3;
	}
	public void setInterestJob3(String interest_job_3) {
		this.interest_job_3 = interest_job_3;
	}

	public User_info getUser_info() {
		return user_info;
	}

	public void setUser_info(User_info user_info) {
		this.user_info = user_info;
	}

 */
}
