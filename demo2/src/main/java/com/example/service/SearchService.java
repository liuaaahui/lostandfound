package com.example.service;

import com.example.entity.Search;
import com.example.entity.User;

import java.util.List;
import java.util.Map;

public interface SearchService {
    int addFirstKindSearch(Search search);
    int addSecondKindSearch(Search search);
    List<Map<String, Object>> getAllSearch();
    List<Search> getSearchbyFirstKind();
    List<Search> getSearchbySecondKind();
    List<Search> getSearchbyThirdKind();
    List<Search> getSearchbyForthKind();
    Search getSearchbyID(int id);
    List<Search> getSearchbyuser(String user);
    int deletebyID(int id);
    int updatebyID(int id);
}
