package com.dp.hodgepodge.entity;

import java.io.Serializable;

/**
 *  句子/新闻/等，类型实体类
 */
public class NewsTypeEntity implements Serializable {
    private int news_type_id; //类型Id
    private String news_type_name;//类型名称
    private String news_type_desc;//类型描述

    public NewsTypeEntity() {

    }

    public int getNews_type_id() {
        return news_type_id;
    }

    public void setNews_type_id(int news_type_id) {
        this.news_type_id = news_type_id;
    }

    public String getNews_type_name() {
        return news_type_name;
    }

    public void setNews_type_name(String news_type_name) {
        this.news_type_name = news_type_name;
    }

    public String getNews_type_desc() {
        return news_type_desc;
    }

    public void setNews_type_desc(String news_type_desc) {
        this.news_type_desc = news_type_desc;
    }
}
