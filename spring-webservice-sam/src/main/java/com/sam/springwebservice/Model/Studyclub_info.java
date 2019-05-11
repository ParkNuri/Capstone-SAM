package com.sam.springwebservice.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


/*
 *@Author : Nuri
 *@Date : 2019.05.04
 *@Description : studyclub_info table object  //스터디/동아리 정보
 */


@Getter
@Setter
@Entity
@Table(name="studyclub_info")
public class Studyclub_info {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String studyclub_ID;

    @Column
    private String studyclub_topic;
    @Column
    private String planguage_name;
    //fk
    @ManyToOne
    @JoinColumn(name="user_num")
    private User_info user_info;


//getter, setter
/*
    public String getStudyclub_ID() {
        return studyclub_ID;
    }

    public void setStudyclub_ID(String studyclub_ID) {
        this.studyclub_ID = studyclub_ID;
    }

    public String getStudyclub_topic() {
        return studyclub_topic;
    }

    public void setStudyclub_topic(String studyclub_topic) {
        this.studyclub_topic = studyclub_topic;
    }

    public String getPlanguage_name() {
        return planguage_name;
    }

    public void setPlanguage_name(String planguage_name) {
        this.planguage_name = planguage_name;
    }

    public com.sam.springwebservice.Model.User_info getUser_info() {
        return user_info;
    }

    public void setUser_info(com.sam.springwebservice.Model.User_info user_info) {
        this.user_info = user_info;
    }
*/
}