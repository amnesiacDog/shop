package com.abc.shop.entity;

public class Adress {
    private Integer id;

    private String adressDescription;

    private String phone;

    private String consignename;

    private String location;

    private String isDefault;

    private Byte adresscol;

    private Integer usersId;

    public Adress(Integer id, String adressDescription, String phone, String consignename, String location, String isDefault, Byte adresscol, Integer usersId) {
        this.id = id;
        this.adressDescription = adressDescription;
        this.phone = phone;
        this.consignename = consignename;
        this.location = location;
        this.isDefault = isDefault;
        this.adresscol = adresscol;
        this.usersId = usersId;
    }

    public Adress() {
        super();
    }

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
        this.adressDescription = adressDescription == null ? null : adressDescription.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getConsignename() {
        return consignename;
    }

    public void setConsignename(String consignename) {
        this.consignename = consignename == null ? null : consignename.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    public Byte getAdresscol() {
        return adresscol;
    }

    public void setAdresscol(Byte adresscol) {
        this.adresscol = adresscol;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }
}