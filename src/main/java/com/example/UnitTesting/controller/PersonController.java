package com.example.UnitTesting.controller;

import com.example.UnitTesting.model.Person;
import com.example.UnitTesting.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    public ResponseEntity<List<Person>> getAllPerson(){
        return new ResponseEntity<>(personService.getAllPerson(), HttpStatus.OK );
    }
}
