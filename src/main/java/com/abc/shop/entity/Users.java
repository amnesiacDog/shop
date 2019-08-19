package com.abc.shop.entity;

import java.util.Date;

public class Users {
    private Integer id;

    private String usersname;

    private String password;

    private String salt;

    private String phone;

    private Integer loginStatus;

    private String img;

    private Date createdTime;

    private Date modifiedTime;

    public Users(Integer id, String usersname, String password, String salt, String phone, Integer loginStatus, String img, Date createdTime, Date modifiedTime) {
        this.id = id;
        this.usersname = usersname;
        this.password = password;
        this.salt = salt;
        this.phone = phone;
        this.loginStatus = loginStatus;
        this.img = img;
        this.createdTime = createdTime;
        this.modifiedTime = modifiedTime;
    }

    public Users() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsersname() {
        return usersname;
    }

    public void setUsersname(String usersname) {
        this.usersname = usersname == null ? null : usersname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}