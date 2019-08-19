package com.abc.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author mjk
 * @since 2019-08-19
 */
public class Adress implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    @TableField("adress_Description")
    private String adressDescription;

    private String phone;

    private String consignename;

    private String location;

    @TableField("is_Default")
    private String isDefault;

    private Integer adresscol;

    private Integer usersId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdressDescription() {
        return adressDescription;
    }

    public void setAdressDescription(String adressDescription) {
        this.adressDescription = adressDescription;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getConsignename() {
        return consignename;
    }

    public void setConsignename(String consignename) {
        this.consignename = consignename;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getAdresscol() {
        return adresscol;
    }

    public void setAdresscol(Integer adresscol) {
        this.adresscol = adresscol;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    @Override
    public String toString() {
        return "Adress{" +
        "id=" + id +
        ", adressDescription=" + adressDescription +
        ", phone=" + phone +
        ", consignename=" + consignename +
        ", location=" + location +
        ", isDefault=" + isDefault +
        ", adresscol=" + adresscol +
        ", usersId=" + usersId +
        "}";
    }
}
