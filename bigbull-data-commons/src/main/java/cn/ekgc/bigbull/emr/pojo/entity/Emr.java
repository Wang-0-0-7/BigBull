package cn.ekgc.bigbull.emr.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>大牛医疗信息平台-病历信息</b>
 *
 * @author Lixubo
 * @date 2022/7/13
 */
@Data
@TableName("sys_mr")
public class Emr extends BaseEntity {
	private static final long serialVersionUID = 1191421725774557793L;
	@TableId(type = IdType.ASSIGN_ID)
	private String id;                          //主键
	private String mrNo;                        //病历号
	private String visitNo;                     //就诊号
	private String docName;                     //文档标识-名称
	private String docCategoryCode;             //文档标识-类别代码
	private String docOrganization;             //文档标识-组织机构名称
	private String docOrganizationCode;         //文档标识-组织机构代码
	private String docNo;                       //文档标识-号码
	private Date docEffectiveDate;              //文档标识-生效日期
	private Date docExpiryDate;                 //文档标识-失效日期
	private String identifierCategoryCode;      //标识号-类别代码
	private String identifierNo;                //标识号-号码
	private String identifierOrganization;      //标识号-组织机构名称
	private String nameIdentifier;              //姓名-标识对象
	private String nameIdentifierCode;          //姓名-标识对象代码
	private String name;                        //姓名
	private String patientCode;                 //病人类型代码
	private String aboBlood;                    //血型ABO
	private String rhBlood;                     //血型RH
	private String age;                         //年龄
	private String nationality;                 //国籍
	private String nation;                      //民族
	private String marriage;                    //婚姻状况
	private String occupation;                  //职业编码系统名称
	private String occupationCode;              //职业代码
	private String culture;                     //文化程度
	private Date birthday;                      //出生日期
	private String birthplace;                  //出生地
	private String work;                        //工作单位
	private String addressCategoryCode;         //标识地址类别代码
	private String province;                    //所在省份
	private String city;                        //所在市
	private String district;                    //所在区县
	private String township;                    //乡镇
	private String village;                     //街道
	private String houseNo;                     //门牌号
	private String postCode;                    //邮政编码
	private String districtCode;                //行政区划代码
	private String medicalTreatment;            //医疗待遇名称
	private String medicalTreatmentCode;        //医疗待遇代码
	private String healthEvents;                //卫生事件名称
	private String eventsCategoryCode;          //事件分类代码
	private Date eventsStartTime;               //事件开始时间
	private String eventsLocation;              //事件发生地点
	private String eventsParticipants;          //事件参与方
	private String eventsCause;                 //事件发生原因
	private String eventsOutcome;               //事件结局
	private String mrStatus;                    //病历状态：0-待接诊，1-诊疗完毕，2-未接诊，3-接诊后转诊/院，4-挂号错误

}
