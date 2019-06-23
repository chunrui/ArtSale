package com.lnsf.entities;

import org.springframework.stereotype.Component;

@Component
public class Photo {
    private Integer pid;

    private String photourl;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl == null ? null : photourl.trim();
    }
}