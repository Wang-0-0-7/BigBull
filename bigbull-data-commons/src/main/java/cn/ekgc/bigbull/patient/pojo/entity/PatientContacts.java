package cn.ekgc.bigbull.patient.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>大牛医疗信息平台-病人-联系人信息</b>
 *
 * @author Lixubo
 * @date 2022/7/12
 */
@Data
@TableName("sys_patient_contacts")
public class PatientContacts extends BaseEntity {
	private static final long serialVersionUID = 6769815519970752863L;
	@TableId(type = IdType.ASSIGN_ID)
	private String id;                          //主键
	private String patient;                     //病人信息
	private String documentType;                //证件类型
	private String documentNo;                  //证件号
	private String contactsType;                //联系人类型
	private String name;                        //姓名
	private String cellphone;                   //联系电话
}
