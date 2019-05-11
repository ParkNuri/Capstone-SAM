package com.sam.springwebservice.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/*
 *@Author : Nuri
 *@Date : 2019.05.04
 *@Description : user_info table object  //사용자 정보
 */


@Getter
@Setter
@Entity
@Table(name = "user_info")
public class User_info {

    @Id
    private String user_num;
    @Column
    private String user_name;
    @Column
    private String user_pw;
    @Column
    private String user_type;
    @Column
    private String user_admyear;
    @Column
    private String user_major;


    @OneToMany(mappedBy="user_info")    //주력언어 정보
    private List<Planguage_info> pLanguages = new ArrayList<Planguage_info>();

    @OneToMany(mappedBy="user_info")    //공모전 정보
    private List<Contest_info> contests = new ArrayList<Contest_info>();
    @OneToMany(mappedBy="user_info")    //스터디/동아리 정보
    private List<Studyclub_info> studyclubs = new ArrayList<Studyclub_info>();
    @OneToMany(mappedBy="user_info")    //학교프로젝트 정보
    private List<Project_info> projects = new ArrayList<Project_info>();
    @OneToMany(mappedBy="user_info")    //해커톤 정보
    private List<Hackathon_info> hackathons = new ArrayList<Hackathon_info>();

    @OneToMany(mappedBy="user_info")
    private List<Competition_info> competitions = new ArrayList<Competition_info>();
    @OneToMany(mappedBy="user_info")
    private List<Education_info> educations = new ArrayList<Education_info>();
    @OneToMany(mappedBy="user_info")
    private List<Language_info> languages = new ArrayList<>();
    @OneToMany(mappedBy="user_info")
    private List<License_info> licenses = new ArrayList<License_info>();
    @OneToMany(mappedBy="user_info")
    private List<Subject_info> subjects = new ArrayList<Subject_info>();

    @OneToMany(mappedBy="user_info")
    private List<Interest_area_info> interestAreas = new ArrayList<Interest_area_info>();
    @OneToMany(mappedBy="user_info")
    private List<Interest_job_info> interestJobs= new ArrayList<Interest_job_info>();
    @OneToMany(mappedBy="user_info")
    private List<Interest_planguage_info> interestPlanguage = new ArrayList<Interest_planguage_info>();

    public User_info() {}


//getter, setter
/*
    public String getUser_num() {
        return user_num;
    }

    public void setUser_num(String user_num) {
        this.user_num = user_num;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pw() {
        return user_pw;
    }

    public void setUser_pw(String user_pw) {
        this.user_pw = user_pw;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getUser_admyear() { return user_admyear; }

    public void setUser_admyear(String user_admyear) { this.user_admyear = user_admyear; }

    public String getUser_major() {
        return user_major;
    }

    public void setUser_major(String user_major) {
        this.user_major = user_major;
    }
    */
}
