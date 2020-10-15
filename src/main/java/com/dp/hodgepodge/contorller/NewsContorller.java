package com.dp.hodgepodge.contorller;

import com.dp.hodgepodge.entity.UserEntivity;
import com.dp.hodgepodge.entity.request.PageBean;
import com.dp.hodgepodge.service.NewsServiceImpl;
import com.dp.hodgepodge.utils.BaseResult;
import com.dp.hodgepodge.utils.CommonConfig;
import com.dp.hodgepodge.utils.ResultUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@MapperScan("com.dp.hodgepodge.dao")

@RestController

@RequestMapping(path = "/news")
public class NewsContorller {
    @Autowired
    private NewsServiceImpl newsService;
    ResultUtil resultUtil = new ResultUtil();

    @RequestMapping(value = "/queryNewsAll", method = RequestMethod.GET)
    public BaseResult queryNewsAll() {
        return resultUtil.result(CommonConfig.RESULT_SUCCSS_CODE, "OK", newsService.queryAllNews(1, 5));
    }

    /**
     * 查询类型
     * @return
     */
    @RequestMapping(value = "/queryNewsType")
    public BaseResult queryNewsType() {
        return resultUtil.result(CommonConfig.RESULT_SUCCSS_CODE, "OK", newsService.queryNewsType());
    }

    /**
     * 浏览器示例：
     * http://localhost:8080/queryNewsByTypeId?typeId=3&pageNum=1&pageSize=10
     * @param pageBean   类型 id  |pageNum  页数  |ageSize 数量
     * @return
     */
    @RequestMapping(value = "/queryNewsByTypeId")
    public BaseResult queryNewsByTypeId(@RequestBody PageBean pageBean) {
        return resultUtil.result(CommonConfig.RESULT_SUCCSS_CODE, "OK", newsService.queryNewsByTypeId(pageBean.getTypeId(), pageBean.getPageNum(), pageBean.getPageSize()));
    }

}
