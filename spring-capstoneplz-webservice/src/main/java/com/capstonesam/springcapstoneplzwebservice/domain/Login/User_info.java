package com.capstonesam.springcapstoneplzwebservice.domain.Login;

import com.capstonesam.springcapstoneplzwebservice.domain.Certification.Competition_info;
import com.capstonesam.springcapstoneplzwebservice.domain.Certification.Language_info;
import com.capstonesam.springcapstoneplzwebservice.domain.Certification.License_info;
import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor //기본 생성자
@Getter
@Entity
public class User_info {
    //@Id
    //@GeneratedValue
    @Id
    private  Long user_num;


    @Column(nullable = false, length = 45)
    private String user_name;
    @Column(nullable = false, length = 45)
    private String user_pw;
    @Column(nullable = false, length = 10)
    private String user_admyear;
    @Column(nullable = false, length = 30)
    private String user_major;
    @Column(nullable = false, length = 45)
    private String user_type;

    @OneToMany(mappedBy = "userinfo")
    private List<Competition_info> competition_infos;

    @OneToMany(mappedBy = "userinfo")
    private List<Language_info> language_infos;

    @OneToMany(mappedBy = "userinfo")
    private List<License_info> license_infos;


    public boolean addCompetition(Competition_info competition_info){
        if(competition_infos == null)
            competition_infos = new ArrayList<>();

        return this.competition_infos.add(competition_info);
    }

    public boolean addLanguage(Language_info language_info){
        if(language_infos == null)
            language_infos = new ArrayList<>();

        return this.language_infos.add(language_info);
    }

    public boolean addLicense(License_info license_info){
        if(license_infos == null)
            license_infos = new ArrayList<>();

        return this.license_infos.add(license_info);
    }



    @Builder//construct 생성자??
    public User_info(Long user_num, String user_name, String user_pw, String user_admyear, String user_major, String user_type) {
        this.user_num=user_num;
        this.user_name= user_name;
        this.user_pw = user_pw;
        this.user_admyear = user_admyear;
        this.user_major = user_major;
        this.user_type = user_type;

    }
}
