package com.lnsf.entities;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class Resources {
    private Integer rid;

    private String rname;

    private Integer uid;

    private Date showtime;

    private Integer rphoto;

    private Integer pointpraise;

    private Integer status;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getShowtime() {
        return showtime;
    }

    public void setShowtime(Date showtime) {
        this.showtime = showtime;
    }

    public Integer getRphoto() {
        return rphoto;
    }

    public void setRphoto(Integer rphoto) {
        this.rphoto = rphoto;
    }

    public Integer getPointpraise() {
        return pointpraise;
    }

    public void setPointpraise(Integer pointpraise) {
        this.pointpraise = pointpraise;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}