package com.example.UnitTesting.PersonServiceTest;

import com.example.UnitTesting.model.Person;
import com.example.UnitTesting.repo.PersonRepo;
import com.example.UnitTesting.service.PersonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepo personRepo;

    @InjectMocks
    private PersonService personService;

    @Test
    void getAllPerson(){
        Person person1 = new Person(1, "Ajay", "Delhi");
        Person person2 = new Person(2, "Geeta", "Mumbai");
        given(personRepo.findAll()).willReturn(List.of(person1, person2));
        List<Person> personList = personService.getAllPerson();
        assertThat(personList).isNotNull();
        assertThat(personList.size()).isEqualTo(2);
        verify(personRepo).findAll();
    }

}
