package cn.ekgc.bigbull.system.admin.pojo.util;

import cn.ekgc.bigbull.system.admin.pojo.entity.Admin;
import cn.ekgc.bigbull.system.admin.pojo.vo.AdminVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * <b></b>
 *
 * @author Lixubo
 * @date 2022/7/18
 */
@Mapper
public interface  AdminPojoMapper {
	AdminPojoMapper INSTANCE= Mappers.getMapper(AdminPojoMapper.class);

	/**
	 * 将实体转换视图
	 * @param entity
	 * @return
	 */
	public AdminVO parseToVO(Admin entity);

	/**
	 * 将试图转换实体
	 * @param vo
	 * @return
	 */
	public Admin parseToEntity(AdminVO vo);

	/**
	 * 将实体列表转换为视图列表
	 * @param entityList
	 * @return
	 */
	public List<AdminVO> parseToVOList(List<Admin> entityList);

	/**
	 * 将视图列表转换为实体列表
	 * @param voListList
	 * @return
	 */
	public List<Admin> parseToEntityList(List<AdminVO> voListList);
}
