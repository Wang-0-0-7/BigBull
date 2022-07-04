package cn.ekgc.bigbull.base.util;

import cn.hutool.core.util.StrUtil;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <b>Token工具类</b>
 *
 * @author Lixubo
 * @date 2022/7/4
 */
public class TokenUtil {
	private static final String PAYLOAD_KEY="payload";

	/**
	 * 创建token
	 * @param value
	 * @param expireSec
	 * @return
	 */
	public static String createToken(Object value,Integer expireSec){
	//创建有效载荷对应map集合
		Map<String,Object> payloadMap=new HashMap<String,Object>();
		// 设置所给定的对象为有效载荷信息
		payloadMap.put(PAYLOAD_KEY, value);
		// 设置生成 Token 的有效时长
		// 根据所存储的时长，获得对应过期的 Date 类型
		// 获得当前的时间毫秒，加上有效期的毫秒时长
		Long expireMillis = System.currentTimeMillis() + expireSec * 1000;
		// 根据最终的毫秒数获得 Date 类型
		Date expireDate = new Date(expireMillis);
		payloadMap.put(JWT.EXPIRES_AT, expireDate);

		// 生成对应的 Token
		return JWTUtil.createToken(payloadMap, BaseConstans.TOKEN_SECRET.getBytes());
	}

	/**
	 * 校验token 并获得对应的载荷
	 * @param token
	 * @return
	 */
	public static Object validateToken(String token) {
		if (StrUtil.isNotBlank(token) && JWTUtil.verify(token, BaseConstans.TOKEN_SECRET.getBytes())) {
			// 此时 Token 存在，并且校验有效，解析 Token 获得对应的信息
			return JWTUtil.parseToken(token).getPayload(PAYLOAD_KEY);
		}
		return null;
	}

}
