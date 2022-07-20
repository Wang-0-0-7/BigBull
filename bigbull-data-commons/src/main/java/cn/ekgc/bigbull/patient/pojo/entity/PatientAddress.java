package cn.ekgc.bigbull.patient.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>大牛医疗信息平台-病人-地址信息</b>
 *
 * @author Lixubo
 * @date 2022/7/12
 */
@Data
@TableName("sys_patient_address")
public class PatientAddress extends BaseEntity {
	private static final long serialVersionUID = -8402925681356900292L;
	@TableId(type = IdType.ASSIGN_ID)
	private String id;                                  //主键
	private String patient;                             //病人信息
	private String address;                             //地址类型
	private String province;                            //所在省份
	private String city;                                //所在市
	private String district;                            //所在区县
	private String township;                            //乡镇
	private String street;                              //街道
	private String houseNo;                             //门牌号
	private String postalCode;                          //邮政编码

}
