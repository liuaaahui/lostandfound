package com.example.service;

import com.example.entity.Person;
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
public class PersonServiceImpl implements PersonService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addPerson(Person person) {
        String sql = "insert into person (spot,definiteSpot,sex,personname,personage,selectdata,name,phonenumber,wechat,reward,remark,img,time,user,title) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,person.getSpot(),person.getDefiniteSpot(),person.getSex(),person.getPersonname(),person.getPersonage(),person.getSelectdata(),person.getName(),person.getPhonenumber(),person.getWechat(),person.getReward(),person.getRemark(),person.getImg(),person.getTime(),person.getUser(),person.getTitle());

    }

    @Override
    public List<Map<String, Object>> getAllPerson() {
        String sql = "select * from person";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public Person getPersonbyID(int id) {
        String sql = "select * from person where id = ? ";
        List<Person> personList = jdbcTemplate.query(sql,new Object[]{id}, new PersonRowMapper());
        Person person = null;
        if(!personList.isEmpty()){
            person = personList.get(0);
        }
        return person;
    }

    @Override
    public List<Person> getPersonbyuser(String user) {
        String sql = "select * from person where user = ? ";
        List<Person> personList = jdbcTemplate.query(sql, new Object[]{user}, new BeanPropertyRowMapper<Person>(Person.class));
        if(null!=personList&&personList.size()>0){
            Person person = personList.get(0);
        }
        return personList;
    }
}


class PersonRowMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();
        person.setId(resultSet.getInt("id"));
        person.setDefiniteSpot(resultSet.getString("definiteSpot"));
        person.setPersonname(resultSet.getString("personname"));
        person.setPersonage(resultSet.getString("personage"));
        person.setImg(resultSet.getString("img"));
        person.setSex(resultSet.getString("sex"));
        person.setName(resultSet.getString("name"));
        person.setPhonenumber(resultSet.getString("phonenumber"));
        person.setRemark(resultSet.getString("remark"));
        person.setReward(resultSet.getString("reward"));
        person.setSelectdata(resultSet.getString("selectdata"));
        person.setSpot(resultSet.getString("spot"));
        person.setTime(resultSet.getString("time"));
        person.setWechat(resultSet.getString("wechat"));
        person.setUser(resultSet.getString("user"));
        person.setTitle(resultSet.getString("title"));
        return person;
    }
}
