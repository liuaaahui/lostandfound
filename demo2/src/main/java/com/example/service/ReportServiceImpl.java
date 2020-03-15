package com.example.service;

import com.example.entity.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Report> getAllReport() {
        String sql = "select * from report where finish = '0'";
        List<Report> reportList = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<Report>(Report.class));
        if(null!=reportList&&reportList.size()>0){
            Report report = reportList.get(0);
        }
        return reportList;
    }

    @Override
    public int addReport(Report report) {
        String sql = "insert into report (phonenumber,informer,time) values (?,?,?)";
        return jdbcTemplate.update(sql, report.getPhonenumber(),report.getInformer(),report.getTime());
    }

    @Override
    public int updatebyID(int id) {
        String sql = "update report set finish = '1' where id = ?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public int deletebyID(int id) {
        String sql = "delete from report where id = ?";
        return jdbcTemplate.update(sql,id);
    }
}
