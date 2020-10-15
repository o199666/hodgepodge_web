package com.dp.hodgepodge.entity;

import java.io.Serializable;

import static com.dp.hodgepodge.utils.CommonConfig.Image;

public class NewsEntity implements Serializable {
    private int id; //ID
    private String news_title;//标题
    private String news_links;//链接 文章链接，或者播放链接
    private int news_plays;//播放次数
    private int news_type_id;//类型ID
    private String news_rhesis_ch;//中文句子
    private String news_rhesis_en;//
    private String news_author;//作者
    private String news_production;//作品名称
    private String news_img;//图片
    private int news_variety;//类型，0
    private int news_lives;//点赞
    private int news_collects;//收藏数
    private String news_music_name;//音乐的名字
    private String news_musci_author;//歌手
    private String news_musci_path;//路径
    private String news_time;//文章时间


    public String getNews_music_name() {
        return news_music_name;
    }

    public void setNews_music_name(String news_music_name) {
        this.news_music_name = news_music_name;
    }

    public String getNews_musci_author() {
        return news_musci_author;
    }

    public void setNews_musci_author(String news_musci_author) {
        this.news_musci_author = news_musci_author;
    }

    public String getNews_musci_path() {
        return news_musci_path;
    }

    public void setNews_musci_path(String news_musci_path) {
        this.news_musci_path = news_musci_path;
    }

    public String getNews_time() {
        return news_time;
    }

    public void setNews_time(String news_time) {
        this.news_time = news_time;
    }

    public int getNews_id() {
        return id;
    }

    public void setNews_id(int news_id) {
        this.id = news_id;
    }

    public String getNews_title() {
        return news_title;
    }

    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    public String getNews_links() {
        return news_links;
    }

    public void setNews_links(String news_links) {
        this.news_links = news_links;
    }

    public int getNews_plays() {
        return news_plays;
    }

    public void setNews_plays(int news_plays) {
        this.news_plays = news_plays;
    }

    public int getNews_type_id() {
        return news_type_id;
    }

    public void setNews_type_id(int news_type_id) {
        this.news_type_id = news_type_id;
    }

    public String getNews_rhesis_ch() {
        return news_rhesis_ch;
    }

    public void setNews_rhesis_ch(String news_rhesis_ch) {
        this.news_rhesis_ch = news_rhesis_ch;
    }

    public String getNews_rhesis_en() {
        return news_rhesis_en;
    }

    public void setNews_rhesis_en(String news_rhesis_en) {
        this.news_rhesis_en = news_rhesis_en;
    }

    public String getNews_author() {
        return news_author;
    }

    public void setNews_author(String news_author) {
        this.news_author = news_author;
    }

    public String getNews_production() {
        return news_production;
    }

    public void setNews_production(String news_production) {
        this.news_production = news_production;
    }

    public String getNews_img() {
        return news_img;
    }

    public void setNews_img(String news_img) {
        this.news_img = Image+news_img;
    }

    public int getNews_variety() {
        return news_variety;
    }

    public void setNews_variety(int news_variety) {
        this.news_variety = news_variety;
    }

    public int getNews_lives() {
        return news_lives;
    }

    public void setNews_lives(int news_lives) {
        this.news_lives = news_lives;
    }

    public int getNews_collects() {
        return news_collects;
    }

    public void setNews_collects(int news_collects) {
        this.news_collects = news_collects;
    }
}
