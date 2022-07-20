package com.whackon.generator.util.mysqlconnection;

import java.sql.Connection;

/**
 * <b>扩展 JDBC MySQL 连接 Connection 对象</b>
 *
 * @author Arthur
 * @date 2022/1/13
 * @version 1.0.0
 * @since 1.0.0
 */
public class MySQLConnection {
	private Connection connection;                      // JDBC 连接 Connection 对象
	private String dbSchema;                            // 数据库名

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public String getDbSchema() {
		return dbSchema;
	}

	public void setDbSchema(String dbSchema) {
		this.dbSchema = dbSchema;
	}
}
