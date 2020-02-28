package com.example.service;

import com.example.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addPet(Pet pet) {
        String sql = "insert into pet (spot,definiteSpot,kind,goodsname,selectdata,name,phonenumber,wechat,reward,remark,img,time) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,pet.getSpot(),pet.getDefiniteSpot(),pet.getKind(),pet.getGoodsname(),pet.getSelectdata(),pet.getName(),pet.getPhonenumber(),pet.getWechat(),pet.getReward(),pet.getRemark(),pet.getImg(),pet.getTime());
    }

    @Override
    public List<Map<String, Object>> getAllPet() {
        String sql = "select * from pet";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public Pet getPetbyID(int id) {
        String sql = "select * from pet where id = ? ";
        List<Pet> petList = jdbcTemplate.query(sql,new Object[]{id}, new PetRowMapper());
        Pet pet = null;
        if(!petList.isEmpty()){
            pet = petList.get(0);
        }
        return pet;
    }
}

class PetRowMapper implements RowMapper<Pet> {

    @Override
    public Pet mapRow(ResultSet resultSet, int i) throws SQLException {
        Pet pet = new Pet();
        pet.setId(resultSet.getInt("id"));
        pet.setDefiniteSpot(resultSet.getString("definiteSpot"));
        pet.setGoodsname(resultSet.getString("goodsname"));
        pet.setImg(resultSet.getString("img"));
        pet.setKind(resultSet.getString("kind"));
        pet.setName(resultSet.getString("name"));
        pet.setPhonenumber(resultSet.getString("phonenumber"));
        pet.setRemark(resultSet.getString("remark"));
        pet.setReward(resultSet.getString("reward"));
        pet.setSelectdata(resultSet.getString("selectdata"));
        pet.setSpot(resultSet.getString("spot"));
        pet.setTime(resultSet.getString("time"));
        pet.setWechat(resultSet.getString("wechat"));
        return pet;
    }
}
