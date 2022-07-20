package cn.ekgc.bigbull.admin.service;

import cn.ekgc.bigbull.base.pojo.vo.PageVO;
import cn.ekgc.bigbull.system.admin.pojo.vo.IdentityVO;

import java.util.List;

/**
 * <b>大牛医疗信息平台-系统功能-人员身份业务层接口</b>
 *
 * @author Lixubo
 * @date 2022/7/14
 */
public interface IdentityService {
	/**
	 * 分页视图信息查询
	 * @param identityVO
	 * @param pageVO
	 * @return
	 */
	PageVO<IdentityVO> getPage(IdentityVO identityVO, PageVO<IdentityVO> pageVO)throws Exception ;

	/**
	 * 查询视图列表
	 * @param identityVO
	 * @return
	 * @throws Exception
	 */
	List<IdentityVO>  getList(IdentityVO identityVO)throws Exception;

	/**
	 * 根据主键查询
	 * @param id
	 * @return
	 * @throws Exception
	 */
	IdentityVO getById(Long id)throws Exception;

	/**
	 * 根据编码进行查询
	 * @param code
	 * @return
	 * @throws Exception
	 */
	IdentityVO getByCode(String code)throws Exception;

	/**
	 * 插入信息
	 * @param identityVO
	 * @return
	 * @throws Exception
	 */
	boolean insert(IdentityVO identityVO)throws Exception;

	/**
	 * 修改信息
	 * @param identityVO
	 * @return
	 * @throws Exception
	 */
	boolean update(IdentityVO identityVO)throws Exception;
}
