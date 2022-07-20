package cn.ekgc.bigbull.patient.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>大牛医疗信息平台-病人-就诊信息</b>
 *
 * @author Lixubo
 * @date 2022/7/12
 */
@Data
@TableName("sys_patient_visit")
public class PatirentVisit extends BaseEntity {
	private static final long serialVersionUID = -3320844459286491879L;
	@TableId(type = IdType.ASSIGN_ID)
	private String id;                          //主键
	private String patient;                     //病人信息
	private String outpatientNo;                     //门诊号
}
