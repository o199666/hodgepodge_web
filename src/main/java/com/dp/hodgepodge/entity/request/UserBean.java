package com.dp.hodgepodge.entity.request;

import java.io.Serializable;

/**
 * 前台传来的格式，这里暂时只用作 修改密码
 */
public class UserBean implements Serializable {
    /**
     *    手机号码
     */
    private String userPhone;
    /**
     *    原始密码
     */

    private String userPwd;
    /**
     *    新密码
     */
    private String userNewPwd;

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserNewPwd() {
        return userNewPwd;
    }

    public void setUserNewPwd(String userNewPwd) {
        this.userNewPwd = userNewPwd;
    }
}
