package com.dp.hodgepodge.dao;

import com.dp.hodgepodge.entity.UserEntivity;
import org.apache.ibatis.annotations.Param;
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
     */


    int updateUserPwd(@Param("phone") String phone,@Param("pwd")  String pwd,@Param("newPwd")  String newPwd);
    /**
     *  如果一个参数，可以不加注释，多个参数需要加注释 不然mapper不识别
     * @param phone
     * @param pwd
     * @return
     */
    int checkPhoneOrPwd(@Param("phone") String phone,@Param("pwd")  String pwd);
    /**
     * 用户登录
     *
     * @param phone
     * @return
     */
    UserEntivity userLogin(@Param("phone") String phone,@Param("pwd") String pwd);



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
    int queryUserByPhone(@Param("phone") String phone);
}
