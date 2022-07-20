package cn.ekgc.bigbull.opc.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>门急诊病历既往史信息表</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("sys_opt_phx")
public class OptPhx extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId
    private String id;                        // 主键
	@TableField(value = "opt")
	private String opt;                        // 所属门急诊病历
	@TableField(value = "entry")
	private String entry;                        // 既往观察-项目名称
	@TableField(value = "entry_category_code")
	private String entryCategoryCode;                        // 既往观察-项目分类代码
	@TableField(value = "entry_code_name")
	private String entryCodeName;                        // 既往观察-项目代码名称
	@TableField(value = "entry_code")
	private String entryCode;                        // 既往观察-项目代码
	@TableField(value = "result")
	private String result;                        // 既往观察-结果
	@TableField(value = "obs_name")
	private String obsName;                        // 既往史观察项目类目名称
	@TableField(value = "obs_result")
	private String obsResult;                        // 既往史观察结果
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