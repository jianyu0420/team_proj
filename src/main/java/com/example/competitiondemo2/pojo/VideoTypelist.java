package com.example.competitiondemo2.pojo;

import java.io.Serializable;

public class VideoTypelist implements Serializable {
    private Integer videoTypeId;

    private String bigtype;

    private static final long serialVersionUID = 1L;

    public Integer getVideoTypeId() {
        return videoTypeId;
    }

    public void setVideoTypeId(Integer videoTypeId) {
        this.videoTypeId = videoTypeId;
    }

    public String getBigtype() {
        return bigtype;
    }

    public void setBigtype(String bigtype) {
        this.bigtype = bigtype == null ? null : bigtype.trim();
    }
}