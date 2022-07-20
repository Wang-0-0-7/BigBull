package cn.ekgc.bigbull.admin.service.impl;

import cn.ekgc.bigbull.admin.dao.IdentityDao;
import cn.ekgc.bigbull.admin.service.IdentityService;
import cn.ekgc.bigbull.base.pojo.vo.PageVO;
import cn.ekgc.bigbull.system.admin.pojo.entity.Identity;
import cn.ekgc.bigbull.system.admin.pojo.util.IdentityPojoMapper;
import cn.ekgc.bigbull.system.admin.pojo.vo.IdentityVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <b>大牛医疗信息平台-系统功能-人员身份业务层接口实现</b>
 *
 * @author Lixubo
 * @date 2022/7/14
 */
@Service("identityService")
@Transactional
public class IdentityServiceImpl implements IdentityService {
	@Autowired
	private IdentityDao identityDao;
	/**
	 * 分页视图信息查询
	 * @param identityVO
	 * @param pageVO
	 * @return
	 */
	@Override
	public PageVO<IdentityVO> getPage(IdentityVO identityVO, PageVO<IdentityVO> pageVO) throws Exception {
		//转换为实体
		Identity query= IdentityPojoMapper.INSTANCE.parseToEntity(identityVO);
		QueryWrapper<Identity> queryWrapper = new QueryWrapper<Identity>(query);
		PageHelper.startPage(pageVO.getNum(), pageVO.getSize());
		List<Identity> entityList = identityDao.selectList(queryWrapper);
		PageInfo<Identity> info=new PageInfo<Identity>(entityList);
		pageVO.setList(IdentityPojoMapper.INSTANCE.parseToVOList(info.getList()));
		pageVO.setTotalCount(info.getTotal());
		pageVO.setTotalPage(info.getPages());
		return pageVO;
	}

	/**
	 * 查询视图列表
	 * @param identityVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<IdentityVO> getList(IdentityVO identityVO) throws Exception {
		//视图转换为实体
		Identity query=IdentityPojoMapper.INSTANCE.parseToEntity(identityVO);
		//创建，mybatis plus 查询对象
		QueryWrapper<Identity> queryWrapper=new QueryWrapper<Identity>(query);
		//查询实体列表
		List<Identity> identityList=identityDao.selectList(queryWrapper);
		return IdentityPojoMapper.INSTANCE.parseToVOList(identityList);
	}

	/**
	 * 根据主键查询
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public IdentityVO getById(Long id) throws Exception {

		return IdentityPojoMapper.INSTANCE.parseToVO(identityDao.selectById(id));
	}

	@Override
	public IdentityVO getByCode(String code) throws Exception {
		//创建查询对象，设置查询条件
		QueryWrapper<Identity> queryWrapper=new QueryWrapper<Identity>();
		queryWrapper.eq("code",code);

		return IdentityPojoMapper.INSTANCE.parseToVO(identityDao.selectOne(queryWrapper));
	}

	/**
	 * 插入信息
	 * @param identityVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean insert(IdentityVO identityVO) throws Exception {
		Identity query=IdentityPojoMapper.INSTANCE.parseToEntity(identityVO);
		if (identityDao.insert(query)>0){
			return true;
		}
		return false;
	}

	/**
	 * 修改信息
	 * @param identityVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean update(IdentityVO identityVO) throws Exception {
		if (identityDao.updateById(IdentityPojoMapper.INSTANCE.parseToEntity(identityVO))>0){
			return true;
		}
		return false;
	}


}

