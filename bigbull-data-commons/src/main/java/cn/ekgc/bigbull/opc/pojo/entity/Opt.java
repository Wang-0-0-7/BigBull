package cn.ekgc.bigbull.opc.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>门急诊病历信息表</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("sys_opt")
public class Opt extends BaseEntity {
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
	@TableField(value = "organization")
	private String organization;                        // 机构名称
	@TableField(value = "organization_code")
	private String organizationCode;                        // 机构组织代码
	@TableField(value = "legal_person")
	private String legalPerson;                        // 机构负责人（法人）
	@TableField(value = "department")
	private String department;                        // 科室名称
	@TableField(value = "ici_role")
	private String iciRole;                        // 机构角色
	@TableField(value = "ici_role_code")
	private String iciRoleCode;                        // 机构角色代码
	@TableField(value = "server_name")
	private String serverName;                        // 服务者姓名
	@TableField(value = "server_role")
	private String serverRole;                        // 服务者职责（角色）
	@TableField(value = "server_role_code")
	private String serverRoleCode;                        // 服务者职责（角色）代码
	@TableField(value = "server_tech_post")
	private String serverTechPost;                        // 服务者专业技术职务
	@TableField(value = "server_edu")
	private String serverEdu;                        // 服务者学历
	@TableField(value = "server_major")
	private String serverMajor;                        // 服务者所学专业
	@TableField(value = "server_grade")
	private String serverGrade;                        // 服务者专业技术职务等级
	@TableField(value = "server_post")
	private String serverPost;                        // 服务者职务
	@TableField(value = "complained")
	private String complained;                        // 主诉
	@TableField(value = "sym")
	private String sym;                        // 症状代码编码体系名称
	@TableField(value = "sym_code")
	private String symCode;                        // 症状代码
	@TableField(value = "sym_start_time")
	private Date symStartTime;                        // 症状开始时间
	@TableField(value = "sym_end_time")
	private Date symEndTime;                        // 症状停止时间
	@TableField(value = "sym_dou_code")
	private String symDouCode;                        // 症状急性程度代码
	@TableField(value = "first_visit")
	private String firstVisit;                        // 初诊标志
	@TableField(value = "obs_categroy")
	private String obsCategroy;                        // 观察-类别
	@TableField(value = "obs_categroy_code")
	private String obsCategroyCode;                        // 观察-类别代码
	@TableField(value = "obs_result")
	private String obsResult;                        // 观察-结果描述
	@TableField(value = "obs_value")
	private String obsValue;                        // 观察-结果(数值)
	@TableField(value = "obs_unit")
	private String obsUnit;                        // 观察-计量单位
	@TableField(value = "obs_result_code")
	private String obsResultCode;                        // 观察-结果代码
	@TableField(value = "inspect")
	private String inspect;                        // 拟做的检查
	@TableField(value = "treatment_plan")
	private String treatmentPlan;                        // 今后治疗方案
	@TableField(value = "follow_interval")
	private String followInterval;                        // 随访间隔（随诊期限）
	@TableField(value = "medical_advice")
	private String medicalAdvice;                        // 医嘱特别主要事项
	@TableField(value = "consulting")
	private String consulting;                        // 诊疗过程名称
	@TableField(value = "consulting_describe")
	private String consultingDescribe;                        // 诊疗过程描述
	@TableField(value = "mrStatus")
	private String mrStatus;                        // 病历状态
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