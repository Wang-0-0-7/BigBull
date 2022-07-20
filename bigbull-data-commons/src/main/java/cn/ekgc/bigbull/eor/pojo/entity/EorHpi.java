package cn.ekgc.bigbull.eor.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>急留观病历概要现病史信息表</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("sys_eor_hpi")
public class EorHpi extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId
    private String id;                        // 主键
	@TableField(value = "eor")
	private Date eor;                        // 所属急留观病历
	@TableField(value = "onset_ime")
	private String onsetIme;                        // 起病时间
	@TableField(value = "solar_terms")
	private String solarTerms;                        // 起病节气归属代码
	@TableField(value = "onset_condition")
	private String onsetCondition;                        // 起病情况描述
	@TableField(value = "pathogeny")
	private String pathogeny;                        // 症状开始原因/诱因
	@TableField(value = "symptoms")
	private String symptoms;                        // 症状特点
	@TableField(value = "accompanied")
	private String accompanied;                        // 伴随症状
	@TableField(value = "dat_process")
	private String datProcess;                        // 本疾病既往诊疗经过
	@TableField(value = "ondition_after_onset")
	private String onditionAfterOnset;                        // 起病后一般情况
	@TableField(value = "basic_disease")
	private String basicDisease;                        // 基础疾病诊疗情况
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