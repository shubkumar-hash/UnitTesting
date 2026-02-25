package com.example.UnitTesting.service;

import com.example.UnitTesting.model.Person;
import com.example.UnitTesting.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public List<Person> getAllPerson(){
        return personRepo.findAll();
    }
}
