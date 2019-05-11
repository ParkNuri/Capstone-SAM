package com.sam.springwebservice.Model;

/*
 *@Author : Nuri
 *@Date : 2019.05.11
 *@Description : recommend_intern_info table object //추천 인턴십 정보
 */


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="recommend_intern_info")
public class Recommend_intern_info {

    @Id
    private String recom_intern_ID;
    @Column
    private String recom_intern_comname;
    @Column
    private String recom_intern_cominfo;
    @Column
    private String recom_intern_area;
    @Column
    private String recom_intern_period;
    @Column
    private String recom_intern_qual;

}
