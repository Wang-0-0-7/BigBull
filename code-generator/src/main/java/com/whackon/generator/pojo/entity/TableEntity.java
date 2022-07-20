package com.whackon.generator.pojo.entity;

import java.io.Serializable;
import java.util.List;

/**
 * <b>数据表实体类信息</b>
 *
 * @author Arthur
 * @date 2022/1/13
 * @version 1.0.0
 * @since 1.0.0
 */
public class TableEntity implements Serializable {
	private static final long serialVersionUID = 2048812054230267224L;
	private String tableSchema;                         // 数据库名
	private String tableName;                           // 表名
	private String tableComment;                        // 表注释
	private String entityPackage;                       // 实体类所在包
	private boolean hasParent;                          // 实体类是否需要继承父类
	private String entityParent;                        // 实体类继承的父类全限定名
	private String entityParentShort;                   // 实体类继承的父类名
	private String entityName;                          // 实体类类名
	private String entityComment;                       // 实体类注释
	private boolean hasDate;                            // 是否存在 java.util.Date 类型属性
	private List<ColumnProperty> columnPropertyList;    // 属性字段列表

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
		// 根据表名，计算类名
		String[] tableNames = tableName.split("_");
		StringBuffer buffer = new StringBuffer();
		if (tableNames.length > 1) {
			// 在生成属性名时，不需要表名的前缀
			for (int i = 1; i < tableNames.length; i++) {
				String name = tableNames[i];
				name = name.substring(0, 1).toUpperCase() + name.substring(1, name.length());
				buffer.append(name);
			}
		}
		this.entityName = buffer.toString();
	}

	public String getTableComment() {
		return tableComment;
	}

	public void setTableComment(String tableComment) {
		this.tableComment = tableComment;
		this.entityComment = tableComment;
	}

	public String getEntityPackage() {
		return entityPackage;
	}

	public void setEntityPackage(String entityPackage) {
		this.entityPackage = entityPackage;
	}

	public boolean getHasParent() {
		return hasParent;
	}

	public void setHasParent(boolean hasParent) {
		this.hasParent = hasParent;
	}

	public String getEntityParent() {
		return entityParent;
	}

	public void setEntityParent(String entityParent) {
		this.entityParent = entityParent;
	}

	public String getEntityParentShort() {
		return entityParentShort;
	}

	public void setEntityParentShort(String entityParentShort) {
		this.entityParentShort = entityParentShort;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getEntityComment() {
		return entityComment;
	}

	public void setEntityComment(String entityComment) {
		this.entityComment = entityComment;
	}

	public boolean getHasDate() {
		return hasDate;
	}

	public void setHasDate(boolean hasDate) {
		this.hasDate = hasDate;
	}

	public List<ColumnProperty> getColumnPropertyList() {
		return columnPropertyList;
	}

	public void setColumnPropertyList(List<ColumnProperty> columnPropertyList) {
		this.columnPropertyList = columnPropertyList;
	}
}
