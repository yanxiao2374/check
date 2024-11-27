package com.universe.check.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author mrf
 * @since 2024-11-27
 */
@Getter
@Setter
@TableName("tb_check_area")
public class TbCheckArea implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 内部id
     */
    @TableId("id")
    private String id;

    /**
     * 检查考核类别id
     */
    @TableField("category_id")
    private String categoryId;

    /**
     * 检查区域部分名称
     */
    @TableField("name")
    private String name;

    /**
     * 检查区域规范
     */
    @TableField("standard")
    private String standard;

    /**
     * 检查区域总分值
     */
    @TableField("score")
    private BigDecimal score;

    /**
     * 在用标志
     */
    @TableField("isusing")
    private Boolean isusing;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("create_by")
    private String createBy;

    /**
     * 说明
     */
    @TableField("remark")
    private String remark;

    @TableField("delete_flag")
    private Boolean deleteFlag;

    @TableField("update_time")
    private LocalDateTime updateTime;
}
