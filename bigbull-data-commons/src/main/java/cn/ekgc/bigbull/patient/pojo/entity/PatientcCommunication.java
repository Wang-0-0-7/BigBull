package cn.ekgc.bigbull.patient.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>大牛医疗信息平台-病人-通信信息</b>
 *
 * @author Lixubo
 * @date 2022/7/12
 */
@Data
@TableName("sys_patient_communication")
public class PatientcCommunication extends BaseEntity {
	private static final long serialVersionUID = -6653220122271470318L;
	@TableId(type = IdType.ASSIGN_ID)
	private String id;                          //主键
	private String patient;                     //病人信息
	private String phoneType;                   //联系电话类型
	private String phoneTypeCode;                   //联系电话类型
	private String cellphone;                   //联系电话
	private String email;                       //电子邮件
}
