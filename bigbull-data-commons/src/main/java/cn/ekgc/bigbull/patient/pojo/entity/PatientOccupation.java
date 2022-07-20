package cn.ekgc.bigbull.patient.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b></b>
 *
 * @author Lixubo
 * @date 2022/7/12
 */
@Data
@TableName("sys_patient_occupation")
public class PatientOccupation extends BaseEntity {
	private static final long serialVersionUID = 6852491904583880869L;
	@TableId(type = IdType.ASSIGN_ID)
	private String id;                          //主键
	private String patient;                     //病人信息
	private String occupation;                     //职业信息
}
