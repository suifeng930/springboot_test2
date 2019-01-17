package com.mhc.web.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 捕获全局异常处理器
 * @author Andre930
 * @create 2019-01-17 13:55
 */
@ControllerAdvice //控制器切面  全局异常
public class GlobalExceptionHandler {



    @ExceptionHandler(RuntimeException.class) //捕获运行时异常
    @ResponseBody
    /**
     * 处理异常的方法
     */
    public Map<String,Object> exceptionHanlder(){

        Map<String, Object> map = new HashMap<>();
        map.put("errorCode","101");
        map.put("errorMsg","系统错误");
        return map;
    }
}
