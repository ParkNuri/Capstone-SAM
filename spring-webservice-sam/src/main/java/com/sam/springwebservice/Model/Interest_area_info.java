package com.sam.springwebservice.Model;

import javax.persistence.*;

import lombok.*;

/*
 *@Author : Ayeon
 *@Date : 2019.05.05
 *@Description : Interest_area_info table object //관심 분야 정보
*/


@Getter
@Setter
@Entity
@Table(name = "interest_area_info")
public class Interest_area_info {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String interest_area_ID = "";
	@Column
	private String interest_area_1 ="";
	@Column
	private String interest_area_2 = "";
	@Column
	private String interest_area_3 = "";

	@ManyToOne
	@JoinColumn(name = "user_num")
	private User_info user_info;



//getter, setter
/*
	public String getInterestAreaID() {
		return interest_area_ID;
	}
	public void setInterestArea(String interest_area_ID) {
		this.interest_area_ID = interest_area_ID;
	}
	
	public String getInterestArea1() {
		return interest_area_1;
	}
	public void setInterestArea1(String interest_area_1) {
		this.interest_area_1 = interest_area_1;
	}
	
	public String getInterestArea2() {
		return interest_area_2;
	}
	public void setInterestArea2(String interest_area) {
		this.interest_area_2 = interest_area_2;
	}
	
	public String getInterestArea3() {
		return interest_area_3;
	}
	public void setInterestArea3(String interest_area_3) {
		this.interest_area_3 = interest_area_3;
	}

	public User_info getUser_info() {
		return user_info;
	}

	public void setUser_info(User_info user_info) {
		this.user_info = user_info;
	}

 */
}
