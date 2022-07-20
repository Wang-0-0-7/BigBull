package cn.ekgc.bigbull.eor.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>急留观病历概要诊疗计划信息表</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("sys_eor_tp")
public class EorTp extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId
    private String id;                        // 主键
	@TableField(value = "eor")
	private String eor;                        // 所属急留观病历
	@TableField(value = "inspect")
	private String inspect;                        // 拟做的检查
	@TableField(value = "medical_examination")
	private String medicalExamination;                        // 拟做的医学检验
	@TableField(value = "after_tp")
	private String afterTp;                        // 今后治疗方案
	@TableField(value = "Follow_up")
	private String FollowUp;                        // 随访标志
	@TableField(value = "Follow_up_interval")
	private String FollowUpInterval;                        // 随访间隔（随诊期限）
	@TableField(value = "medical_advice")
	private String medicalAdvice;                        // 医嘱
	@TableField(value = "precautions")
	private String precautions;                        // 特别注意事项
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