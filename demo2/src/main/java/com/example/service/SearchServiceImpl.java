package com.example.service;

import com.example.entity.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addSearch(Search search) {
        String sql = "insert into search (spot,definiteSpot,kind,goodsname,selectdata,name,phonenumber,wechat,reward,remark,img) values (?,?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,search.getSpot(),search.getDefiniteSpot(),search.getKind(),search.getGoodsname(),search.getSelectdata(),search.getName(),search.getPhonenumber(),search.getWechat(),search.getReward(),search.getRemark(),search.getImg());
    }

    @Override
    public List<Map<String, Object>> getAllSearch() {
        return null;
    }
}
