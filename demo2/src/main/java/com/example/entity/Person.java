package com.example.entity;

public class Person {
    private int id;
    private String spot;
    private String definiteSpot;
    private String sex;
    private String personname;
    private String personage;
    private String selectdata;
    private String name;
    private String phonenumber;
    private String wechat;
    private String reward;
    private String remark;
    private String img;
    private String time;
    private String user;
    private String title;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public String getPersonage() {
        return personage;
    }

    public void setPersonage(String personage) {
        this.personage = personage;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", spot='" + spot + '\'' +
                ", definiteSpot='" + definiteSpot + '\'' +
                ", sex='" + sex + '\'' +
                ", personname='" + personname + '\'' +
                ", personage='" + personage + '\'' +
                ", selectdata='" + selectdata + '\'' +
                ", name='" + name + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", wechat='" + wechat + '\'' +
                ", reward='" + reward + '\'' +
                ", remark='" + remark + '\'' +
                ", img='" + img + '\'' +
                ", time='" + time + '\'' +
                ", user='" + user + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
