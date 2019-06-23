package com.lnsf.entities;

import org.springframework.stereotype.Component;

@Component
public class Order {
    private Integer oid;

    private Integer uid;

    private String status;

    private Integer aid;

    private Integer anum;

    private Double total;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getAnum() {
        return anum;
    }

    public void setAnum(Integer anum) {
        this.anum = anum;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}