package com.example.entity;

public class Money {
    private int id;
    private String spot;
    private String definiteSpot;
    private String kind;
    private String goodsname;
    private String selectdata;
    private String name;
    private String phonenumber;
    private String wechat;
    private String reward;
    private String remark;
    private String img;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpot() {
        return spot;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }

    public String getDefiniteSpot() {
        return definiteSpot;
    }

    public void setDefiniteSpot(String definiteSpot) {
        this.definiteSpot = definiteSpot;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getSelectdata() {
        return selectdata;
    }

    public void setSelectdata(String selectdata) {
        this.selectdata = selectdata;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Money{" +
                "id=" + id +
                ", spot='" + spot + '\'' +
                ", definiteSpot='" + definiteSpot + '\'' +
                ", kind='" + kind + '\'' +
                ", goodsname='" + goodsname + '\'' +
                ", selectdata='" + selectdata + '\'' +
                ", name='" + name + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", wechat='" + wechat + '\'' +
                ", reward='" + reward + '\'' +
                ", remark='" + remark + '\'' +
                ", img='" + img + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
