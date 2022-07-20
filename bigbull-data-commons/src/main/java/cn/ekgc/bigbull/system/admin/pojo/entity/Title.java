package cn.ekgc.bigbull.system.admin.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>大牛医疗信息平台-系统功能-系统职称信息实体</b>
 *
 * @author Lixubo
 * @date 2022/7/12
 */
@Data
@TableName("sys_title")
public class Title extends BaseEntity {
	private static final long serialVersionUID = -4691533109467186314L;
	@TableId(type = IdType.AUTO)
	private Long id;                        //主键
	private String category;                //所属类别
	private String grade;                   //所属等级
	private String post;                    //职务
	private String code;                    //职务编码
}
