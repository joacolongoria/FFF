package com.neutrinosys.peopledbweb.data;

import com.neutrinosys.peopledbweb.biz.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

   @Query(nativeQuery = true, value = "SELECT PHOTO_FILENAME FROM PERSON WHERE ID IN :ids")
    public Set<String> findFilenamesByIds(@Param("ids") Iterable<Long> ids);

}
