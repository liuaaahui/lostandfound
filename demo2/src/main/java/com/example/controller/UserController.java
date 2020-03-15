package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @ResponseBody
    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public int regist(@RequestBody User user){
        if(service.isHasUserByusername(user.getUsername()) == 0){
            return service.addUser(user);
        }
        return 0;
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public List<User> login(@RequestBody User user){
        return service.isHasUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/showUser", method = RequestMethod.POST)
    public List<User> showUser(){
        return service.getAllUsers();
    }

    @GetMapping("/deleteUserbyID")
    public int deleteUserbyID(int id){
        return service.deleteUser(id);
    }

    @GetMapping("/updatebyID")
    public int updatebyID(String username){
        return service.updatebyID(username);
    }
}
