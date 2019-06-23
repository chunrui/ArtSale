package com.lnsf.entities;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class Auction {
    private Integer id;

    private Integer uid;

    private Date starttime;

    private Date endtime;

    private Double startprice;

    private Double finalprice;

    private Integer getuid;

    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Double getStartprice() {
        return startprice;
    }

    public void setStartprice(Double startprice) {
        this.startprice = startprice;
    }

    public Double getFinalprice() {
        return finalprice;
    }

    public void setFinalprice(Double finalprice) {
        this.finalprice = finalprice;
    }

    public Integer getGetuid() {
        return getuid;
    }

    public void setGetuid(Integer getuid) {
        this.getuid = getuid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}