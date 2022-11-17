package com.softwify.safetynetalert.repository;

import com.softwify.safetynetalert.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonDAO {
    List<Person> findAll();

    Optional<Person> findByFirstnameAndLastname(String firstName, String lastName);
}
