package com.example.service;

import com.example.entity.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addReport(Report report) {
        String sql = "insert into report (phonenumber,informer) values (?,?)";
        return jdbcTemplate.update(sql, report.getPhonenumber(),report.getInformer());
    }
}
