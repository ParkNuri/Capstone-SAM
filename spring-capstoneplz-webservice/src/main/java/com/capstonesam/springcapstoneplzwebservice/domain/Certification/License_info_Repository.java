package com.capstonesam.springcapstoneplzwebservice.domain.Certification;

import org.springframework.data.jpa.repository.JpaRepository;

public interface License_info_Repository extends JpaRepository<License_info, Long> {

    long countByUserinfo(Long user_num);
}
