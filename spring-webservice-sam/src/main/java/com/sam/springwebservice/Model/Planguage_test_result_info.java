package com.sam.springwebservice.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/*
 *@Author : Nuri
 *@Date : 2019.05.04
 *@Description : planguage_test_result_info table object  //주력언어 테스트 결과 정보
 */

@Getter
@Setter
@Entity
@Table(name="planguage_test_result_info")
public class Planguage_test_result_info {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String test_result_ID;
    @Column
    private Integer test_score;
    //fk
    @ManyToOne
    @JoinColumn(name = "planguage_ID")
    private Planguage_info planguage_info;
    @ManyToOne
    @JoinColumn(name = "test_ID")
    private Planguage_test_info planguage_test_info;
    @ManyToOne
    @JoinColumn(name="user_num")
    private User_info user_info;


//getter, setter
/*

    public Integer getTest_score() {
        return test_score;
    }

    public void setTest_score(Integer test_score) {
        this.test_score = test_score;
    }
*/
}
