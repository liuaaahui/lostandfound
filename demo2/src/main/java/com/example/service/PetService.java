package com.example.service;

import com.example.entity.Pet;

import java.util.List;
import java.util.Map;

public interface PetService {
    int addPet(Pet pet);
    List<Map<String, Object>> getAllPet();
    Pet getPetbyID(int id);
}
