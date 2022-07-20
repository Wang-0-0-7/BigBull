package cn.ekgc.bigbull.opc.pojo.entity;


import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>门急诊病历过敏史信息表</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("sys_opt_allergy")
public class OptAllergy extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId
    private String id;                        // 主键
	@TableField(value = "opt")
	private String opt;                        // 所属门急诊病历
	@TableField(value = "allergy")
	private String allergy;                        // 过敏史
	@TableField(value = "allergen")
	private String allergen;                        // 过敏原
	@TableField(value = "symptoms")
	private String symptoms;                        // 过敏症状
	@TableField(value = "symptoms_code")
	private String symptomsCode;                        // 过敏症状代码
	@TableField(value = "allergen_code")
	private String allergenCode;                        // 过敏原代码
	@TableField(value = "medicine")
	private String medicine;                        // 过敏药物名称
	@TableField(value = "Illness_code")
	private String IllnessCode;                        // 过敏病情状态代码
	@TableField(value = "serious_code")
	private String seriousCode;                        // 过敏严重性代码
	@TableField(value = "identification_code")
	private String identificationCode;                        // 过敏史标识代码
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