package cn.ekgc.bigbull.system.admin.pojo.util;

import cn.ekgc.bigbull.system.admin.pojo.entity.Identity;
import cn.ekgc.bigbull.system.admin.pojo.vo.IdentityVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * <b></b>
 *
 * @author Lixubo
 * @date 2022/7/14
 */
@Mapper
public interface IdentityPojoMapper {
	IdentityPojoMapper INSTANCE= Mappers.getMapper(IdentityPojoMapper.class);

	/**
	 * 将视图转为实体
	 * @param vo
	 * @return
	 */
	public Identity parseToEntity(IdentityVO vo);

	/**
	 * 将实体转为视图
	 * @param entity
	 * @return
	 */
	public IdentityVO parseToVO(Identity entity);

	/**
	 * 将视图列表转为实体列表
	 * @param voList
	 * @return
	 */
	public List<Identity> parseToEntityList(List<IdentityVO> voList);

	/**
	 * 将实体列表转为视图列表
	 * @param entityList
	 * @return
	 */
	public List<IdentityVO> parseToVOList(List<Identity> entityList);
}
