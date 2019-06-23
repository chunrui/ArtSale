package com.lnsf.entities;

import org.springframework.stereotype.Component;

@Component
public class Comment {
    private Integer cid;

    private Integer topicId;

    private String content;

    private Integer cphoto;

    private Integer uid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getCphoto() {
        return cphoto;
    }

    public void setCphoto(Integer cphoto) {
        this.cphoto = cphoto;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}