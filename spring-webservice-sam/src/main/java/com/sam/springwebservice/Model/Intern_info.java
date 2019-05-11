package com.sam.springwebservice.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/*
 *@Author : Nuri
 *@Date : 2019.05.04
 *@Description : intern_info table object  //인턴 정보
 */


@Getter
@Setter
@Entity
@Table(name="intern_info")
public class Intern_info {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String intern_ID;

    @Column
    private String intern_companyName;
    @Column
    private String intern_companyInfo;
    @Column
    private String intern_period;
    @Column
    private String intern_job;
    @Column
    private String intern_area;

    @ManyToOne
    @JoinColumn(name="user_num")
    private User_info user_info;

}
