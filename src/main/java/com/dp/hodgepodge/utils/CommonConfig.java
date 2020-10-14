package com.dp.hodgepodge.utils;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;


/**
 * 公用配置文件
 */
public class CommonConfig {
    /**
     * 音乐路径
     */
    static String path = getIp();

    public static final String Image = "http://" + path + ":8080/news/";
    public static final int RESULT_SUCCSS_CODE = 1001;//成功
    public static final int RESULT_ERROR_CODE = -1000;//失败

    /**
     * 获取当前项目ID地址
     *
     * @return
     */
    public static String getIp() {
        InetAddress ip4 = null;
        try {
            ip4 = Inet4Address.getLocalHost();
            System.out.println(ip4.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return ip4.getHostAddress();

    }
}
