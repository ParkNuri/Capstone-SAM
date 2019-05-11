package com.sam.springwebservice.Model;

import java.sql.Date;
import javax.persistence.*;

import lombok.*;

/*
 *@Author : Ayeon
 *@Date : 2019.05.05
 *@Description : Langugae_info table object //어학 성적 정보
*/


@Getter
@Setter
@Entity
@Table(name = "language_info")
public class Language_info {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String language_ID;
	@Column
	private String language_name;
	@Column
	private int language_score;
	@Column
	private String language_grade;
	@Column
	private Date language_date;

	@ManyToOne
	@JoinColumn(name = "user_num")
	private User_info user_info;


//getter, setter
/*
	public String getLanguage_name() {
		return language_name;
	}

	public void setLanguage_name(String language_name) {
		this.language_name = language_name;
	}

	public String getLanguageID() {
		return language_ID;
	}
	public void setLanguageID(String language_ID) {
		this.language_ID = language_ID;
	}
	
	public int getLanguageScore() {
		return language_score;
	}
	public void setLanguageScore(int languageScore) {
		this.language_score = language_score;
	}
	
	public String getLanguageGrade() {
		return language_grade;
	}
	public void setLanguageGrade(String language_grade) {
		this.language_grade = language_grade;
	}
	
	public Date getLanguageDate() {
		return language_date;
	}
	public void setLanguageDate(Date language_date) {
		this.language_date = language_date;
	}

	public String getUser_num() {
		return user_num;
	}

	public void setUser_num(String user_num) {
		this.user_num = user_num;
	}

 */
}
