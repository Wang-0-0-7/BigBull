package cn.ekgc.bigbull.transfer.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>转诊（院）记录讯信息表</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("sys_r_adt_doctor")
public class RAdtDoctor extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId
    private String id;                        // 主键
	@TableField(value = "r_adt")
	private String rAdt;                        // 所属转诊（院）记录信息
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
	@TableField(value = "ici_role_address")
	private String iciRoleAddress;                        // 机构角色代码
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
	@TableField(value = "transfer_in_on")
	private String transferInOn;                        // 转入转出标记
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