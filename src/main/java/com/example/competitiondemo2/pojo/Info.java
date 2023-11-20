package com.example.competitiondemo2.pojo;

import java.io.Serializable;

public class Info implements Serializable {
    private Integer infoId;

    private String title;

    private String publictime;

    private String simplecontent;

    private Integer infoTypeId;

    private String maincontent;

    private static final long serialVersionUID = 1L;

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPublictime() {
        return publictime;
    }

    public void setPublictime(String publictime) {
        this.publictime = publictime == null ? null : publictime.trim();
    }

    public String getSimplecontent() {
        return simplecontent;
    }

    public void setSimplecontent(String simplecontent) {
        this.simplecontent = simplecontent == null ? null : simplecontent.trim();
    }

    public Integer getInfoTypeId() {
        return infoTypeId;
    }

    public void setInfoTypeId(Integer infoTypeId) {
        this.infoTypeId = infoTypeId;
    }

    public String getMaincontent() {
        return maincontent;
    }

    public void setMaincontent(String maincontent) {
        this.maincontent = maincontent == null ? null : maincontent.trim();
    }
}