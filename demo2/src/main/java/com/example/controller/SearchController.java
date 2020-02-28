package com.example.controller;

import com.example.entity.Search;
import com.example.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private SearchService service;

    @ResponseBody
    @RequestMapping(value = "/addSearch", method = RequestMethod.POST)
    public int addSearch(@RequestBody Search search){
        return service.addSearch(search);
    }

    @RequestMapping(value = "/allSearch", method = RequestMethod.POST)
    public List<Map<String, Object>> allSearch(){
        return service.getAllSearch();
    }

    @GetMapping("/SearchbyID")
    public Search SearchbyID(int id){
        return service.getSearchbyID(id);
    }
}
