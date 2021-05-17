package cn.fyyice.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ActivateStatus {
    ACTIVATED(1,"已激活"),
    NOTACTIVATED(0,"未激活");

    @EnumValue
    private Integer code;
    private String status;

    public Integer getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }
}
