package com.sam.springwebservice.Model;

/*
 *@Author : Nuri
 *@Date : 2019.05.11
 *@Description : recommend_contest_info table object //추천 공모전 정보
 */


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="recommend_contest_info")
public class Recommend_contest_info {

    @Id
    private String recom_contest_ID;
    @Column
    private String recom_contest_name;
    @Column
    private String recom_contest_applyperiod;
    @Column
    private String recom_contest_host;
    @Column
    private String recom_contest_qual;
    @Column
    private String recom_contest_url;
    @Column
    private String recom_contest_area;
    @Column
    private String recom_contest_imgname;
    @Column
    private String recom_contest_imgtype;
    @Column
    private String recom_contest_imgsize;
}
