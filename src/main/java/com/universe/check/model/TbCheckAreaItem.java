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
@TableName("tb_check_area_item")
public class TbCheckAreaItem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 内部id
     */
    @TableId("id")
    private String id;

    /**
     * 所属区域id
     */
    @TableField("area_id")
    private String areaId;

    /**
     * 检查考核类别id,从检查区域中复制，冗余数据
     */
    @TableField("category_id")
    private String categoryId;

    /**
     * 检查项名称
     */
    @TableField("name")
    private String name;

    /**
     * 检查标准或扣分标准
     */
    @TableField("standard")
    private String standard;

    /**
     * 检查项总分值
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
