package com.example.service;

import com.example.entity.Message;
import com.example.entity.User;

import java.util.List;
import java.util.Map;

public interface MessageService {
    int addMessage(Message message);
    List<Map<String, Object>> getAllMessage();
}
