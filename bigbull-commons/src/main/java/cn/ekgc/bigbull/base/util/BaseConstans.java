package cn.ekgc.bigbull.base.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

/**
 * <b></b>
 *
 * @author Lixubo
 * @date 2022/7/3
 */
public class BaseConstans {

	private static Logger logger= LoggerFactory.getLogger(BaseConstans.class);
	private static Properties pops= new Properties();

	static {
		try {
			pops.load(BaseConstans.class.getClassLoader().getResourceAsStream("props/base.properties"));
		} catch (IOException e) {
			//将产生的已成信息记录在日志
			logger.error(e.getMessage()+":"+new Date(),e);
			throw new RuntimeException(e);
		}
	}

	/**
	 * page
	 */
	public static final Integer PAGE_NUM=Integer.parseInt(pops.getProperty("page.num"));
	public static final Integer PAGE_SIZE=Integer.parseInt(pops.getProperty("page.size"));
	/**
	 * status
	 */
	//状态启用
	public static final String STATUS_ENABLE=pops.getProperty("status.enable");
	//状态禁用
	public static final String STATUS_DISABLE=pops.getProperty("status.disable");
	/**
	 * response
	 */
	public static final Integer RESPONSE_SUCCESS=Integer.parseInt(pops.getProperty("response.success"));
	public static final Integer RESPONSE_UNAUTH=Integer.parseInt(pops.getProperty("response.unauth"));
	public static final Integer RESPONSE_FAILURE=Integer.parseInt(pops.getProperty("response.failure"));
	public static final Integer RESPONSE_EXCEPTION=Integer.parseInt(pops.getProperty("response.exception"));
	/**
	 * token
	 */
	public static final String TOKEN_HEADERS=pops.getProperty("base.token.header");
	public static final String TOKEN_SECRET=pops.getProperty("base.token.secret");
	public static final Integer TOKEN_EXPIRE=Integer.parseInt(pops.getProperty("base.token.expire"));
}
