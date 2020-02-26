package com.example.entity;

public class Report {
    private int id;
    private String phonenumber;
    private String informer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getInformer() {
        return informer;
    }

    public void setInformer(String informer) {
        this.informer = informer;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", phonenumber='" + phonenumber + '\'' +
                ", informer='" + informer + '\'' +
                '}';
    }
}
