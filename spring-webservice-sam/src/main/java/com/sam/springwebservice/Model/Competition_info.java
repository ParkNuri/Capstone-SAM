package com.sam.springwebservice.Model;

import java.sql.Date;
import javax.persistence.*;

import lombok.*;

/*
 *@Author : Ayeon
 *@Date : 2019.05.05
 *@Description : Competition_info table object //시험 정보
*/


@Getter
@Setter
@Entity
@Table(name = "competiton_info")
public class Competition_info {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String competition_ID;
	@Column
	private String competition_name;
	@Column
	private int competition_score;
	@Column
	private Date competition_date;

	@ManyToOne
	@JoinColumn(name = "user_num")
	private User_info user_info;



//getter, setter
/*

	public String getCompetitionID() {
		return competition_ID;
	}
	public void setCompetitionID() {
		this.competition_ID = competition_ID;
	}
	
	public String getCompetitionName() {
		return competition_name;
	}
	public void setCompetitionName(String competition_name) {
		this.competition_name = competition_name;
	}
	
	public int getCompetitionScore() {
		return competition_score;
	}
	public void setCompetitionScore(int competition_score) {
		this.competition_score = competition_score;
	}
	
	public Date getCompeititonDate() {
		return competition_date;
	}
	public void setCompetitionDate(Date competition_date) {
		this.competition_date = competition_date;
	}

	public User_info getUser_info() {
		return user_info;
	}

	public void setUser_info(User_info user_info) {
		this.user_info = user_info;
	}

 */
}
