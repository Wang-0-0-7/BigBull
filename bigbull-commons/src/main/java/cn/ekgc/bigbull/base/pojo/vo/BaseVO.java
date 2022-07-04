package cn.ekgc.bigbull.base.pojo.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>基础视图</b>
 *
 * @author Lixubo
 * @date 2022/7/2
 */
@Data
public class BaseVO implements Serializable {
	private static final long serialVersionUID = 266098485552033479L;

	private String status;                  //系统状态：Y 启用，N 禁用
	private String createBy;                //创建人
	private Date createTime;                //创建时间
	private String modifiedBy;              //修改人
	private Date modifiedTime;              //修改时间

}
