package com.softwify.safetynetalert.repository;

import com.softwify.safetynetalert.model.Person;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class PersonDAOImpl implements PersonDAO{
    private final DataStoreManager dataStoreManager;
    public PersonDAOImpl(DataStoreManager dataStoreManager) {
        this.dataStoreManager = dataStoreManager;
    }

    @Override
    public List<Person> findAll() {
        return dataStoreManager.getPersons();
    }
    @Override
    public Optional<Person> findByFirstnameAndLastname(String firstName, String lastName) {
        List<Person> persons = dataStoreManager.getPersons();
        for (Person person : persons) {
            if (person.getFirstName().equals(firstName) && person.getLastName().equals(lastName)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

}
