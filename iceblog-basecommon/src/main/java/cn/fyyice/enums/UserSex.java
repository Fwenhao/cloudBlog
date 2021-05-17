package cn.fyyice.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;

/**
 * @description: 用户性别
 * @author: fwh
 * @time: 2021/5/17 15:34
 */
@AllArgsConstructor
public enum UserSex {

    MAN("男",1),
    WOMAN("女",0);

    @EnumValue
    private String sex;
    private Integer code;
}
