package com.whackon.generator.service.impl;

import cn.hutool.core.util.StrUtil;
import com.whackon.generator.dao.GeneratorDao;
import com.whackon.generator.pojo.entity.TableEntity;
import com.whackon.generator.pojo.vo.GeneratorVO;
import com.whackon.generator.service.GeneratorService;
import com.whackon.generator.util.FreemarkerUtil;
import com.whackon.generator.util.mysqlconnection.MySQLConnection;
import com.whackon.generator.util.mysqlconnection.MySQLConnectionUtil;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;

/**
 * <b>代码生成器业务层接口实现类</b>
 *
 * @author Arthur
 * @date 2022/1/13
 * @version 1.0.0
 * @since 1.0.0
 */
@Component("generatorService")
public class GeneratorServiceImpl implements GeneratorService {
	@Resource(name = "myPlusGeneratorDao")
	private GeneratorDao generatorDao;

	/**
	 * <b>生成 MyBatis Plus 版本数据实体类</b>
	 * @param generatorVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean createForMyBatisPlus(GeneratorVO generatorVO) throws Exception {
		// 根据用户所给定的数据库连接信息获得连接对象
		MySQLConnection mySQLConnection = MySQLConnectionUtil.getConnection(
				generatorVO.getDbIp(), generatorVO.getDbPort()
				, generatorVO.getDbSchema(), generatorVO.getDbUsername()
				, generatorVO.getDbPassword());
		// 查询数据库，获得对应的数据表列表信息
		List<TableEntity> tableEntityList = generatorDao.findTableEntityList(
				mySQLConnection, generatorVO.getTableNames());
		// 循环集合增加需要的所在包结构以及是否有父类，如果有添加父类信息
		tableEntityList.forEach(tableEntity -> {
			if (StrUtil.isNotBlank(generatorVO.getEntityParent())) {
				tableEntity.setHasParent(true);
				String entityParent = generatorVO.getEntityParent();
				tableEntity.setEntityParent(entityParent);
				// 设定短名
				tableEntity.setEntityParentShort(entityParent.substring(entityParent.lastIndexOf(".") + 1, entityParent.length()));
			}
			// 设定包名
			tableEntity.setEntityPackage(generatorVO.getEntityPackage());
			// 生成对应的实体类代码
			String folderPath = generatorVO.getFolderPath() + File.separator + "entity";
			boolean isSuccess = FreemarkerUtil.create(tableEntity, tableEntity.getEntityName(), folderPath, "mybatis-plus-entity");
		});
		return true;
	}
}
