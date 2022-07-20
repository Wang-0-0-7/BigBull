package cn.ekgc.bigbull.emr.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>病历概要医疗费用信息表</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("sys_mr_medical_bill")
public class MrMedicalBill extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId
    private String id;                        // 主键
	@TableField(value = "mr")
	private String mr;                        // 病历概要
	@TableField(value = "opc_category")
	private String opcCategory;                        // 门诊费用-分类
	@TableField(value = "opc_category_code")
	private String opcCategoryCode;                        // 门诊费用-分类代码
	@TableField(value = "opc_expenses")
	private String opcExpenses;                        // 门诊费用-金额（元/人民币）
	@TableField(value = "opc_payment")
	private String opcPayment;                        // 门诊费用-支付方式代码
	@TableField(value = "hos_category")
	private String hosCategory;                        // 住院费用-分类
	@TableField(value = "hos_category_code")
	private String hosCategoryCode;                        // 住院费用-分类代码
	@TableField(value = "hos_expenses")
	private String hosExpenses;                        // 住院费用-金额（元/人民币）
	@TableField(value = "personal_expenses")
	private String personalExpenses;                        // 个人承担费用（元）
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