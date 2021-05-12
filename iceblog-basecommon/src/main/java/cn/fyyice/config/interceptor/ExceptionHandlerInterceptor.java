package cn.fyyice.config.interceptor;

import cn.fyyice.pojo.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * @description: 全局异常捕获处理
 * @author: fwh
 * @time: 2021/5/12 14:01
 */

@ControllerAdvice
@Order(999)
@Component
@Slf4j
public class ExceptionHandlerInterceptor {

    @ResponseBody
    @ExceptionHandler(ClassNotFoundException.class)
    public ResponseEntity<R> classNotFoundException(ClassNotFoundException e){
        log.error("ClassNotFoundException异常,异常信息:{}：定位信息:{},",e.getMessage(),e.getStackTrace());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(R.builder().code(HttpStatus.INTERNAL_SERVER_ERROR.value()).message(e.getMessage()).data(e.getStackTrace()).build());
    }
    @ResponseBody
    @ExceptionHandler(IOException.class)
    public ResponseEntity<R> ioExceptionHandler(IOException e){
        log.error("io发生异常,异常类:{},异常信息:{}：定位信息:{},",e.getClass(),e.getMessage(),e.getStackTrace());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(R.builder().code(HttpStatus.INTERNAL_SERVER_ERROR.value()).message(e.getMessage()).data(e.getStackTrace()).build());
    }
    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<R> runtimeExceptionHandler(RuntimeException e){
        log.error("运行时发生异常,异常类:{},异常信息:{}：定位信息:{},",e.getClass(),e.getMessage(),e.getStackTrace());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(R.builder().code(HttpStatus.INTERNAL_SERVER_ERROR.value()).message(e.getMessage()).data(e.getStackTrace()).build());
    }
    @ResponseBody
    @ExceptionHandler(CloneNotSupportedException.class)
    public ResponseEntity<R> runtimeExceptionHandler(CloneNotSupportedException e){
        log.error("CloneNotSupportedException异常,异常信息:{}：定位信息:{},",e.getMessage(),e.getStackTrace());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(R.builder().code(HttpStatus.INTERNAL_SERVER_ERROR.value()).message(e.getMessage()).data(e.getStackTrace()).build());
    }



}
