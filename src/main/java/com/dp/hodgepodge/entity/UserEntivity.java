package com.dp.hodgepodge.entity;

import java.io.Serializable;

public class UserEntivity implements Serializable {
    private int user_id;
    private String user_name;
    private String user_phone;
    private String user_pwd;
    private String user_mail;
    private String user_image;
    private String user_sex;
    private String user_desc;
    private int user_state; //状态，0 正常 1 封号

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getuser_name() {
        return user_name;
    }

    public void setuser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getUser_mail() {
        return user_mail;
    }

    public void setUser_mail(String user_mail) {
        this.user_mail = user_mail;
    }

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_desc() {
        return user_desc;
    }

    public void setUser_desc(String user_desc) {
        this.user_desc = user_desc;
    }

    public int getUser_state() {
        return user_state;
    }

    public void setUser_state(int user_state) {
        this.user_state = user_state;
    }

    @Override
    public String toString() {
        return "UserEntivity{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                ", user_mail='" + user_mail + '\'' +
                ", user_image='" + user_image + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_desc='" + user_desc + '\'' +
                ", user_state=" + user_state +
                '}';
    }
}
