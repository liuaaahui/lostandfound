package com.example.entity;

public class Search {
    private int id;
    private String spot;
    private String definiteSpot;
    private String kindOrSex;
    private String fillname;
    private String personage;
    private String title;
    private String selectdata;
    private String contact;
    private String phonenumber;
    private String wechat;
    private String reward;
    private String remark;
    private String img;
    private String time;
    private String kind;
    private String user;
    private String finish;

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

    public String getKindOrSex() {
        return kindOrSex;
    }

    public void setKindOrSex(String kindOrSex) {
        this.kindOrSex = kindOrSex;
    }

    public String getFillname() {
        return fillname;
    }

    public void setFillname(String fillname) {
        this.fillname = fillname;
    }

    public String getPersonage() {
        return personage;
    }

    public void setPersonage(String personage) {
        this.personage = personage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSelectdata() {
        return selectdata;
    }

    public void setSelectdata(String selectdata) {
        this.selectdata = selectdata;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "Search{" +
                "id=" + id +
                ", spot='" + spot + '\'' +
                ", definiteSpot='" + definiteSpot + '\'' +
                ", kindOrSex='" + kindOrSex + '\'' +
                ", fillname='" + fillname + '\'' +
                ", personage='" + personage + '\'' +
                ", title='" + title + '\'' +
                ", selectdata='" + selectdata + '\'' +
                ", contact='" + contact + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", wechat='" + wechat + '\'' +
                ", reward='" + reward + '\'' +
                ", remark='" + remark + '\'' +
                ", img='" + img + '\'' +
                ", time='" + time + '\'' +
                ", kind='" + kind + '\'' +
                ", user='" + user + '\'' +
                ", finish='" + finish + '\'' +
                '}';
    }
}
