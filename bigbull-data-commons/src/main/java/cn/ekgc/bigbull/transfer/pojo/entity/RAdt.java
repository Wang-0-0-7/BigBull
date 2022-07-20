package cn.ekgc.bigbull.transfer.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>转诊（院）记录信息表</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("sys_r_adt")
public class RAdt extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId
    private String id;                        // 主键
	@TableField(value = "visit_no")
	private String visitNo;                        // 门诊号
	@TableField(value = "mr_no")
	private String mrNo;                        // 病历号
	@TableField(value = "doc_name")
	private String docName;                        // 文档标识-名称
	@TableField(value = "doc_category_code")
	private String docCategoryCode;                        // 文档标识-类别代码
	@TableField(value = "doc_organization")
	private String docOrganization;                        // 文档标识-管理机构名称
	@TableField(value = "doc_organization_code")
	private String docOrganizationCode;                        // 文档标识-管理机构组织机构代码（法人代码）
	@TableField(value = "doc_no")
	private String docNo;                        // 文档标识-号码
	@TableField(value = "doc_effective_date")
	private Date docEffectiveDate;                        // 文档标识-生效日期
	@TableField(value = "doc_expiry_date")
	private Date docExpiryDate;                        // 文档标识-失效日期
	@TableField(value = "identifier_category_code")
	private String identifierCategoryCode;                        // 标识号-类别代码
	@TableField(value = "identifier_no")
	private String identifierNo;                        // 标识号-号码
	@TableField(value = "identifier_effective_date")
	private Date identifierEffectiveDate;                        // 标识号-生效日期
	@TableField(value = "identifier_organization")
	private String identifierOrganization;                        // 标识号-提供标识的机构名称
	@TableField(value = "name_identifier")
	private String nameIdentifier;                        // 姓名-标识对象
	@TableField(value = "name_identifierCode")
	private String nameIdentifierCode;                        // 姓名-标识对象代码
	@TableField(value = "name")
	private String name;                        // 姓名
	@TableField(value = "patient_code")
	private String patientCode;                        // 病人类型代码
	@TableField(value = "gender")
	private String gender;                        // 性别代码
	@TableField(value = "age")
	private String age;                        // 年龄（岁）
	@TableField(value = "nationality")
	private String nationality;                        // 国籍代码
	@TableField(value = "nation")
	private String nation;                        // 民族代码
	@TableField(value = "marriage")
	private String marriage;                        // 婚姻状况类别代码
	@TableField(value = "culture")
	private String culture;                        // 文化程度代码
	@TableField(value = "occupation")
	private String occupation;                        // 职业编码系统名称
	@TableField(value = "occupation_code")
	private String occupationCode;                        // 职业代码
	@TableField(value = "birthday")
	private Date birthday;                        // 出生日期
	@TableField(value = "birthplace")
	private String birthplace;                        // 出生地
	@TableField(value = "work")
	private String work;                        // 工作单位名称
	@TableField(value = "address_category_code")
	private String addressCategoryCode;                        // 标识地址类别的代码
	@TableField(value = "province")
	private String province;                        // 地址-省（自治区、直辖市）
	@TableField(value = "city")
	private String city;                        // 地址-市（地区）
	@TableField(value = "district")
	private String district;                        // 地址-县（区）
	@TableField(value = "township")
	private String township;                        // 地址-乡（镇、街道办事处）
	@TableField(value = "village")
	private String village;                        // 地址-村（街、路、弄等）
	@TableField(value = "houseNo")
	private String houseNo;                        // 地址-门牌号码
	@TableField(value = "post_code")
	private String postCode;                        // 邮政编码
	@TableField(value = "district_code")
	private String districtCode;                        // 行政区划代码
	@TableField(value = "obs_categroy")
	private String obsCategroy;                        // 观察-类别
	@TableField(value = "obs_categroy_code")
	private String obsCategroyCode;                        // 观察-类别代码
	@TableField(value = "sym_project")
	private String symProject;                        // 观察项目名称
	@TableField(value = "sym_project_code")
	private String symProjectCode;                        // 观察项目-代码
	@TableField(value = "obs_result")
	private String obsResult;                        // 观察-结果描述
	@TableField(value = "healthEvents")
	private String healthEvents;                        // 卫生事件(动作)名称
	@TableField(value = "eventsCategoryCode")
	private String eventsCategoryCode;                        // 事件分类代码
	@TableField(value = "eventsStartTime")
	private Date eventsStartTime;                        // 事件开始时间
	@TableField(value = "eventsLocation")
	private String eventsLocation;                        // 事件发生地点
	@TableField(value = "eventsParticipants")
	private String eventsParticipants;                        // 事件参与方
	@TableField(value = "eventsCause")
	private String eventsCause;                        // 事件发生原因
	@TableField(value = "eventsOutcome")
	private String eventsOutcome;                        // 事件结局
	@TableField(value = "imp_organization")
	private String impOrganization;                        // 诊断机构名称
	@TableField(value = "date")
	private Date date;                        // 诊断日期
	@TableField(value = "category")
	private String category;                        // 诊断类别
	@TableField(value = "code")
	private String code;                        // 诊断类别代码
	@TableField(value = "seq_code")
	private String seqCode;                        // 诊断顺位（从属关系）代码
	@TableField(value = "disease")
	private String disease;                        // 疾病名称
	@TableField(value = "disease_code")
	private String diseaseCode;                        // 疾病代码
	@TableField(value = "basis")
	private String basis;                        // 诊断依据
	@TableField(value = "basis_code")
	private String basisCode;                        // 诊断依据代码
	@TableField(value = "dat_process")
	private String datProcess;                        // 诊疗过程名称
	@TableField(value = "dat_describe")
	private String datDescribe;                        // 诊疗过程描述
	@TableField(value = "mrStatus")
	private String mrStatus;                        // 病历状态：0-待接诊，1-诊疗完毕，2-未接诊，3-接诊后转诊/院，4-挂号错误
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