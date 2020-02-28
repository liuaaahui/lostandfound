package com.example.controller;

import com.example.entity.Money;
import com.example.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/money")
public class MoneyController {

    @Autowired
    private MoneyService service;

    @ResponseBody
    @RequestMapping(value = "/addMoney", method = RequestMethod.POST)
    public int addMoney(@RequestBody Money money){
        return service.addMoney(money);
    }

    @RequestMapping(value = "/allMoney", method = RequestMethod.POST)
    public List<Map<String, Object>> allMoney(){
        return service.getAllMoney();
    }

    @GetMapping("/MoneybyID")
    public Money MoneybyID(int id){
        return service.getMoneybyID(id);
    }
}
