package cn.ekgc.bigbull.base.exception;

import cn.ekgc.bigbull.base.pojo.vo.ResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;
@RestControllerAdvice
/**
 * <b>系统异常处理</b>
 *
 * @author Lixubo
 * @date 2022/7/4
 */
public class GlobalExceptionHandler {
	//所有控制层所抛出的异常，都会交给该类进行处理，所产生的异常会记录在日志中
	//创建Logback 日志对象
	private Logger logger= LoggerFactory.getLogger(GlobalExceptionHandler.class);

	/**
	 * 处理控制层抛出的异常
	 * @param e
	 * @return
	 */
	@ExceptionHandler
	public ResponseVO globalExceptionHandler(Exception e){
		//记录日志信息
		logger.error(e.getMessage()+":"+new Date(),e);
		//返回系统业务响应试图信息
		return ResponseVO.getExceptionResponseVO(e);
	}
}
