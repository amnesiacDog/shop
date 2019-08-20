package com.abc.shop.common.web;

import com.abc.shop.common.vo.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ControllerAdvice 使用此注解描述的类为一个全局异常处理类
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    private Logger log=
    LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * @param e
     * @return
     * @ExceptionHandler 注解描述的方法为一个异常处理方法
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public JsonResult doHandleRuntimeException(
            RuntimeException e) {
        log.error(e.getMessage());
        e.printStackTrace();

        return new JsonResult(e);
    }
    //.....
}




