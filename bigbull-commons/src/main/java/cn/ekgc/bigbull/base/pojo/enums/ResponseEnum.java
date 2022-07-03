package cn.ekgc.bigbull.base.pojo.enums;

import cn.ekgc.bigbull.base.util.BaseConstans;

/**
 * <b>响应视图枚举</b>
 *@author Lixubo
 *@date 2022/7/2
 */
public enum ResponseEnum {
	RESPONSE_CODE_SUCCESS(BaseConstans.RESPONSE_SUCCESS,"系统业务响应处理成功"),
	RESPONSE_CODE_UNAUTH(BaseConstans.RESPONSE_UNAUTH,"用户未认证"),
	RESPONSE_CODE_FAILURE(BaseConstans.RESPONSE_FAILURE,"系统业务响应处理失败"),
	RESPONSE_CODE_EXCEPTION(BaseConstans.RESPONSE_EXCEPTION,"统系业务响应处理异常");
	private Integer code;                   //响应编码
	private String remak;                   //响应信息

	private ResponseEnum(Integer code, String remak) {
		this.code = code;
		this.remak = remak;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemak() {
		return remak;
	}

	public void setRemak(String remak) {
		this.remak = remak;
	}
}
