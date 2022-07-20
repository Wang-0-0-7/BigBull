package cn.ekgc.bigbull.opc.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>门急诊病历医嘱信息表</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("sys_opt_medical_advice")
public class OptMedicalAdvice extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId
    private String id;                        // 主键
	@TableField(value = "opt")
	private String opt;                        // 所属门急诊病历
	@TableField(value = "category")
	private String category;                        // 医嘱类别
	@TableField(value = "content")
	private String content;                        // 医嘱内容
	@TableField(value = "start_time")
	private Date startTime;                        // 医嘱开嘱时间
	@TableField(value = "stop_time")
	private Date stopTime;                        // 长期医嘱停嘱时间
	@TableField(value = "execution_time")
	private Date executionTime;                        // 医嘱执行时间
	@TableField(value = "time_type")
	private String timeType;                        // 医嘱执行时间类别代码
	@TableField(value = "cancel_time")
	private Date cancelTime;                        // 医嘱取消时间
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