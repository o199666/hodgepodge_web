package com.dp.hodgepodge.contorller;

import com.dp.hodgepodge.entity.UserEntivity;
import com.dp.hodgepodge.entity.request.PageBean;
import com.dp.hodgepodge.service.NewsServiceImpl;
import com.dp.hodgepodge.service.UserServicelmpl;
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
    @Autowired
    private UserServicelmpl userService;
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
    public BaseResult queryNewsType(@RequestHeader("user_token") String token) {
        if (userService.selectToken(token) != 1) {
            return resultUtil.result(CommonConfig.RESULT_NOLOGIN_CODE, "当前用户没有登录！", null);
        }
        return resultUtil.result(CommonConfig.RESULT_SUCCSS_CODE, "OK", newsService.queryNewsType());
    }

    /**
     * 浏览器示例：
     * http://localhost:8080/queryNewsByTypeId?typeId=3&pageNum=1&pageSize=10
     * @param pageBean   类型 id  |pageNum  页数  |ageSize 数量
     * @return
     */
    @RequestMapping(value = "/queryNewsByTypeId")
    public BaseResult queryNewsByTypeId(@RequestHeader("user_token") String token,@RequestBody PageBean pageBean) {
        //检测token
        if (userService.selectToken(token) != 1) {
            return resultUtil.result(CommonConfig.RESULT_NOLOGIN_CODE, "当前用户没有登录！", null);
        }
        return resultUtil.result(CommonConfig.RESULT_SUCCSS_CODE, "OK", newsService.queryNewsByTypeId(pageBean.getTypeId(), pageBean.getPageNum(), pageBean.getPageSize()));
    }

}
