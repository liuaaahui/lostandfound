package com.example.service;

import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service
public class UserserviceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getAllUsers() {
        String sql = "select * from user";
        List<User> userList = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<User>(User.class));
        if(null!=userList&&userList.size()>0){
            User user = userList.get(0);
        }
        return userList;

//        return jdbcTemplate.queryForObject("select * from user", String.class);
    }

    @Override
    public List<Map<String, Object>> findAll() {
        String sql = "select * from user";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public User getById(int id) {
        String sql = "select * from user where id = ? ";
        List<User> userList = jdbcTemplate.query(sql,new Object[]{id}, new UserRowMapper());
        User user = null;
        if(!userList.isEmpty()){
            user = userList.get(0);
        }
        return user;
    }

    @Override
    public int addUser(User user) {
        String sql = "insert into user (username, password, nickname) values (?,?,?)";
        return jdbcTemplate.update(sql, user.getUsername(),user.getPassword(),user.getNickname());
    }

    @Override
    public int deleteUser(int id) {
        String sql = "delete from user where id = ?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public int updateUser(User user) {
        String sql = "update user set password=?,username=? where id=?";
        int res = jdbcTemplate.update(sql, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement) throws SQLException {
                preparedStatement.setString(1,user.getPassword());
                preparedStatement.setString(2,user.getUsername());
                preparedStatement.setInt(3,user.getId());
            }
        });
        return res;
    }

    @Override
    public int isHasUserByusername(String username) {
        String sql = "select * from user where username = ?";
        List<User> user = jdbcTemplate.query(sql, new Object[]{username}, new UserRowMapper());
        if (user!=null && user.size()>0){
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public List<User> isHasUser(User user) {
        String sql = "select * from user where username = ? and password = ?";
        List<User> userList = jdbcTemplate.query(sql, new Object[]{user.getUsername(),user.getPassword()}, new UserRowMapper());
        if (userList!=null && userList.size()>0){
            return userList;
        } else {
            return null;
        }
    }
}

class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException{
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setUsername(resultSet.getString("username"));
        user.setPassword(resultSet.getString("password"));
        user.setNickname(resultSet.getString("nickname"));
        return user;
    }
}
