package com.example.controller;

import com.example.entity.Pet;
import com.example.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetService service;

    @ResponseBody
    @RequestMapping(value = "/addPet", method = RequestMethod.POST)
    public int addPet(@RequestBody Pet pet){
        return service.addPet(pet);
    }

    @RequestMapping(value = "/allPet", method = RequestMethod.POST)
    public List<Map<String, Object>> allPet(){
        return service.getAllPet();
    }

    @GetMapping("/PetbyID")
    public Pet PetbyID(int id){
        return service.getPetbyID(id);
    }
}
