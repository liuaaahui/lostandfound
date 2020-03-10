package com.example.service;

import com.example.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Admin> isHasAdmin(Admin admin) {
        String sql = "select * from admin where username = ? and password = ?";
        List<Admin> adminList = jdbcTemplate.query(sql, new Object[]{admin.getUsername(),admin.getPassword()}, new AdminRowMapper());
        if (adminList!=null && adminList.size()>0){
            return adminList;
        } else {
            return null;
        }
    }
}

class AdminRowMapper implements RowMapper<Admin> {

    @Override
    public Admin mapRow(ResultSet resultSet, int i) throws SQLException {
        Admin admin = new Admin();
        admin.setId(resultSet.getInt("id"));
        admin.setUsername(resultSet.getString("username"));
        admin.setPassword(resultSet.getString("password"));
        return admin;
    }
}