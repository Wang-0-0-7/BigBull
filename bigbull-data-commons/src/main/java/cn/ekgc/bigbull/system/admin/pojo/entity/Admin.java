package cn.ekgc.bigbull.system.admin.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>大牛医疗信息平台-系统功能-系统用户实体信息</b>
 *
 * @author Lixubo
 * @date 2022/7/12
 */
@Data
@TableName("sys_admin")
public class Admin extends BaseEntity {
	private static final long serialVersionUID = 6582623073969808554L;
	@TableId(type = IdType.ASSIGN_ID)
	private String id;                  //主键
	private String no;                  //工号
	private String name;                //姓名
	private String cellphone;           //电话号码
	private String password;            //登录密码
	private String position;            //职位
	private String identity;            //身份
	private String department;          //所属部门
	private String idCard;              //身份证号
	private String techTitle;           //专业技术职称
	private String education;           //学历
}
