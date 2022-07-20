package cn.ekgc.bigbull.opc.pojo.entity;


import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>门急诊病历诊断信息表</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("sys_opt_dx")
public class OptDx extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId
    private String id;                        // 主键
	@TableField(value = "opt")
	private String opt;                        // 所属门急诊病历
	@TableField(value = "organization")
	private String organization;                        // 诊断机构名称
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