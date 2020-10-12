package com.dp.hodgepodge.utils;

/**
 * 请求结果统一封装
 *
 * @param <T>
 */
public class BaseResult<T> {
    private int code;//状态码
    private String msg;//信息
    private T data;// 数据


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
