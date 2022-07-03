package cn.ekgc.bigbull.base.util;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * <b>Redis 操作工具类</b>
 * @author Arthur
 */
@Component("redisUtil")
public class RedisUtil {
	@Autowired
	private StringRedisTemplate redisTemplate;

	/**
	 * <b>根据 key 将对应的 value 存储到 Redis 中</b>
	 * @param key
	 * @param value
	 * @param expireSec
	 * @return
	 * @throws Exception
	 */
	public boolean saveToRedis(String key, Object value, Integer expireSec) throws Exception {
		// 创建 JsonMapper
		JsonMapper jsonMapper = new JsonMapper();
		// 将 Object 类型的 value 变为 String 类型的 JSON
		String valueJSON = jsonMapper.writeValueAsString(value);
		// 根据 key，将 value 存储到 Redis 中
		redisTemplate.opsForValue().set(key, valueJSON);
		// 判断是否设置存储的时长
		if (expireSec != null && expireSec > 0) {
			// 设置存储时间
			redisTemplate.expire(key, expireSec, TimeUnit.SECONDS);
		}
		return true;
	}

	/**
	 * <b>根据 key 从 Redis 中获取 value</b>
	 * @param key
	 * @param valueType
	 * @return
	 * @throws Exception
	 */
	public Object getFromRedis(String key, Class valueType) throws Exception {
		// 根据 key 从 Redis 取出对应的 JSON 信息
		String valueJSON = redisTemplate.opsForValue().get(key);
		if (valueJSON != null && valueJSON.trim().length() > 0) {
			// 根据 key 获取到了有效的 value 信息
			// 创建 JsonMapper
			JsonMapper jsonMapper = new JsonMapper();
			// 根据所给定的类型，进行转换
			return jsonMapper.readValue(valueJSON, valueType);
		}
		return null;
	}

	/**
	 * <b>根据 key 从 Redis 中移除信息</b>
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public boolean removeFromRedis(String key) throws Exception {
		// 根据 key 从 Redis 中移除对应的信息
		return redisTemplate.delete(key);
	}
}
