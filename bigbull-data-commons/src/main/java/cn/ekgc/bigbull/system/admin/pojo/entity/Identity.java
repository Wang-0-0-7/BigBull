package cn.ekgc.bigbull.system.admin.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b></b>
 *
 * @author Lixubo
 * @date 2022/7/14
 */
@Data
@TableName("sys_identity")
public class Identity extends BaseEntity {
	private static final long serialVersionUID = 9075620787571681687L;
	@TableId(type = IdType.AUTO)
	private Long id;                    //主键
	private String code;                //身份编码
	private String name;                //身份信息
}
