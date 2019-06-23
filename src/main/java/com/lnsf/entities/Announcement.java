package com.lnsf.entities;

import org.springframework.stereotype.Component;
@Component
public class Announcement {
    private Integer anid;

    private String announcement;

    private Integer uid;

    private Integer admin;

    private Integer aid;

    public Integer getAnid() {
        return anid;
    }

    public void setAnid(Integer anid) {
        this.anid = anid;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement == null ? null : announcement.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getAdmin() {
        return admin;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }
}