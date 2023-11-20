package com.example.competitiondemo2.pojo;

import java.io.Serializable;

public class InfoTypelist implements Serializable {
    private Integer infoListId;

    private String typename;

    private String englishname;

    private Integer count;

    private static final long serialVersionUID = 1L;

    public Integer getInfoListId() {
        return infoListId;
    }

    public void setInfoListId(Integer infoListId) {
        this.infoListId = infoListId;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getEnglishname() {
        return englishname;
    }

    public void setEnglishname(String englishname) {
        this.englishname = englishname == null ? null : englishname.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}