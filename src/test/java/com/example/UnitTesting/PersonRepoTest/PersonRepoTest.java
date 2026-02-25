package com.example.UnitTesting.PersonRepoTest;

import com.example.UnitTesting.model.Person;
import com.example.UnitTesting.repo.PersonRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class PersonRepoTest {

    @Autowired
    private PersonRepo personRepo;

    @Test
    public void testExistsById(){
        Person person = new Person(null, "Aman", "Ranchi");
        person = personRepo.save(person);
        boolean exists = personRepo.existsById(person.getId());
        assertThat(exists).isTrue();
    }
}
