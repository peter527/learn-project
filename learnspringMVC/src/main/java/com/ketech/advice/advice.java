package com.ketech.advice;

import com.ketech.controller.HelloController;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * 包名: com.ketech <br/>
 * 类名: advice <br/>
 * 版本: version 1.0 <br/>
 * 作者: 武国华 <br/>
 * @author: WuGuoHua <br/>
 * 创建日期: 2017年10月26日 <br/>
 * 描述: 测试一下 <br/>.
 */

@ControllerAdvice
public class advice {

    private static final Logger logger = LogManager.getLogger(HelloController.class);

    @ExceptionHandler(value = { IOException.class , RuntimeException.class })
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ModelAndView exception(Exception exception, WebRequest request) {
        logger.info("Catch an exception", exception);
        return  new ModelAndView("error");
    }

    @ExceptionHandler(value = { Exception.class })
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ModelAndView noMapping(Exception exception, WebRequest request) {
        logger.info("No mapping exception", exception);
        return  new ModelAndView("notfound");
    }

}
