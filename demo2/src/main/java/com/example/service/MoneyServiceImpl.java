package com.example.service;

import com.example.entity.Money;
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
public class MoneyServiceImpl implements MoneyService{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addMoney(Money money) {
        String sql = "insert into money (spot,definiteSpot,kind,goodsname,selectdata,name,phonenumber,wechat,reward,remark,img,time,user,title) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,money.getSpot(),money.getDefiniteSpot(),money.getKind(),money.getGoodsname(),money.getSelectdata(),money.getName(),money.getPhonenumber(),money.getWechat(),money.getReward(),money.getRemark(),money.getImg(),money.getTime(),money.getUser(),money.getTitle());
    }

    @Override
    public List<Map<String, Object>> getAllMoney() {
        String sql = "select * from money";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public Money getMoneybyID(int id) {
        String sql = "select * from money where id = ? ";
        List<Money> moneyList = jdbcTemplate.query(sql,new Object[]{id}, new MoneyRowMapper());
        Money money = null;
        if(!moneyList.isEmpty()){
            money = moneyList.get(0);
        }
        return money;
    }

    @Override
    public List<Money> getMoneybyuser(String user) {
        String sql = "select * from money where user = ? ";
        List<Money> moneyList = jdbcTemplate.query(sql, new Object[]{user}, new BeanPropertyRowMapper<Money>(Money.class));
        if(null!=moneyList&&moneyList.size()>0){
            Money money = moneyList.get(0);
        }
        return moneyList;
    }
}

class MoneyRowMapper implements RowMapper<Money> {

    @Override
    public Money mapRow(ResultSet resultSet, int i) throws SQLException {
        Money money = new Money();
        money.setId(resultSet.getInt("id"));
        money.setDefiniteSpot(resultSet.getString("definiteSpot"));
        money.setGoodsname(resultSet.getString("goodsname"));
        money.setImg(resultSet.getString("img"));
        money.setKind(resultSet.getString("kind"));
        money.setName(resultSet.getString("name"));
        money.setPhonenumber(resultSet.getString("phonenumber"));
        money.setRemark(resultSet.getString("remark"));
        money.setReward(resultSet.getString("reward"));
        money.setSelectdata(resultSet.getString("selectdata"));
        money.setSpot(resultSet.getString("spot"));
        money.setTime(resultSet.getString("time"));
        money.setWechat(resultSet.getString("wechat"));
        money.setUser(resultSet.getString("user"));
        money.setTitle(resultSet.getString("title"));
        return money;
    }
}
