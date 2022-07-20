package com.whackon.generator.dao.impl;

import com.whackon.generator.dao.GeneratorDao;
import com.whackon.generator.pojo.entity.ColumnProperty;
import com.whackon.generator.pojo.entity.TableEntity;
import com.whackon.generator.util.mysqlconnection.MySQLConnection;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * <b>代码生成器数据持久层接口实现类</b>
 *
 * @author Arthur
 * @date 2022/1/13
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository("myPlusGeneratorDao")
public class MyPlusGeneratorDaoImpl implements GeneratorDao {
	/**
	 * <b>根据连接信息和对应的表获得数据表列表信息</b>
	 * @param mySQLConnection
	 * @param tableNames
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<TableEntity> findTableEntityList(MySQLConnection mySQLConnection, String tableNames)
			throws Exception {
		Connection connection = mySQLConnection.getConnection();
		List<TableEntity> tableEntityList = new ArrayList<TableEntity>();
		// 根据所给定的数据表名信息，进行截取为数组
		String[] tables = tableNames.split(",");
		for (String table : tables) {
			// 设定需要执行的 SQL
			String tableSQL = "select table_schema, table_name, table_comment from information_schema.tables where table_schema=? and table_name=?";
			// 创建 PreparedStatement 对象
			PreparedStatement tableStatement = connection.prepareStatement(tableSQL);
			// 设定参数
			tableStatement.setString(1, mySQLConnection.getDbSchema());
			tableStatement.setString(2, table);
			// 执行 SQL 获得结果
			ResultSet tableResultSet = tableStatement.executeQuery();
			if (tableResultSet.next()) {
				TableEntity tableEntity = new TableEntity();
				tableEntity.setTableSchema(tableResultSet.getString("table_schema"));
				tableEntity.setTableName(tableResultSet.getString("table_name"));
				tableEntity.setTableComment(tableResultSet.getString("table_comment"));

				// 根据对应数据表信息，获得该表所对应的所有字段信息
				// 设定需要查询字段信息的 SQL
				String columnSQL = "select table_schema, table_name, column_name, data_type, column_comment, column_key from information_schema.columns where table_schema=? and table_name=? order by ordinal_position asc";
				// 创建 PreparedStatement
				PreparedStatement columnStatement = connection.prepareStatement(columnSQL);
				// 设定参数
				columnStatement.setString(1, mySQLConnection.getDbSchema());
				columnStatement.setString(2, table);
				// 进行查询
				ResultSet columnResultSet = columnStatement.executeQuery();
				List<ColumnProperty> columnPropertyList = new ArrayList<ColumnProperty>();
				while (columnResultSet.next()) {
					ColumnProperty columnProperty = new ColumnProperty();
					columnProperty.setTableSchema(columnResultSet.getString("table_schema"));
					columnProperty.setTableName(columnResultSet.getString("table_name"));
					columnProperty.setColumnName(columnResultSet.getString("column_name"));
					columnProperty.setDataType(columnResultSet.getString("data_type"));
					columnProperty.setColumnComment(columnResultSet.getString("column_comment"));
					columnProperty.setColumnKey(columnResultSet.getString("column_key"));
					// 判断是否存在 Date 类型
					if ("Date".equalsIgnoreCase(columnProperty.getPropertyType())) {
						tableEntity.setHasDate(true);
					}
					columnPropertyList.add(columnProperty);
				}
				// 将字段属性列表添加到数据表实体类中
				tableEntity.setColumnPropertyList(columnPropertyList);
				tableEntityList.add(tableEntity);
			}
		}
		return tableEntityList;
	}
}
