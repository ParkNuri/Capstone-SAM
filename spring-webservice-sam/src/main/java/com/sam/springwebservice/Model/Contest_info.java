package com.sam.springwebservice.Model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/*
 *@Author : Nuri
 *@Date : 2019.05.04
 *@Description : contest_info table object  //공모전 정보
 */


@Getter
@Setter
@Entity
@Table(name="contest_info")
public class Contest_info {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String contest_ID;

    @Column
    private String contest_topic;
    @Column
    private String contest_record;
    @Column
    private String contest_doc_ID;
    @Column
    private String planguage_name;
    //fk

    @ManyToOne
    @JoinColumn(name = "user_num")
    private User_info user_info;



//getter, setter
/*
    public String getContest_ID() { return contest_ID; }

    public void setContest_ID(String contest_ID) { this.contest_ID = contest_ID; }

    public String getContest_topic() { return contest_topic; }

    public void setContest_topic(String contest_topic) { this.contest_topic = contest_topic; }

    public String getContest_record() { return contest_record; }

    public void setContest_record(String contest_record) { this.contest_record = contest_record; }

    public String getContest_doc() {
        return contest_doc;
    }

    public void setContest_doc(String contest_doc) {
        this.contest_doc = contest_doc;
    }

    public String getPlanguage_name() { return planguage_name; }

    public void setPlanguage_name(String planguage_name) { this.planguage_name = planguage_name; }

    public com.sam.springwebservice.Model.User_info getUser_info() { return user_info; }

    public void setUser_info(com.sam.springwebservice.Model.User_info user_info) { this.user_info = user_info; }

 */
}
