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
@TableName("tb_check_area_score")
public class TbCheckAreaScore implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 内部id
     */
    @TableId("id")
    private String id;

    /**
     * 考核区域标准Id
     */
    @TableField("area_id")
    private String areaId;

    /**
     * 检查考核类别id
     */
    @TableField("category_id")
    private String categoryId;

    /**
     * 检查批次id
     */
    @TableField("batch_id")
    private Long batchId;

    /**
     * 检查分数
     */
    @TableField("score")
    private BigDecimal score;

    /**
     * 检查等级ID
     */
    @TableField("grade_id")
    private String gradeId;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 打分人
     */
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
