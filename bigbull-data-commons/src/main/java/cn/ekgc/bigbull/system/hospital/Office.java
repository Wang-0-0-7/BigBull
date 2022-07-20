package cn.ekgc.bigbull.system.hospital;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>大牛医疗信息平台-系统功能-医院科室信息实体</b>
 *
 * @author Lixubo
 * @date 2022/7/12
 */
@Data
@TableName("sys_office")
public class Office extends BaseEntity {
	private static final long serialVersionUID = 3161469702933138065L;
	@TableId(type = IdType.AUTO)
	private Long id;                            //主键
	private String department;                  //所属科室
	private String mr;                          //病历信息
	private String mrUrl;                       //病历链接
}
