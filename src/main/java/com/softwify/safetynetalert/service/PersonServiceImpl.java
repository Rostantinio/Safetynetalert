package com.softwify.safetynetalert.service;

import com.softwify.safetynetalert.repository.PersonDAO;
import com.softwify.safetynetalert.model.Person;
import org.springframework.stereotype.Service;

import javax.el.PropertyNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService{
    private PersonDAO personDAO;

    public PersonServiceImpl(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }
    @Override
    public List<Person> findAll() {
        return personDAO.findAll();
    }
    @Override
    public Person findByFirstnameAndLastname(String firstname, String lastname) {
        Optional<Person> person = personDAO.findByFirstnameAndLastname(firstname, lastname);
        return person.orElseThrow(PropertyNotFoundException::new);
    }
}
