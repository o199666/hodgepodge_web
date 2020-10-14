package com.dp.hodgepodge.service;

import com.dp.hodgepodge.dao.UserDao;
import com.dp.hodgepodge.entity.UserEntivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicelmpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public int userReg(UserEntivity user) {
        return userDao.userReg(user);
    }
    /**
     * 用户登录
     * @param user
     * @return
     */
    @Override
    public UserEntivity userLogin(UserEntivity user) {
        return userDao.userLogin(user.getUser_phone());
    }

    /**
     * 修改用户密码
     *
     * @param userEntivity
     * @return
     */
    @Override
    public UserEntivity updateUserByPwd(UserEntivity userEntivity) {
        return userDao.updateUser(userEntivity);
    }


    /**
     * 查询电话号码
     *
     * @param phone
     * @return
     */
    @Override
    public int queryUserByPhone(String phone) {
        return userDao.queryUserByPhone(phone);
    }
}
