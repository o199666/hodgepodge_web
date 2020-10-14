package com.dp.hodgepodge.service;

import com.dp.hodgepodge.entity.UserEntivity;
import org.springframework.stereotype.Repository;


/**
 * 用户操作类
 */
@Repository
public interface UserService {
    /**
     * 注册
     * @param user
     */
    int userReg(UserEntivity user);

    /**
     * 登录
     * @param userEntivity
     * @return
     */
    UserEntivity userLogin(UserEntivity userEntivity);

    /**
     * 修改，找回密码
     * @return
     */
    UserEntivity updateUserByPwd(UserEntivity userEntivity);

    /**
     * 查看是否存在
     */
    int queryUserByPhone(String phone);

}
