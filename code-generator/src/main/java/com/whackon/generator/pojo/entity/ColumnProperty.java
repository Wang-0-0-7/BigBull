package com.whackon.generator.pojo.entity;

import java.io.Serializable;

/**
 * <b>字段属性信息</b>
 *
 * @author Arthur
 * @date 2022/1/13
 * @version 1.0.0
 * @since 1.0.0
 */
public class ColumnProperty implements Serializable {
	private static final long serialVersionUID = 8987546586196262645L;
	private String tableSchema;                     // 数据库名
	private String tableName;                       // 表名
	private String columnName;                      // 字段名
	private String dataType;                        // 数据类型
	private String columnComment;                   // 字段注释
	private String columnKey;                       // 主键标志
	private boolean isPrimary;                      // 是否为主键
	private String propertyType;                    // 属性数据类型
	private String propertyName;                    // 属性名
	private String propertyComment;                 // 属性注释

	public String getTableSchema() {
		return tableSchema;
	}

	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
		// 通过列名获得属性名，判列名是否采用了下划线进行连接，使用 split 按照下划线进行分隔
		String[] columnNames = columnName.split("_");
		// 将第一个单词进行添加
		StringBuffer buffer = new StringBuffer(columnNames[0]);
		if (columnNames.length > 1) {
			// 说明该列名采用了下换线进行连接，需要从第二个单词开始进行首字母拼接
			for (int i = 1; i < columnNames.length; i++) {
				String name = columnNames[i];
				// 单词进行首字母大写操作
				name = name.substring(0, 1).toUpperCase() + name.substring(1, name.length());
				// 将获得的结果添加到 StringBuffer 中
				buffer.append(name);
			}
		}
		this.propertyName = buffer.toString();
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
		// 根据字段数据类型，判断属性数据类型
		if ("int".equalsIgnoreCase(dataType)) {
			this.propertyType = "Long";
		} else if ("varchar".equalsIgnoreCase(dataType)) {
			this.propertyType = "String";
		} else if ("decimal".equalsIgnoreCase(dataType)) {
			this.propertyType = "Double";
		} else if ("date".equalsIgnoreCase(dataType) || "datetime".equalsIgnoreCase(dataType)
				|| "timestamp".equalsIgnoreCase(dataType)) {
			this.propertyType = "Date";
		}
	}

	public String getColumnComment() {
		return columnComment;
	}

	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
		// 属性的注释和字段注释保持一致
		this.propertyComment = columnComment;
	}

	public String getColumnKey() {
		return columnKey;
	}

	public void setColumnKey(String columnKey) {
		this.columnKey = columnKey;
		if ("PRI".equalsIgnoreCase(columnKey)) {
			// 此时该字段为主键字段
			this.isPrimary = true;
		}
	}

	public boolean getIsPrimary() {
		return isPrimary;
	}

	public void setIsPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyComment() {
		return propertyComment;
	}

	public void setPropertyComment(String propertyComment) {
		this.propertyComment = propertyComment;
	}
}
