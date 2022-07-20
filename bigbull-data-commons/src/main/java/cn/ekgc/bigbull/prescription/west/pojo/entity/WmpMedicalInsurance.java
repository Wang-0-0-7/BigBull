package cn.ekgc.bigbull.prescription.west.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>西医处方医疗保险信息表</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("sys_wmp_medical_insurance")
public class WmpMedicalInsurance extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId
    private Long id;                        // 主键
	@TableField(value = "wmp")
	private String wmp;                        // 所属西医处方
	@TableField(value = "mi_category")
	private String miCategory;                        // 医保类别
	@TableField(value = "mi_category_code")
	private String miCategoryCode;                        // 医保类别代码
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