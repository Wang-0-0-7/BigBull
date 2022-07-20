package cn.ekgc.bigbull.patient.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>大牛医疗信息平台-病人-医保信息</b>
 *
 * @author Lixubo
 * @date 2022/7/12
 */
@Data
@TableName("sys_patient_mi")
public class PatientMI extends BaseEntity {
	private static final long serialVersionUID = -1355722942073748789L;
	@TableId(type = IdType.ASSIGN_ID)
	private String id;                          //主键
	private String patient;                     //病人信息
	private String mi;                          //医保信息
}
