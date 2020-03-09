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
    @RequestMapping(value = "/addFirstKindSearch", method = RequestMethod.POST)
    public int addFirstKindSearch(@RequestBody Search search){
        return service.addFirstKindSearch(search);
    }

    @ResponseBody
    @RequestMapping(value = "/addSecondKindSearch", method = RequestMethod.POST)
    public int addSecondKindSearch(@RequestBody Search search){
        return service.addSecondKindSearch(search);
    }

    @RequestMapping(value = "/allSearch", method = RequestMethod.POST)
    public List<Map<String, Object>> allSearch(){
        return service.getAllSearch();
    }

    @RequestMapping(value = "/getSearchbyFirstKind", method = RequestMethod.POST)
    public List<Search> getSearchbyFirstKind(){
        return service.getSearchbyFirstKind();
    }

    @RequestMapping(value = "/getSearchbySecondKind", method = RequestMethod.POST)
    public List<Search> getSearchbySecondKind(){
        return service.getSearchbySecondKind();
    }

    @RequestMapping(value = "/getSearchbyThirdKind", method = RequestMethod.POST)
    public List<Search> getSearchbyThirdKind(){
        return service.getSearchbyThirdKind();
    }

    @RequestMapping(value = "/getSearchbyForthKind", method = RequestMethod.POST)
    public List<Search> getSearchbyForthKind(){
        return service.getSearchbyForthKind();
    }

    @GetMapping("/SearchbyID")
    public Search SearchbyID(int id){
        return service.getSearchbyID(id);
    }

    @GetMapping("/getSearchByuser")
    public List<Search> getSearchbyuser(String user){
        return service.getSearchbyuser(user);
    }

    @GetMapping("/deletebyID")
    public int deletebyID(int id){
        return service.deletebyID(id);
    }

    @GetMapping("/updatebyID")
    public int updatebyID(int id){
        return service.updatebyID(id);
    }
}
