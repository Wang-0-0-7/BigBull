package cn.ekgc.bigbull.system.admin.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>大牛医疗信息平台-系统功能-系统职位信息实体</b>
 *
 * @author Lixubo
 * @date 2022/7/12
 */
@Data
@TableName("sys_position")
public class Position extends BaseEntity {
	private static final long serialVersionUID = 8617560367496092161L;
	@TableId(type = IdType.AUTO)
	private Long id;                        //主键
	private String department;              //所属部门
	private String post;                    //职务
	private String code;                    //职务编码
}
