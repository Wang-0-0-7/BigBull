package com.whackon.generator.dao;

import com.whackon.generator.pojo.entity.TableEntity;
import com.whackon.generator.util.mysqlconnection.MySQLConnection;

import java.util.List;

/**
 * <b>代码生成器数据持久层接口</b>
 *
 * @author Arthur
 * @date 2022/1/13
 * @version 1.0.0
 * @since 1.0.0
 */
public interface GeneratorDao {
	/**
	 * <b>根据连接信息和对应的表获得数据表列表信息</b>
	 * @param mySQLConnection
	 * @param tableNames
	 * @return
	 * @throws Exception
	 */
	List<TableEntity> findTableEntityList(MySQLConnection mySQLConnection, String tableNames) throws Exception;
}
