package com.example.competitiondemo2.pojo;

import java.io.Serializable;

public class Food implements Serializable {
    private Integer foodId;

    private String cookname;

    private String editor;

    private String foodname;

    private String from;

    private Integer foodTypeId;

    private String cookdetail;

    private String cookpic;

    private static final long serialVersionUID = 1L;

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getCookname() {
        return cookname;
    }

    public void setCookname(String cookname) {
        this.cookname = cookname == null ? null : cookname.trim();
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname == null ? null : foodname.trim();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    public Integer getFoodTypeId() {
        return foodTypeId;
    }

    public void setFoodTypeId(Integer foodTypeId) {
        this.foodTypeId = foodTypeId;
    }

    public String getCookdetail() {
        return cookdetail;
    }

    public void setCookdetail(String cookdetail) {
        this.cookdetail = cookdetail == null ? null : cookdetail.trim();
    }

    public String getCookpic() {
        return cookpic;
    }

    public void setCookpic(String cookpic) {
        this.cookpic = cookpic == null ? null : cookpic.trim();
    }
}