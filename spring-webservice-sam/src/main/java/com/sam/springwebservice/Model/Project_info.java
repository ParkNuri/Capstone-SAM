package com.sam.springwebservice.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


/*
 *@Author : Nuri
 *@Date : 2019.05.04
 *@Description : project_info table object //학교 프로젝트 정보
 */


@Getter
@Setter
@Entity
@Table(name="project_info")
public class Project_info {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String project_ID;

    @Column
    private String subject_ID;
    @Column
    private String project_topic;
    @Column
    private String planguage_name;

    //FK
    @ManyToOne
    @JoinColumn(name="user_num")
    private User_info user_info;

    //getter, setter
/*
    public String getProject_ID() { return project_ID; }

    public void setProject_ID(String project_ID) { this.project_ID = project_ID; }

    public String getSubject_ID() { return subject_ID; }

    public void setSubject_ID(String subject_ID) { this.subject_ID = subject_ID; }

    public String getProject_topic() { return project_topic; }

    public void setProject_topic(String project_topic) { this.project_topic = project_topic; }

    public String getPlanguage_name() { return planguage_name; }

    public void setPlanguage_name(String planguage_name) { this.planguage_name = planguage_name; }

    public User_info getUser_info() {
        return user_info;
    }

    public void setUser_info(User_info user_info) {
        this.user_info = user_info;
    }*/
}
