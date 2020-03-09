package com.example.service;

import com.example.entity.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
    public int addFirstKindSearch(Search search) {
        String sql = "insert into search (spot,definiteSpot,kindOrSex,fillname,title,selectdata,contact,phonenumber,wechat,reward,remark,img,time,kind,user) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,search.getSpot(),search.getDefiniteSpot(),search.getKindOrSex(),search.getFillname(),search.getTitle(),search.getSelectdata(),search.getContact(),search.getPhonenumber(),search.getWechat(),search.getReward(),search.getRemark(),search.getImg(),search.getTime(),search.getKind(),search.getUser());
    }

    @Override
    public int addSecondKindSearch(Search search) {
        String sql = "insert into search (spot,definiteSpot,kindOrSex,fillname,personage,title,selectdata,contact,phonenumber,wechat,reward,remark,img,time,kind,user) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,search.getSpot(),search.getDefiniteSpot(),search.getKindOrSex(),search.getFillname(),search.getPersonage(),search.getTitle(),search.getSelectdata(),search.getContact(),search.getPhonenumber(),search.getWechat(),search.getReward(),search.getRemark(),search.getImg(),search.getTime(),search.getKind(),search.getUser());
    }

    @Override
    public List<Map<String, Object>> getAllSearch() {
        String sql = "select * from search";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public List<Search> getSearchbyFirstKind() {
        String sql = "select * from search where kind = '失物招领' ";
        List<Search> searchList = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<Search>(Search.class));
        if(null!=searchList&&searchList.size()>0){
            Search search = searchList.get(0);
        }
        return searchList;
    }

    @Override
    public List<Search> getSearchbySecondKind() {
        String sql = "select * from search where kind = '寻物启事' ";
        List<Search> searchList = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<Search>(Search.class));
        if(null!=searchList&&searchList.size()>0){
            Search search = searchList.get(0);
        }
        return searchList;
    }

    @Override
    public List<Search> getSearchbyThirdKind() {
        String sql = "select * from search where kind = '寻宠启事' ";
        List<Search> searchList = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<Search>(Search.class));
        if(null!=searchList&&searchList.size()>0){
            Search search = searchList.get(0);
        }
        return searchList;
    }

    @Override
    public List<Search> getSearchbyForthKind() {
        String sql = "select * from search where kind = '寻人启事' ";
        List<Search> searchList = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<Search>(Search.class));
        if(null!=searchList&&searchList.size()>0){
            Search search = searchList.get(0);
        }
        return searchList;
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

    @Override
    public List<Search> getSearchbyuser(String user) {
        String sql = "select * from search where user = ? ";
        List<Search> searchList = jdbcTemplate.query(sql, new Object[]{user}, new BeanPropertyRowMapper<Search>(Search.class));
        if(null!=searchList&&searchList.size()>0){
            Search search = searchList.get(0);
        }
        return searchList;
    }

    @Override
    public int deletebyID(int id) {
        String sql = "delete from search where id = ?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public int updatebyID(int id) {
        String sql = "update search set finish = '已完成' where id = ?";
        return jdbcTemplate.update(sql,id);
    }
}

class SearchRowMapper implements RowMapper<Search> {

    @Override
    public Search mapRow(ResultSet resultSet, int i) throws SQLException {
        Search search = new Search();
        search.setId(resultSet.getInt("id"));
        search.setDefiniteSpot(resultSet.getString("definiteSpot"));
        search.setFillname(resultSet.getString("fillname"));
        search.setImg(resultSet.getString("img"));
        search.setKind(resultSet.getString("kind"));
        search.setContact(resultSet.getString("contact"));
        search.setPhonenumber(resultSet.getString("phonenumber"));
        search.setRemark(resultSet.getString("remark"));
        search.setReward(resultSet.getString("reward"));
        search.setSelectdata(resultSet.getString("selectdata"));
        search.setSpot(resultSet.getString("spot"));
        search.setTime(resultSet.getString("time"));
        search.setWechat(resultSet.getString("wechat"));
        search.setUser(resultSet.getString("user"));
        search.setTitle(resultSet.getString("title"));
        search.setPersonage(resultSet.getString("personage"));
        search.setKindOrSex(resultSet.getString("kindOrSex"));
        search.setFinish(resultSet.getString("finish"));
        return search;
    }
}
