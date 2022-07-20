package cn.ekgc.bigbull.prescription.west.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>西医处方用药信息表</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("sys_wmp_medication")
public class WmpMedication extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId
    private String id;                        // 主键
	@TableField(value = "wmp")
	private String wmp;                        // 所属西医处方
	@TableField(value = "drug_usage")
	private String drugUsage;                        // 药物用法
	@TableField(value = "frequency")
	private String frequency;                        // 药物使用-频率
	@TableField(value = "company")
	private String company;                        // 药物使用-剂量单位
	@TableField(value = "dose")
	private String dose;                        // 药物使用-次剂量
	@TableField(value = "total_dose")
	private String totalDose;                        // 药物使用-总剂量
	@TableField(value = "channel_code")
	private String channelCode;                        // 药物使用-途径代码
	@TableField(value = "name")
	private String name;                        // 药物名称
	@TableField(value = "dosage_code")
	private String dosageCode;                        // 药物剂型代码
	@TableField(value = "category")
	private String category;                        // 药物类型
	@TableField(value = "code")
	private String code;                        // 药物名称代码
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