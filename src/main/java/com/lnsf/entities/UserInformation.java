package com.lnsf.entities;

import org.springframework.stereotype.Component;

@Component
public class UserInformation {
    private Integer uid;

    private String tel;

    private String email;

    private String address;

    private Integer headportrait;

    private Double money;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getHeadportrait() {
        return headportrait;
    }

    public void setHeadportrait(Integer headportrait) {
        this.headportrait = headportrait;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}