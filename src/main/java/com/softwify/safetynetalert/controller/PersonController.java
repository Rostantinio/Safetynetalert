package com.softwify.safetynetalert.controller;

import com.softwify.safetynetalert.model.Person;
import com.softwify.safetynetalert.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/persons")
public class PersonController {
    @Autowired
    private  PersonService personService;

    @GetMapping
    public List<Person> findAll() {
        return personService.findAll();
    }

    @GetMapping (value = "/{firstName}/{lastName}")
    public ResponseEntity<Person> findByFirstnameAndLastname(@PathVariable String firstname, @PathVariable String lastname) {
        try {
            Person person = personService.findByFirstnameAndLastname(firstname, lastname);
            return ResponseEntity.ok(person);
        } catch (Exception exception) {
            return ResponseEntity.notFound().build();
        }
    }
}
