package cn.ekgc.bigbull.opc.pojo.entity;


import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>门急诊病历通讯信息表</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("sys_opt_communication")
public class OptCommunication extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId
    private String id;                        // 主键
	@TableField(value = "opt")
	private String opt;                        // 所属门急诊病历
	@TableField(value = "phone_type")
	private String phoneType;                        // 联系电话类别
	@TableField(value = "phone_type_code")
	private String phoneTypeCode;                        // 联系电话-类别代码
	@TableField(value = "cellphone")
	private String cellphone;                        // 联系电话-号码
	@TableField(value = "email")
	private String email;                        // 电子邮件地址
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