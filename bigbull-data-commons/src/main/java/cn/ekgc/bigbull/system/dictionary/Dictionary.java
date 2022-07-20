package cn.ekgc.bigbull.system.dictionary;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>大牛医疗信息平台-系统功能-数据字典信息</b>
 *
 * @author Lixubo
 * @date 2022/7/12
 */
@Data
@TableName("sys_dictionary")
public class Dictionary extends BaseEntity {
	private static final long serialVersionUID = 8731165130604599041L;
	@TableId(type = IdType.AUTO)
	private Long id;                    //主键
	private String parent;              //上级字典
	private String code;              //编码
	private String name;              //字典名称
}
