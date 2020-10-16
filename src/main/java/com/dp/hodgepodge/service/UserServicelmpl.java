package com.dp.hodgepodge.service;

import com.dp.hodgepodge.dao.UserDao;
import com.dp.hodgepodge.entity.UserEntivity;
import com.dp.hodgepodge.entity.request.UserBean;
import com.dp.hodgepodge.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicelmpl {
    @Autowired
    private UserDao userDao;
    //结果工具集
    ResultUtil resultUtil = new ResultUtil();
    public int userReg(UserEntivity user) {
        return userDao.userReg(user);
    }

    /**
     * 用户登录
     *
     * @param
     * @return
     */
    public UserEntivity userLogin(String phone, String pwd) {
        return userDao.userLogin(phone, pwd);
    }

    /**
     * 修改用户密码
     *
     * @param newPwd
     * @return
     */
    public int updateUserPwd(String phone, String pwd, String newPwd) {
        if (newPwd.isEmpty()){
            return userDao.updateUserPwd(phone, pwd, newPwd);

        }else{
            return userDao.updateUserPwd(phone, pwd, newPwd);

        }
    }

    /**
     * 修改密码检测
     * @param user
     * @return
     */
    public int checkPhoneOrPwd(UserBean user) {
        return userDao.checkPhoneOrPwd(user.getUserPhone(), user.getUserPwd());
    }

    /**
     * 查询电话号码
     *
     * @param phone
     * @return
     */
    public int queryUserByPhone(String phone) {
        return userDao.queryUserByPhone(phone);
    }
}
