package com.sam.springwebservice.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/*
 *@Author : Nuri
 *@Date : 2019.05.04
 *@Description : hackathon_info table object //해커톤 정보
 */


@Getter
@Setter
@Entity
@Table(name="hackathon_info")
public class Hackathon_info {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String hack_ID;

    @Column
    private String hack_topic;
    @Column
    private String hack_record;
    @Column
    private String hack_doc_ID;
    @ManyToOne
    @JoinColumn(name="user_num")
    private User_info user_info;



//getter, setter
/*
    public String getHack_ID() { return hack_ID; }

    public void setHack_ID(String hack_ID) { this.hack_ID = hack_ID; }

    public String getHack_topic() { return hack_topic; }

    public void setHack_topic(String hack_topic) { this.hack_topic = hack_topic; }

    public String getHack_record() { return hack_record; }

    public void setHack_record(String hack_record) { this.hack_record = hack_record; }

    public String getHack_doc_ID() { return hack_doc_ID; }

    public void setHack_doc_ID(String hack_doc_ID) { this.hack_doc_ID = hack_doc_ID; }

    public com.sam.springwebservice.Model.User_info getUser_info() { return user_info; }

    public void setUser_info(com.sam.springwebservice.Model.User_info user_info) { this.user_info = user_info; }

 */
}
