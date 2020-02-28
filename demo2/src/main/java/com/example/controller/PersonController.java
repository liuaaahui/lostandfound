package com.example.controller;

import com.example.entity.Person;
import com.example.entity.Pet;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService service;

    @ResponseBody
    @RequestMapping(value = "/addPerson", method = RequestMethod.POST)
    public int addPerson(@RequestBody Person person){
        return service.addPerson(person);
    }

    @RequestMapping(value = "/allPerson", method = RequestMethod.POST)
    public List<Map<String, Object>> allPerson(){
        return service.getAllPerson();
    }

    @GetMapping("/PersonbyID")
    public Person PersonbyID(int id){
        return service.getPersonbyID(id);
    }
}
