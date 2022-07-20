package cn.ekgc.bigbull.system.admin.pojo.vo;

import cn.ekgc.bigbull.base.pojo.vo.BaseVO;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * <b></b>
 *
 * @author Lixubo
 * @date 2022/7/14
 */
@Data
public class IdentityVO extends BaseVO {
	private static final long serialVersionUID = -4709637215763474130L;
	private Long id;                    //主键
	@NotBlank
	private String code;                //身份编码
	@NotBlank
	private String name;                //身份信息
}
