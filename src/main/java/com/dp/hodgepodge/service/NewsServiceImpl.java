package com.dp.hodgepodge.service;

import com.dp.hodgepodge.dao.NewsDao;
import com.dp.hodgepodge.entity.NewsEntity;
import com.dp.hodgepodge.utils.page.PageRequest;
import com.dp.hodgepodge.utils.page.PageResult;
import com.dp.hodgepodge.utils.page.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 实现接口
 * 这个接口可以不写，看自己。
 * 这里返回到数据库操作类Dao进行数据查询
 * <p>
 * 业务逻辑都写这里。
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDao newsDao;

    @Override
    public PageResult queryAllNews(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<NewsEntity> news = newsDao.queryNewsAll();
        //返回包裹的的分页
        return PageUtils.getPageResult(new PageInfo(news));
    }
}
