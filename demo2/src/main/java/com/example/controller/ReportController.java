package com.example.controller;

import com.example.entity.Report;
import com.example.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportService service;

    @ResponseBody
    @RequestMapping(value = "/addReport", method = RequestMethod.POST)
    public int addReport(@RequestBody Report report){
        return service.addReport(report);
    }

    @ResponseBody
    @RequestMapping(value = "/getAllReport", method = RequestMethod.POST)
    public List<Report> getAllReport(){
        return service.getAllReport();
    }

    @GetMapping("/updatebyID")
    public int updatebyID(int id){
        return service.updatebyID(id);
    }

    @GetMapping("/deletebyID")
    public int deletebyID(int id){
        return service.deletebyID(id);
    }
}
