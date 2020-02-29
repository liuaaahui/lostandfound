package com.example.service;

import com.example.entity.Search;

import java.util.List;
import java.util.Map;

public interface SearchService {
    int addSearch(Search search);
    List<Map<String, Object>> getAllSearch();
    Search getSearchbyID(int id);
    List<Search> getSearchbyuser(String user);
}
