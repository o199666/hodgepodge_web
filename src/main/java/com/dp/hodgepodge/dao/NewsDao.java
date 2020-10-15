package com.dp.hodgepodge.dao;


import com.dp.hodgepodge.entity.NewsEntity;
import com.dp.hodgepodge.entity.NewsTypeEntity;
import com.dp.hodgepodge.utils.page.PageResult;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 数据操作
 * 对应mapper 配置文件
 */
@Repository
public interface NewsDao {
    List<NewsEntity> queryNewsAll();
    List<NewsTypeEntity> queryNewsType();
    List<NewsEntity>  queryNewsByTypeId(int news_type_id);

}
