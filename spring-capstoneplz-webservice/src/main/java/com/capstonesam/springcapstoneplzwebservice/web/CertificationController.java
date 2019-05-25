package com.capstonesam.springcapstoneplzwebservice.web;

import com.capstonesam.springcapstoneplzwebservice.DTO.Logindto.CompetitionDto;
import com.capstonesam.springcapstoneplzwebservice.DTO.Logindto.LanguageDto;
import com.capstonesam.springcapstoneplzwebservice.DTO.Logindto.LicenseDto;
import com.capstonesam.springcapstoneplzwebservice.Service.CertificationPostService;
import com.capstonesam.springcapstoneplzwebservice.domain.Certification.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
public class CertificationController {

    private CertificationPostService certificationPostService;

    @GetMapping("/CertificationMonitoring")
    public String getCertificationInfo() {


        return "main_6_cert";

    }

    @PostMapping("/CertificationMonitoring")
    public String saveCertificationInfo(@RequestBody CompetitionDto cDTO, @RequestBody LanguageDto lanDTO, @RequestBody LicenseDto licDTO){
        certificationPostService.save(cDTO, lanDTO,licDTO);
        return "main_6_cert";
    }


}
