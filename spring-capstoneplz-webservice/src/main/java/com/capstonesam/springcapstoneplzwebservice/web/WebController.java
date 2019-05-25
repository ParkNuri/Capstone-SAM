package com.capstonesam.springcapstoneplzwebservice.web;

import com.capstonesam.springcapstoneplzwebservice.domain.Login.User_info;
import com.capstonesam.springcapstoneplzwebservice.domain.Login.User_info_Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class WebController {

    private User_info_Repository user_info_repository;
    //첫화면 로그인
    @GetMapping("/")
    public String login(){
        return "login";
    }

    @GetMapping("/newsam")
    public String stdMain(){
        return "newsam";
    }

    @GetMapping("/newmanager")
    public String magMain(){
        return "newmanager";
    }

    @PostMapping("/login")
    public String doLogin(String user_num, String user_pw, String user_type){


        Long l =Long.parseLong(user_num);

        if(user_num.equals("") || user_pw.equals("")||user_type.equals("")){
            return "login";
        }
        User_info user_info = user_info_repository.findOne(l);


        if(user_info.getUser_name().equals("")){return "login";}


        if(user_info.getUser_pw().equals(user_pw) && user_info.getUser_type().equals(user_type)){


            if(user_type.equals("학생")){
                return "redirect:/newsam";
            }
            else if(user_type.equals("관리자")){
                return "redirect:/newmanager";
            }
        }

        //session.setAttribute("loginUser", user_info);

    return "login";
    }

}
