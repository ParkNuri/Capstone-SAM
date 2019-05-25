package com.capstonesam.springcapstoneplzwebservice.service;

import com.capstonesam.springcapstoneplzwebservice.DTO.Logindto.CompetitionDto;
import com.capstonesam.springcapstoneplzwebservice.DTO.Logindto.LanguageDto;
import com.capstonesam.springcapstoneplzwebservice.DTO.Logindto.LicenseDto;
import com.capstonesam.springcapstoneplzwebservice.Service.CertificationPostService;
import com.capstonesam.springcapstoneplzwebservice.domain.Certification.*;
import com.capstonesam.springcapstoneplzwebservice.domain.Login.User_info;
import com.capstonesam.springcapstoneplzwebservice.domain.Login.User_info_Repository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CertificationPostServiceTest {

    @Autowired
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;


    @Autowired
    private CertificationPostService certificationPostService;

    @Autowired
    private User_info_Repository user_info_repository;

    @Autowired
    private Competition_info_Repository competition_info_repository;
    @Autowired
    private Language_info_Repository language_info_repository;
    @Autowired
    private License_info_Repository license_info_repository;

    @Before
    public void setUp() throws Exception{
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }

 /*   @After
    public void cleanup(){
        entityManager.getTransaction().commit();
        entityManager.close();

        competition_info_repository.deleteAll();
        language_info_repository.deleteAll();
        license_info_repository.deleteAll();

    }
*/
    @Test
    public void Dto데이터가_테이블에_저장된다(){
        java.sql.Date d=java.sql.Date.valueOf("2019-06-22");

        Integer i=101;
        Long l=Long.valueOf(i);

        User_info user_info= new User_info().builder()
                .user_num(l)
                .user_admyear("2015")
                .user_major("컴퓨터공학과")
                .user_name("박누리")
                .user_pw("1234")
                .user_type("학생")
                .build();



        CompetitionDto comdto = CompetitionDto.builder()
                .competition_name("TOPCIT")
                .competition_score(600)
                .competition_date(d)
                .build();

        LanguageDto landto = LanguageDto.builder()
                .language_name("TOEIC")
                .language_grade("800")
                .language_date(d)
                .build();

        LicenseDto licdto = LicenseDto.builder()
                .license_name("정보처리기사")
                .build();


        user_info.addCompetition(comdto.toEntity());
        user_info.addLanguage(landto.toEntity());
        user_info.addLicense(licdto.toEntity());

        comdto.setUser_info(user_info);
        landto.setUser_info(user_info);
        licdto.setUser_info(user_info);

 //       entityManager.persist(user_info);

        user_info_repository.save(user_info);


        certificationPostService.save(comdto, landto, licdto);

        User_info ui= user_info_repository.findAll().get(0);
        Competition_info ci = competition_info_repository.findAll().get(0);
        Language_info lani = language_info_repository.findAll().get(0);
        License_info lici= license_info_repository.findAll().get(0);
        Assert.assertEquals(user_info.getUser_num(), comdto.getUser_info().getUser_num());
    }
}
