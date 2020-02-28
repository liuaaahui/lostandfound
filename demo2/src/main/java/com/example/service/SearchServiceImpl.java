package com.example.service;

import com.example.entity.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addSearch(Search search) {
        String sql = "insert into search (spot,definiteSpot,kind,goodsname,selectdata,name,phonenumber,wechat,reward,remark,img,time) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,search.getSpot(),search.getDefiniteSpot(),search.getKind(),search.getGoodsname(),search.getSelectdata(),search.getName(),search.getPhonenumber(),search.getWechat(),search.getReward(),search.getRemark(),search.getImg(),search.getTime());
    }

    @Override
    public List<Map<String, Object>> getAllSearch() {
        String sql = "select * from search";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public Search getSearchbyID(int id) {
        String sql = "select * from search where id = ? ";
        List<Search> searchList = jdbcTemplate.query(sql,new Object[]{id}, new SearchRowMapper());
        Search search = null;
        if(!searchList.isEmpty()){
            search = searchList.get(0);
        }
        return search;
    }
}

class SearchRowMapper implements RowMapper<Search> {

    @Override
    public Search mapRow(ResultSet resultSet, int i) throws SQLException {
        Search search = new Search();
        search.setId(resultSet.getInt("id"));
        search.setDefiniteSpot(resultSet.getString("definiteSpot"));
        search.setGoodsname(resultSet.getString("goodsname"));
        search.setImg(resultSet.getString("img"));
        search.setKind(resultSet.getString("kind"));
        search.setName(resultSet.getString("name"));
        search.setPhonenumber(resultSet.getString("phonenumber"));
        search.setRemark(resultSet.getString("remark"));
        search.setReward(resultSet.getString("reward"));
        search.setSelectdata(resultSet.getString("selectdata"));
        search.setSpot(resultSet.getString("spot"));
        search.setTime(resultSet.getString("time"));
        search.setWechat(resultSet.getString("wechat"));
        return search;
    }
}
