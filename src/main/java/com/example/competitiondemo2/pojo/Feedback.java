package com.example.competitiondemo2.pojo;

import java.io.Serializable;
import java.util.Date;

public class Feedback implements Serializable {
    private Integer id;

    private String content;

    private Date feedback_time;

    public Date getFeedback_time() {
        return feedback_time;
    }

    public void setFeedback_time(Date feedback_time) {
        this.feedback_time = feedback_time;
    }


    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}