package cn.fyyice.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @description: 实体类基础模板(公共字段)
 * @author: fwh
 * @time: 2021/5/12 11:29
 */
@Data
public class BasePojo {
    @TableId(value = "key_id", type = IdType.AUTO)
    private Integer keyId;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @TableLogic
    private Integer deleted;
}
