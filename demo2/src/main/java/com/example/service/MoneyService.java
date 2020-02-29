package com.example.service;

import com.example.entity.Money;

import java.util.List;
import java.util.Map;

public interface MoneyService {
    int addMoney(Money money);
    List<Map<String, Object>> getAllMoney();
    Money getMoneybyID(int id);
    List<Money> getMoneybyuser(String user);
}
