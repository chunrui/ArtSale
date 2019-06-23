package com.lnsf.entities;

import org.springframework.stereotype.Component;

@Component
public class Reply {
    private Integer reid;

    private Integer cid;

    private String rcontent;

    private Integer ruid;

    private Integer rphoto;

    private Integer touid;

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent == null ? null : rcontent.trim();
    }

    public Integer getRuid() {
        return ruid;
    }

    public void setRuid(Integer ruid) {
        this.ruid = ruid;
    }

    public Integer getRphoto() {
        return rphoto;
    }

    public void setRphoto(Integer rphoto) {
        this.rphoto = rphoto;
    }

    public Integer getTouid() {
        return touid;
    }

    public void setTouid(Integer touid) {
        this.touid = touid;
    }
}