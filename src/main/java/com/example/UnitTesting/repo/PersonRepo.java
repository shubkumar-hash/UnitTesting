package com.example.UnitTesting.repo;

import com.example.UnitTesting.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person,Integer> {
    boolean existsById(Integer id);
}
