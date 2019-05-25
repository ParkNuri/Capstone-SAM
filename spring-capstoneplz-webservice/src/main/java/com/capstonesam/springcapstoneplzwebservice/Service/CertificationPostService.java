package com.capstonesam.springcapstoneplzwebservice.Service;

import com.capstonesam.springcapstoneplzwebservice.DTO.Logindto.CompetitionDto;
import com.capstonesam.springcapstoneplzwebservice.DTO.Logindto.LanguageDto;
import com.capstonesam.springcapstoneplzwebservice.DTO.Logindto.LicenseDto;
import com.capstonesam.springcapstoneplzwebservice.domain.Certification.Competition_info_Repository;
import com.capstonesam.springcapstoneplzwebservice.domain.Certification.Language_info_Repository;
import com.capstonesam.springcapstoneplzwebservice.domain.Certification.License_info_Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class CertificationPostService {
    private Competition_info_Repository competition_info_repository;
    private Language_info_Repository language_info_repository;
    private License_info_Repository license_info_repository;

    @Transactional
    public void save(CompetitionDto CDTO, LanguageDto LanDTO, LicenseDto LicDTO){
        competition_info_repository.save(CDTO.toEntity());
        language_info_repository.save(LanDTO.toEntity());
        license_info_repository.save(LicDTO.toEntity());

    }
}
