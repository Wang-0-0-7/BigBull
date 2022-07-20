package cn.ekgc.bigbull.system.admin.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>大牛医疗信息平台-系统功能-系统用户专业信息实体</b>
 *
 * @author Lixubo
 * @date 2022/7/12
 */
@Data
@TableName("sys_user_specialty")
public class Specialty extends BaseEntity {
	private static final long serialVersionUID = 2168924270254528645L;
	@TableId(type = IdType.AUTO)
	private Long id;                    //主键
	private String  system;             //系统人员
	private String major;               //专业信息
}
