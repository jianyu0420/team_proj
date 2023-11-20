package com.example.competitiondemo2.pojo;

import java.io.Serializable;

public class Record implements Serializable {
    private Integer id;

    private Integer vedioId;

    private Integer articleId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVedioId() {
        return vedioId;
    }

    public void setVedioId(Integer vedioId) {
        this.vedioId = vedioId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }
}