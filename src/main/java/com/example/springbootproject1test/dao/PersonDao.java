package com.example.springbootproject1test.dao;

import com.example.springbootproject1test.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person){
        UUID id=UUID.randomUUID();
        return insertPerson(id,person);
    }
    List<Person> selectAllPeople();
Optional<Person> selectPersonById(UUID id);
    int deletePersonById(UUID id);
        int updatePersonById(UUID id,Person person);

}
