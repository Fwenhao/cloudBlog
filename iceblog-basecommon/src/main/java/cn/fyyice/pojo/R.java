package cn.fyyice.pojo;

import cn.fyyice.constant.Tips;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
/**
 * @description: 全局OutDTO
 * @author: fwh
 * @time: 2021/5/12 14:03
 */
@Data
@Builder
@NoArgsConstructor
public class R<T> implements Serializable {

    private Integer code;
    private String message;
    private T data;

    public static <T> R<T> success(){
        return initR(HttpStatus.OK.value(), Tips.FAIL_MSG,null);
    }

    public static <T> R<T> success(String message){
        return initR(HttpStatus.OK.value(),message,null);
    }

    public static <T> R<T> success(Integer code,String message){
        return initR(code,message,null);
    }

    public static <T> R<T> success(Integer code,String message,T data){
        return initR(code,message,data);
    }

    public static <T> R<T> fail(){
        return initR(HttpStatus.INTERNAL_SERVER_ERROR.value(),Tips.FAIL_MSG,null);
    }

    public static <T> R<T> fail(Integer code,String message){
        return initR(code,message,null);
    }

    public static <T> R<T> fail(Integer code,String message,T data){
        return initR(code,message,data);
    }

    public static <T> R<T> initR(Integer code, String message,T data){
        R<T> result = new R<>();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }
}
