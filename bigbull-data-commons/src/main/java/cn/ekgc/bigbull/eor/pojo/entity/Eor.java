package cn.ekgc.bigbull.eor.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>门急诊留观病历概要信息表</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("sys_eor")
public class Eor extends BaseEntity {
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
	@TableField(value = "sym_describe")
	private String symDescribe;                        // 症状描述
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
	@TableField(value = "obs_value")
	private String obsValue;                        // 观察-结果(数值)
	@TableField(value = "obs_unit")
	private String obsUnit;                        // 观察-计量单位
	@TableField(value = "obs_result_code")
	private String obsResultCode;                        // 观察-结果代码
	@TableField(value = "hpr_code")
	private String hprCode;                        // 个人史危险因素代码
	@TableField(value = "hpr")
	private String hpr;                        // 个人史观察项目类目名称
	@TableField(value = "hpr_result")
	private String hprResult;                        // 个人史观察结果
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
	@TableField(value = "progress_type")
	private String progressType;                        // 病程记录类别
	@TableField(value = "progress_content")
	private String progressContent;                        // 病程记录内容
	@TableField(value = "treatment_type_code")
	private String treatmentTypeCode;                        // 治疗类别代码
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