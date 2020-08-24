package com.cmorwh.sche.common;

/**
 * Created by wangheng on 2020/8/20 16:35
 */
public class CommonResult<T> {
    private String code;
    private String message;
    private T data;

    public CommonResult(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult(T data) {
        this.data = data;
    }

    public CommonResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> CommonResult<T> success(String code,String message,T data){
        return new CommonResult<>(code,message,data);
    }

    public static <T> CommonResult<T> success(T data){
        return new CommonResult<T>(data);
    }

    public static <T> CommonResult<T> success(String code,String message){
        return new CommonResult<T>(code,message);
    }

    public static <T> CommonResult<T> faild(String code,String message,T data){
        return new CommonResult<>(code,message,data);
    }

    public static <T> CommonResult<T> faild(T data){
        return new CommonResult<>(data);
    }

    public static <T> CommonResult<T> faild(String code,String message){
        return new CommonResult<>(code,message);
    }
}
