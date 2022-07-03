package cn.ekgc.bigbull.base.pojo.vo;


import cn.ekgc.bigbull.base.pojo.enums.ResponseEnum;
import lombok.Data;

/**
 * <b>响应视图</b>
 *
 * @author Lixubo
 * @date 2022/7/2
 */
@Data
public class ResponseVO<E> {
	private Integer code;
	private String message;
	private E data;

	public ResponseVO(ResponseEnum code, String message) {
		this.code = code.getCode();
		this.message = message;
	}
	public ResponseVO(ResponseEnum code, String message,E data) {
		this.code = code.getCode();
		this.message = message;
		this.data=data;
	}
	/**
	 * 响应成功视图
	 * @return
	 */
	public static ResponseVO getSueeessResponseVO(String message){
		return new ResponseVO(ResponseEnum.RESPONSE_CODE_SUCCESS,message);
	}
	/**
	 * 响应成功视图
	 * @return
	 */
	public static ResponseVO getSueeessResponseVO(String message,Object data){
		return new ResponseVO(ResponseEnum.RESPONSE_CODE_SUCCESS,message,data);
	}

	/**
	 * 用户未登录认证
	 * @return
	 */
	public static ResponseVO getUnauthResponseVO(){
		return new ResponseVO(ResponseEnum.RESPONSE_CODE_UNAUTH,ResponseEnum.RESPONSE_CODE_UNAUTH.getRemak());
	}
	/**
	 * 获得系统处理异常视图信息
	 * @return
	 */
	public static ResponseVO getExceptionResponseVO(Exception e){
		return new ResponseVO(ResponseEnum.RESPONSE_CODE_EXCEPTION,e.getMessage(),e);
	}
	/**
	 * 获得系统业务失败视图信息
	 * @return
	 */
	public static ResponseVO getFailure(String message){
		return new ResponseVO(ResponseEnum.RESPONSE_CODE_FAILURE,message);
	}

	/**
	 * 获得系统业务失败视图信息
	 * @return
	 */
	public static ResponseVO getFailure(Object date){
		return new ResponseVO(ResponseEnum.RESPONSE_CODE_FAILURE,ResponseEnum.RESPONSE_CODE_FAILURE.getRemak(), date);
	}
}
