package com.dp.hodgepodge.utils;

/**
 * 请求 结果 工具类。 区分不同的返回状态
 */
public class ResultUtil {
    //当正确时返回的值
    public BaseResult success(Object data) {
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(0);
        baseResult.setMsg("OK");
        baseResult.setData(data);
        return baseResult;
    }

    //当错误时返回的值
    public static BaseResult error(int code, String msg) {
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(code);
        baseResult.setMsg(msg);
        return baseResult;
    }
}
