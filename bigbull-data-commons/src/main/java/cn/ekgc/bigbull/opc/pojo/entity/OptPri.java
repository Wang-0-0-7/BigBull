package cn.ekgc.bigbull.opc.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>门急诊病历检查报告详情表</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("sys_opt_pri")
public class OptPri extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId
    private String id;                        // 主键
	@TableField(value = "opt")
	private String opt;                        // 所属门急诊病历
	@TableField(value = "department")
	private String department;                        // 检查报告单-机构（科室）
	@TableField(value = "no")
	private String no;                        // 检查报告单-编号
	@TableField(value = "objective_results")
	private String objectiveResults;                        // 检查报告结果-客观所见
	@TableField(value = "subjective_results")
	private String subjectiveResults;                        // 检查报告结果-主观提示
	@TableField(value = "date")
	private Date date;                        // 检查日期
	@TableField(value = "report_date")
	private Date reportDate;                        // 检查报告日期
	@TableField(value = "remarks")
	private String remarks;                        // 检查报告备注
	@TableField(value = "status")
	private String status;                        // 系统状态
	@TableField(value = "createBy")
	private String createBy;                        // 创建人
	@TableField(value = "create_time")
	private Date createTime;                        // 创建时间
	@TableField(value = "modifiedBy")
	private String modifiedBy;                        // 修改人
	@TableField(value = "modified_time")
	private Date modifiedTime;                        // 修改时间
}