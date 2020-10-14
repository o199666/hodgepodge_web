package com.dp.hodgepodge.contorller;
import com.dp.hodgepodge.service.NewsServiceImpl;
import com.dp.hodgepodge.utils.BaseResult;
import com.dp.hodgepodge.utils.CommonConfig;
import com.dp.hodgepodge.utils.ResultUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@MapperScan("com.dp.hodgepodge.dao")
@RestController
public class NewsContorller {
    @Autowired
    private NewsServiceImpl newsService;
    ResultUtil resultUtil = new ResultUtil();

    @RequestMapping(value = "/queryNewsAll", method = RequestMethod.GET)
    public BaseResult queryNewsAll() {
        return resultUtil.result(CommonConfig.RESULT_SUCCSS_CODE,"OK",newsService.queryAllNews(1,5));
    }

}
