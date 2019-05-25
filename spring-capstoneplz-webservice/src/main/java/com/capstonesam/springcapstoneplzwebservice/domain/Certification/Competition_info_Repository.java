package com.capstonesam.springcapstoneplzwebservice.domain.Certification;

import com.capstonesam.springcapstoneplzwebservice.domain.Login.User_info;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Competition_info_Repository extends JpaRepository<Competition_info, Long> {

    long countByUserinfo(User_info user_info);
}
