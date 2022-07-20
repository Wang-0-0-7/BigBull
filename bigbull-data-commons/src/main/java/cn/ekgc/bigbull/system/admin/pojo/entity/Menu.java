package cn.ekgc.bigbull.system.admin.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>大牛医疗信息平台-系统功能-系统功能菜单</b>
 *
 * @author Lixubo
 * @date 2022/7/12
 */
@Data
@TableName("sys_menu")
public class Menu extends BaseEntity {
	private static final long serialVersionUID = 1720043213304141097L;
	@TableId(type = IdType.AUTO)
	private Long id;                    //主键
	private String parent;              //上级功能
	private String name;                //功能名称
	private String code;                //功能编号
	private String url;                 //链接地址
	private String icon;                //图标
	private String order;              //顺序
}
