package com.example.customer.common;

public class Result {

    public static int code = 1;
    public static String message = "操作成功！";
    public static Object data;

    public static Result success(Object data){
        Result result = new Result();
        Result.data = data;
        return result;
    };

    public static Result success(String message,Object data){
        Result result = new Result();
        Result.message = message;
        Result.data = data;
        return result;
    };

    public static int getCode() {
        return code;
    }

    public static void setCode(int code) {
        Result.code = code;
    }
}
