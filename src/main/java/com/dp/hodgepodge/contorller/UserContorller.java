package com.dp.hodgepodge.contorller;

import com.dp.hodgepodge.entity.UserEntivity;
import com.dp.hodgepodge.service.NewsServiceImpl;
import com.dp.hodgepodge.service.UserService;
import com.dp.hodgepodge.service.UserServicelmpl;
import com.dp.hodgepodge.utils.BaseResult;
import com.dp.hodgepodge.utils.CommonConfig;
import com.dp.hodgepodge.utils.ResultUtil;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.RequestWrapper;

@MapperScan("com.dp.hodgepodge.dao")
@RestController
public class UserContorller {
    @Autowired
    private UserServicelmpl userService;
    //结果工具集
    ResultUtil resultUtil = new ResultUtil();

    /**
     * 用户注册 ，返回user
     *
     * @param user
     * @return
     */
    @PostMapping(value = "/userReg")
    public BaseResult userReg(@RequestBody UserEntivity user) {
        System.out.println(user.toString());
        //todo先查询一下。判断有无已经注册
        int result = userService.queryUserByPhone(user.getUser_phone());
        System.out.println(user.toString());
        if (result == 1) {//chaxuncheng
            return resultUtil.result(CommonConfig.RESULT_ERROR_CODE, "注册失败,用户名已存在!",null);
        } else {
            int us = userService.userReg(user);
            System.out.println(user.toString());
            if (us == 1) {
                return resultUtil.result(CommonConfig.RESULT_SUCCSS_CODE, "注册成功",null);
            }
        }
        return resultUtil.result(CommonConfig.RESULT_ERROR_CODE, "注册失败",null);
    }


    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public BaseResult userLogin(@RequestBody UserEntivity user) {
        int count = userService.queryUserByPhone(user.getUser_phone());
        if (count == 0) {
            //说明用户没注册
            return resultUtil.result(CommonConfig.RESULT_ERROR_CODE, "您没有注册！",null);
        } else {
            //说明用户注册了
            UserEntivity userEntivity = userService.userLogin(user);
            if (user.getUser_phone().equals(userEntivity.getUser_phone()) && user.getUser_pwd().equals(userEntivity.getUser_pwd())) {
                //账号密码正确，return
                return resultUtil.result(CommonConfig.RESULT_SUCCSS_CODE, "登录成功！",userEntivity);
            } else {
                return resultUtil.result(CommonConfig.RESULT_ERROR_CODE, "账号或者密码错误！",null);
            }
        }
    }


    /**
     * 修改密码
     */
    @RequestMapping(value = "/updateUserPwd", method = RequestMethod.POST)
    public BaseResult updateUserPwd(@RequestBody UserEntivity user) {
        int count = userService.queryUserByPhone(user.getUser_phone());
        if (count == 0) {
            //用户不存在
            return resultUtil.result(CommonConfig.RESULT_ERROR_CODE, "手机号码不存在！",null);
        } else {
            //前端短信验证通过，
            UserEntivity userEntivity = userService.updateUserByPwd(user);
//            if (userEntivity == 1) {
                return resultUtil.result(CommonConfig.RESULT_SUCCSS_CODE, "密码修改成功，请重新登录",userEntivity);
//            }
        }

    }



}
