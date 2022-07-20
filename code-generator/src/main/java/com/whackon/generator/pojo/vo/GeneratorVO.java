package com.whackon.generator.pojo.vo;

import java.io.Serializable;

/**
 * <b>代码生成数据视图</b>
 *
 * @author Arthur
 * @date 2022/1/13
 * @version 1.0.0
 * @since 1.0.0
 */
public class GeneratorVO implements Serializable {
	private static final long serialVersionUID = 5342443082452383889L;
	private String dbIp;
	private String dbPort;
	private String dbSchema;
	private String dbUsername;
	private String dbPassword;
	private String tableNames;
	private String entityPackage;
	private String entityParent;
	private String daoPackage;
	private String folderPath;

	public String getDbIp() {
		return dbIp;
	}

	public void setDbIp(String dbIp) {
		this.dbIp = dbIp;
	}

	public String getDbPort() {
		return dbPort;
	}

	public void setDbPort(String dbPort) {
		this.dbPort = dbPort;
	}

	public String getDbSchema() {
		return dbSchema;
	}

	public void setDbSchema(String dbSchema) {
		this.dbSchema = dbSchema;
	}

	public String getDbUsername() {
		return dbUsername;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	public String getTableNames() {
		return tableNames;
	}

	public void setTableNames(String tableNames) {
		this.tableNames = tableNames;
	}

	public String getEntityPackage() {
		return entityPackage;
	}

	public void setEntityPackage(String entityPackage) {
		this.entityPackage = entityPackage;
	}

	public String getEntityParent() {
		return entityParent;
	}

	public void setEntityParent(String entityParent) {
		this.entityParent = entityParent;
	}

	public String getDaoPackage() {
		return daoPackage;
	}

	public void setDaoPackage(String daoPackage) {
		this.daoPackage = daoPackage;
	}

	public String getFolderPath() {
		return folderPath;
	}

	public void setFolderPath(String folderPath) {
		this.folderPath = folderPath;
	}
}
