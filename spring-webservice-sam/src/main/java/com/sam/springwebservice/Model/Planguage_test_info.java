package com.sam.springwebservice.Model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/*
 *@Author : Nuri
 *@Date : 2019.05.04
 *@Description : planguage_test_info table object  //주력언어 테스트 정보
 */

@Getter
@Setter
@Entity
@Table(name = "planguage_test_info")
public class Planguage_test_info {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String test_ID;
    @Column
    private String planguage_name;
    @Column
    private String test_Q;
    @Column
    private String test_A;
//    @Column
//    private String test_level;
    @Column
    private Integer test_grade;



//getter, setter
/*

    public String getTest_ID() {
        return test_ID;
    }

    public void setTest_ID(String test_ID) {
        this.test_ID = test_ID;
    }

    public String getPlanguage_name() {
        return planguage_name;
    }

    public void setPlanguage_name(String planguage_name) {
        this.planguage_name = planguage_name;
    }

    public String getTest_Q() {
        return test_Q;
    }

    public void setTest_Q(String test_Q) {
        this.test_Q = test_Q;
    }

    public String getTest_A() {
        return test_A;
    }

    public void setTest_A(String test_A) {
        this.test_A = test_A;
    }

    public String getTest_level() {
        return test_level;
    }

    public void setTest_level(String test_level) {
        this.test_level = test_level;
    }

 */
}
