package com.whackon.generator.util.mysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * <b>JDBC 连接工具类</b>
 *
 * @author Arthur
 * @date 2022/1/13
 * @version 1.0.0
 * @since 1.0.0
 */
public class MySQLConnectionUtil {
	private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String URL_PREFIX = "jdbc:mysql://";
	private static final String URL_SUFFIX = "?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&useSSL=false&allowPublicKeyRetrieval=true";

	static {
		try {
			// 通过静态代码块根据反射机制创建连接驱动类对象
			Class.forName(DRIVER_CLASS);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <b>根据连接对象信息获得 JDBC Connection 对象</b>
	 * @param dbIp
	 * @param dbPort
	 * @param dbSchema
	 * @param dbUsername
	 * @param dbPassword
	 * @return
	 */
	public static MySQLConnection getConnection(String dbIp, String dbPort, String dbSchema,
	                                       String dbUsername, String dbPassword) {
		// 拼接完整的 URL
		String url = URL_PREFIX + dbIp + ":" + dbPort + "/" + dbSchema + URL_SUFFIX;
		try {
			Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);
			MySQLConnection mySQLConnection = new MySQLConnection();
			mySQLConnection.setConnection(connection);
			mySQLConnection.setDbSchema(dbSchema);
			return mySQLConnection;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
