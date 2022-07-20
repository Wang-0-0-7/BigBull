package com.whackon.generator.service;

import com.whackon.generator.pojo.vo.GeneratorVO;

/**
 * <b>代码生成器业务层接口</b>
 *
 * @author Arthur
 * @date 2022/1/13
 * @version 1.0.0
 * @since 1.0.0
 */
public interface GeneratorService {
	/**
	 * <b>生成 MyBatis Plus 版本数据</b>
	 * @param generatorVO
	 * @return
	 * @throws Exception
	 */
	boolean createForMyBatisPlus(GeneratorVO generatorVO) throws Exception;
}
