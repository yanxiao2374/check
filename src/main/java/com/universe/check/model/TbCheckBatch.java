package com.universe.check.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("tb_check_batch")
public class TbCheckBatch implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("id")
    private String id;

    /**
     * 检查批次名称
     */
    @TableField("name")
    private String name;

    /**
     * 开始时间
     */
    @TableField("start_time")
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    @TableField("end_time")
    private LocalDateTime endTime;

    /**
     * 批次状态（数据字典引用db_checkbatchstatus_type）
     */
    @TableField("status")
    private String status;

    /**
     * 本月检查结果问题描述(总评人)
     */
    @TableField("summarize_problem")
    private String summarizeProblem;

    /**
     * 本月项目亮点(总评人)
     */
    @TableField("summarize_highlight")
    private String summarizeHighlight;

    /**
     * 下月需跟进的事项(总评人)
     */
    @TableField("summarize_need_improve")
    private String summarizeNeedImprove;

    /**
     * 其他事项
     */
    @TableField("note")
    private String note;

    /**
     * 经理
     */
    @TableField("manager")
    private String manager;

    /**
     * 总评人，记录总评人
     */
    @TableField("summarize_person")
    private String summarizePerson;

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
