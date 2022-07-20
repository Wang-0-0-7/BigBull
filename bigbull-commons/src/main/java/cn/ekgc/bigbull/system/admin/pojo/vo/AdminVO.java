package cn.ekgc.bigbull.system.admin.pojo.vo;

import cn.ekgc.bigbull.base.pojo.vo.BaseVO;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * <b>大牛医疗信息平台-系统功能-系统用户视图信息</b>
 *
 * @author Lixubo
 * @date 2022/7/14
 */
@Data
public class AdminVO extends BaseVO {
	private static final long serialVersionUID = -6893729320036795971L;
	private String id;                  //主键
	private String no;                  //工号
	@NotBlank
	private String name;                //姓名
	@NotBlank
	@Pattern(regexp = "1[0-9]{10}")
	private String cellphone;           //电话号码
	@Pattern(regexp = "[a-zA-Z0-9@-_#$]{6,10}")
	private String password;            //登录密码
	private String position;            //职位
	private String identity;            //身份
	private String department;          //所属部门
	@Pattern(regexp = "/^[1-9]\\d{5}(18|19|20)\\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$/")
	private String idCard;              //身份证号
	private String techTitle;           //专业技术职称
	private String education;           //学历
}
