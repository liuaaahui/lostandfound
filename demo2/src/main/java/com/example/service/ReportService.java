package com.example.service;

import com.example.entity.Report;
import java.util.List;

public interface ReportService {
    List<Report> getAllReport();
    int addReport(Report report);
}
