package com.dp.hodgepodge.service;

import com.dp.hodgepodge.entity.NewsEntity;
import com.dp.hodgepodge.entity.NewsTypeEntity;
import com.dp.hodgepodge.utils.page.PageResult;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 业务操作  这里为了区分。
 */
@Repository
public interface NewsService {
    PageResult queryAllNews(int pageNum, int pageSize);
    List<NewsTypeEntity> queryNewsType();
    PageResult queryNewsByTypeId(int typeId,int pageNum,int pageSize );
}
