package com.capstonesam.springcapstoneplzwebservice.domain.Certification;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Language_info_Repository extends JpaRepository<Language_info, Long> {
    long countByUserinfo(Long user_num);

}
