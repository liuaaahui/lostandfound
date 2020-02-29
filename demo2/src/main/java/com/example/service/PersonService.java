package com.example.service;

import com.example.entity.Person;

import java.util.List;
import java.util.Map;

public interface PersonService {
    int addPerson(Person person);
    List<Map<String, Object>> getAllPerson();
    Person getPersonbyID(int id);
    List<Person> getPersonbyuser(String user);
}
