package com.softwify.safetynetalert.service;

import com.softwify.safetynetalert.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PersonService {
     List<Person> findAll();
     //Optional<Person> findByFirstnameAndLastname(String firstname, String lastname);
     Person findByFirstnameAndLastname(String firstname, String lastname);
}
