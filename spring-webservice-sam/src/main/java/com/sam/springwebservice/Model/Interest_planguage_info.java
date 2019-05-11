package com.sam.springwebservice.Model;

import javax.persistence.*;

import lombok.*;

/*
 *@Author : Ayeon
 *@Date : 2019.05.05
 *@Description : Interest_planguage_info table object //관심 언어 정보
*/


@Getter
@Setter
@Entity
@Table(name = "interest_planguage_info")
public class Interest_planguage_info {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String interest_plang_ID;
	@Column
	private String interest_plang_1;
	@Column
	private String interest_plang_2;
	@Column
	private String interest_plang_3;

	@ManyToOne
	@JoinColumn(name = "user_num")
	private User_info user_info;



//getter, setter
/*
	public String getInterestLangID() {
		return interest_plang_ID;
	}
		
	public String getInterestLang1() {
		return interest_plang_1;
	}
	public void setInterestLang1(String interest_plang_1) {
		this.interest_plang_1 = interest_plang_1;
	}
		
	public String getInterestLang2() {
		return interest_plang_2;
	}
	public void setInterestLang2(String interest_plang_2) {
		this.interest_plang_2 = interest_plang_2;
	}
		
	public String getInterestLang3() {
		return interest_plang_3;
	}
	public void setInterestLang(String interest_plang_3) {
		this.interest_plang_3 = interest_plang_3;
	}

	public User_info getUser_info() {
		return user_info;
	}

	public void setUser_info(User_info user_info) {
		this.user_info = user_info;
	}

 */
}
