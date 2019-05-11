package com.sam.springwebservice.Repository;

import com.sam.springwebservice.Model.pLanguage_info;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PLanguage_infoRepository extends CrudRepository<PLanguage_infoRepository, String> {  //CrudRepository<,?>
    //List<pLanguage_info> findBy
}
