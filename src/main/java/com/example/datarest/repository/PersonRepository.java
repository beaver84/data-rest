package com.example.datarest.repository;

import com.example.datarest.domain.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
    @RestResource(path = "firstname")
    List<Person> findByFirstName(@Param("firstname") String firstName);

    @RestResource(path = "onebyone")
    Person save(@RequestBody Person person);
}
