package cn.ekgc.bigbull.patient.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>大牛医疗信息平台-病人信息</b>
 *
 * @author Lixubo
 * @date 2022/7/12
 */
@Data
@TableName("sys_")
public class Patient extends BaseEntity {
	private static final long serialVersionUID = -1034259000091702095L;
	@TableId(type = IdType.ASSIGN_ID)
	private String id;                          //主键
	private String mrNo;                    //病历号
	private String name;                        //姓名
	private String certificates;                //证件类型
	private String certificatesNo;              //证件号
	private Date effectiveDate;               //生效日期
	private Date expirationDate;              //失效日期
	private String lssuingAuthority;            //发证机关
	private String aboBlood;                    //血型ABO
	private String rhBlood;                     //血型RH
	private String gender;                      //性别
	private String nationality;                 //国籍
	private String nation;                      //民族
	private String marriage;                    //婚姻状况
	private String education;                   //文化程度
	private Date birthday;                    //出生日期
	private String birthplace;                  //出生地
}
