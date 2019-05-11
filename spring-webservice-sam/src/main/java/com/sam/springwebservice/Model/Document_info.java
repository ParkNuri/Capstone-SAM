package com.sam.springwebservice.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;


/*
 *@Author : Nuri
 *@Date : 2019.05.04
 *@Description : document_info table object  //증빙서류정보
 */


@Getter
@Setter
@Entity
@Table(name="document_info")
public class Document_info {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String document_ID;

    @OneToOne
    @JoinColumns({@JoinColumn (name="document_type_ID")})
    private String document_type_ID;

    @Column
    private String document_type;
    @Column
    private String signup_ID;
    @Column
    private Date signup_date;
    @Column
    private String file_type;
    @Column
    private String file_name;
    @Column
    private Integer file_size;

    @ManyToOne
    @JoinColumn(name = "user_num")
    private User_info user_info;

//getter, setter
/*

    public String getDocument_ID() { return document_ID; }

    public void setDocument_ID(String document_ID) { this.document_ID = document_ID; }

    public String getDocument_type_ID() { return document_type_ID; }

    public void setDocument_type_ID(String document_type_ID) { this.document_type_ID = document_type_ID; }

    public String getDocument_type() { return document_type; }

    public void setDocument_type(String document_type) { this.document_type = document_type; }

    public String getSignup_ID() { return signup_ID; }

    public void setSignup_ID(String signup_ID) { this.signup_ID = signup_ID; }

    public Date getSignup_date() { return signup_date; }

    public void setSignup_date(Date signup_date) { this.signup_date = signup_date; }

    public String getFile_name() { return file_name; }

    public void setFile_name(String file_name) { this.file_name = file_name; }

    public String getFile_type() { return file_type; }

    public void setFile_type(String file_type) { this.file_type = file_type; }

    public Integer getFile_size() { return file_size; }

    public void setFile_size(Integer file_size) { this.file_size = file_size; }

 */
}
