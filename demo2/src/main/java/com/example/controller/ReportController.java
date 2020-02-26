package com.example.controller;

import com.example.entity.Report;
import com.example.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
