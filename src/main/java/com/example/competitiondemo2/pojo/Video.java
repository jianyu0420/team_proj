package com.example.competitiondemo2.pojo;

import java.io.Serializable;

public class Video implements Serializable {
    private Integer videoId;

    private String title;

    private String url;

    private Integer videoTypeId;

    private String pic;

    private Integer view;

    private String up;

    private String time;

    private String createdate;

    private String from;

    private String smalltype;

    private static final long serialVersionUID = 1L;

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getVideoTypeId() {
        return videoTypeId;
    }

    public void setVideoTypeId(Integer videoTypeId) {
        this.videoTypeId = videoTypeId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up == null ? null : up.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    public String getSmalltype() {
        return smalltype;
    }

    public void setSmalltype(String smalltype) {
        this.smalltype = smalltype == null ? null : smalltype.trim();
    }
}