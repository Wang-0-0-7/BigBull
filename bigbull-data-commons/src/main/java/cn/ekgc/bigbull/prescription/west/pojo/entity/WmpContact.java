package cn.ekgc.bigbull.prescription.west.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>西医处方联系人详情表</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("sys_wmp_contact")
public class WmpContact extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId
    private Long id;                        // 主键
	@TableField(value = "wmp")
	private String wmp;                        // 所属西医处方
	@TableField(value = "identification_code")
	private String identificationCode;                        // 标识号-类别代码
	@TableField(value = "identification_no")
	private String identificationNo;                        // 标识号-号码
	@TableField(value = "identification_effective_date")
	private Date identificationEffectiveDate;                        // 标识号-生效日期
	@TableField(value = "name_identify_objects")
	private String nameIdentifyObjects;                        // 姓名-标识对象
	@TableField(value = "name_identify_code")
	private String nameIdentifyCode;                        // 姓名-标识对象代码
	@TableField(value = "name")
	private String name;                        // 姓名
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