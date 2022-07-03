package cn.ekgc.bigbull.base.util;

import java.io.IOException;
import java.util.Properties;

/**
 * <b></b>
 *
 * @author Lixubo
 * @date 2022/7/3
 */
public class BaseConstans {

	private static Properties pops= new Properties();

	static {
		try {
			pops.load(BaseConstans.class.getClassLoader().getResourceAsStream("props/base.properties"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * page
	 */
	public static final Integer PAGE_NUM=Integer.parseInt(pops.getProperty("page.num"));
	public static final Integer PAGE_SIZE=Integer.parseInt(pops.getProperty("page.size"));
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
}
