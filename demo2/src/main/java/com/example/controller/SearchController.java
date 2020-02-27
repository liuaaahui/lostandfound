package com.example.controller;

import com.example.entity.Message;
import com.example.entity.Search;
import com.example.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
