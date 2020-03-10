package com.example.controller;

import com.example.entity.Admin;
import com.example.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService service;

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public List<Admin> login(@RequestBody Admin admin){
        return service.isHasAdmin(admin);
    }
}
