package cn.fyyice.pojo.user;

import cn.fyyice.enums.AccountIdentity;
import cn.fyyice.enums.ActivateStatus;
import cn.fyyice.enums.UserSex;
import cn.fyyice.pojo.BasePojo;
import lombok.*;

import java.io.Serializable;

/**
 * @description: 用户实体类
 * @author: fwh
 * @time: 2021/5/17 15:27
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User extends BasePojo implements Serializable{
    /**
     * 真实名
     */
    private String userNickname;

    /**
     * 用户名
     * */
    private String userName;

    /**
     * 密码
     * */
    private String userPassword;

    /**
     * 年龄
     * */
    private Integer userAge;

    /**
     * 性别 默认(1,男)  (0，女)
     * */
    private UserSex sex;

    /**
     * 手机号
     * */
    private String phone;

    /**
     * 邮箱
     * */
    private String email;

    /**
     * 用户权限
     * */
    private String identify;

    /**
     * 用户状态   激活/未激活
     * */
    private ActivateStatus status;

    /**
     * 用户身份
     */
    private AccountIdentity identity;
}
