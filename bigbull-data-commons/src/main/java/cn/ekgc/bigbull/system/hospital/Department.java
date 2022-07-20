package cn.ekgc.bigbull.system.hospital;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>大牛医疗信息平台-系统功能-医院部门信息实体</b>
 *
 * @author Lixubo
 * @date 2022/7/12
 */
@Data
@TableName("sys_department")
public class Department extends BaseEntity {
	private static final long serialVersionUID = 2279070730073444759L;
	@TableId(type = IdType.AUTO)
	private Long id;                            //主键
	private String hospital;                    //所属医院
	private String parent;                      //上级部门
	private String name;                        //部门名称
	private String code;                        //部门编码
}
