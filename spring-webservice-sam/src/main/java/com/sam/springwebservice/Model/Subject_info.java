package com.sam.springwebservice.Model;

import javax.persistence.*;

import com.sam.springwebservice.Model.User_info;
import lombok.*;

/*
 *@Author : Ayeon
 *@Date : 2019.05.05
 *@Description : Subject_info table object //이수성적 정보
*/
@Getter
@Setter
@Entity
@Table(name = "subject_info")
public class Subject_info {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String subject_ID = ""; //이수과목ID
	@Column
	private String subject_name = ""; //이수 과목 명
	@Column
	private double subject_grade = 0; //과목별 평점
	@Column
	private double subject_credit = 0; //과목별 학점
	@Column
	private String subject_option = ""; //전필,전선

	@ManyToOne
	@JoinColumn(name = "user_num")
	private User_info user_info;

	//getter, setter
/*
	public String getSubjectID() {
		return subject_ID;
	}
	public void setSubjectID(String subject_ID) {
		this.subject_ID = subject_ID;
	}
	
	public String getSubjectName() {
		return subject_name;
	}
	public void setSubjectName(String subject_name) {
		this.subject_name = subject_name;
	}
	
	public double getSubjectGrade () {
		return subject_grade;
	}
	public void setSubjectGrade(double subject_grade) {
		this.subject_grade = subject_grade;
	}
	
	public double getSubjectCredit() {
		return subject_credit;
	}
	public void setSubjectCredit(double subject_credit) {
		this.subject_credit = subject_credit;
	}
	
	public String getSubjectOption() {
		return subject_option;
	}
	public void setSubjectOption(String subject_option) {
		this.subject_option = subject_option;
	}

	public User_info getUser_info() {
		return user_info;
	}

	public void setUser_info(User_info user_info) {
		this.user_info = user_info;
	}
*/
}
