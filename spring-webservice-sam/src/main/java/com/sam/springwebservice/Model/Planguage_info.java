package com.sam.springwebservice.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/*
 *@Author : Nuri
 *@Date : 2019.05.04
 *@Description : planguage_info table object  //주력언어 정보
*/


@Getter
@Setter
@Entity
@Table(name = "planguage_info")
public class Planguage_info {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String planguage_ID;
    @Column
    private String planguage_name;
    @Column
    private String planguage_level;

    //fk
    @ManyToOne
    @JoinColumn(name = "user_num")
    private User_info user_info;

    public Planguage_info() {}

    public Planguage_info(String planguage_name, String planguage_level){
        this.planguage_name = planguage_name;
        this.planguage_level = planguage_level;
    }



//getter, setter
/*

    public String getPlanguage_ID() {
        return planguage_ID;
    }

    public void setPlanguage_ID(String planguage_ID) {
        this.planguage_ID = planguage_ID;
    }

    public String getPlanguage_name() {
        return planguage_name;
    }

    public void setPlanguage_name(String planguage_name) {
        this.planguage_name = planguage_name;
    }

    public String getPlanguage_level() {
        return planguage_level;
    }

    public void setPlanguage_level(String planguage_level) {
        this.planguage_level = planguage_level;
    }

    public com.sam.springwebservice.Model.User_info getUser_info() {
        return user_info;
    }

    public void setUser_info(com.sam.springwebservice.Model.User_info user_info) {
        this.user_info = user_info;
    }
 */
}
