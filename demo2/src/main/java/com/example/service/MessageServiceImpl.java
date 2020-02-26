package com.example.service;

import com.example.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addMessage(Message message) {
        String sql = "insert into message (content,author,phone,time) values (?,?,?,?)";
        return jdbcTemplate.update(sql, message.getContent(),message.getAuthor(),message.getPhone(),message.getTime());
    }

    @Override
    public List<Map<String, Object>> getAllMessage() {
        String sql = "select * from message";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }
}
