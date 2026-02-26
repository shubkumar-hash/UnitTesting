package com.example.UnitTesting.PersonRepoTest;

import com.example.UnitTesting.model.Person;
import com.example.UnitTesting.repo.PersonRepo;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PersonRepoTest {

    @Autowired
    private PersonRepo personRepo;

    @Test
    void testExistsById() {
        Person person = new Person(null, "Aman", "Ranchi");
        Person savedPerson = personRepo.save(person);
        boolean exists = personRepo.existsById(savedPerson.getId());
        assertThat(exists).isTrue();
    }
}