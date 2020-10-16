package com.dp.hodgepodge.contorller;

import com.dp.hodgepodge.entity.UserEntivity;
import com.dp.hodgepodge.entity.request.UserBean;
import com.dp.hodgepodge.service.UserServicelmpl;
import com.dp.hodgepodge.utils.BaseResult;
import com.dp.hodgepodge.utils.CommonConfig;
import com.dp.hodgepodge.utils.ResultUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@MapperScan("com.dp.hodgepodge.dao")
@RestController
@RequestMapping(path = "/user")
public class UserContorller {
    @Autowired
    private UserServicelmpl userService;
    //结果工具集
    ResultUtil resultUtil = new ResultUtil();

    /**
     * 用户注册 ，返回user
     * http://localhost:8080/userReg
     * {
     * "user_name":"zhangsn",
     * "user_phone":"181773311",
     * "user_pwd":"1877qwe33"
     * }
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/userReg")
    public BaseResult userReg(@RequestBody UserEntivity user) {
        System.out.println(user.toString());
        //todo先查询一下。判断有无已经注册
        int result = userService.queryUserByPhone(user.getUserPhone());
        System.out.println(user.toString());
        if (result == 1) {//chaxuncheng
            return resultUtil.result(CommonConfig.RESULT_ERROR_CODE, "注册失败,用户名已存在!", null);
        } else {
            int us = userService.userReg(user);
            System.out.println(user.toString());
            if (us == 1) {
                return resultUtil.result(CommonConfig.RESULT_SUCCSS_CODE, "注册成功", null);
            }
        }
        return resultUtil.result(CommonConfig.RESULT_ERROR_CODE, "注册失败", null);
    }


    @RequestMapping(value = "/queryUserByPhone")
    public BaseResult queryUserByPhone(@RequestBody UserEntivity user) {
        System.out.println(user.toString());
        //todo先查询一下。判断有无已经注册
        int result = userService.queryUserByPhone(user.getUserPhone());
        if (result == 1) {//chaxuncheng
            return resultUtil.result(CommonConfig.RESULT_ERROR_CODE, "注册失败,用户名已存在!", null);
        } else {
            return resultUtil.result(CommonConfig.RESULT_ERROR_CODE, "没有当前用户！,", null);

        }
    }


    /**
     * 用户登录
     * http://localhost:8080/userLogin
     * {
     * "user_phone":"17611111111",
     * "user_pwd":"cwj123"
     * }
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/userLogin")
    public BaseResult userLogin(@RequestBody UserEntivity user) {
        int count = userService.queryUserByPhone(user.getUserPhone());
        if (count == 0) {
            //说明用户没注册
            return resultUtil.result(CommonConfig.RESULT_ERROR_CODE, "您没有注册！", null);
        } else {
//            说明用户注册了
            UserEntivity userEntivity = userService.userLogin(user.getUserPhone(), user.getUserPwd());
            if (user.getUserPhone().equals(userEntivity.getUserPhone()) && user.getUserPwd().equals(userEntivity.getUserPwd())) {
                //账号密码正确，return
                return resultUtil.result(CommonConfig.RESULT_SUCCSS_CODE, "登录成功！", userEntivity);
            } else {
                return resultUtil.result(CommonConfig.RESULT_ERROR_CODE, "账号或者密码错误！", null);
            }
        }
    }

    /**
     * 修改密码
     * http://localhost:8080/updateUserPwd
     * {
     * "user_phone":"18177331",
     * "user_pwd":"1877qwe33"
     * }
     */
    @RequestMapping(value = "/updateUserPwd")
    public BaseResult updateUserPwd(@RequestBody UserBean user) {
        //加这一层是为了 检测是否存在。
        int count = userService.checkPhoneOrPwd(user);
        System.out.println(user.toString());
        if (count == 0) {
            //用户不存在
            return resultUtil.result(CommonConfig.RESULT_ERROR_CODE, "账号或者原密码输入有误！", null);
        } else {
            if (user.getUserNewPwd().isEmpty()) {
                return resultUtil.result(CommonConfig.RESULT_SUCCSS_CODE, "新密码不能为空", null);
            }
            int a = userService.updateUserPwd(user.getUserPhone(), user.getUserPwd(), user.getUserNewPwd());
            System.out.println("=================" + a);
            if (a == 1) {
                return resultUtil.result(CommonConfig.RESULT_SUCCSS_CODE, "密码修改成功，请重新登录", null);
            } else {
                return resultUtil.result(CommonConfig.RESULT_ERROR_CODE, "密码修改失败，请重新登录", null);
            }
        }
    }

}
