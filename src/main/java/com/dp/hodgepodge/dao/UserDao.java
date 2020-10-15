package com.dp.hodgepodge.dao;

import com.dp.hodgepodge.entity.UserEntivity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    /**
     * 修改用户
     * http://localhost:8080/updateUserPwd  body=
     *  {
     *     "user_phone":"18177331",
     *     "user_pwd":"123aa"
     *  }
     *
     * @param user
     * @return
     */
    UserEntivity updateUser(UserEntivity user);

    /**
     * 用户登录
     *
     * @param phone
     * @return
     */

    UserEntivity userLogin(String phone);

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    int userReg(UserEntivity user);

    /**
     * 查看是否已经注册
     */
    int queryUserByPhone(String phone);
}
