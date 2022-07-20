package cn.ekgc.bigbull.admin.transport.impl;

import cn.ekgc.bigbull.admin.service.IdentityService;
import cn.ekgc.bigbull.base.pojo.vo.PageVO;
import cn.ekgc.bigbull.base.pojo.vo.QueryPageVO;
import cn.ekgc.bigbull.system.admin.pojo.vo.IdentityVO;
import cn.ekgc.bigbull.system.admin.transport.IdentityTransport;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <b>大牛医疗信息平台-系统功能-人员身份传输层接口实现</b>
 *
 * @author Lixubo
 * @date 2022/7/14
 */
@RestController("identityTransport")
@RequestMapping("/system/admin/identity/")
public class IdentityTransportImpl implements IdentityTransport {
	@Resource(name = "identityService")
	private IdentityService identityService;
	/**
	 * 查询分页
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	@Override
	public PageVO<IdentityVO> getPageList(@RequestBody QueryPageVO<IdentityVO> queryPageVO) throws Exception {
		//分别获得分页视图和查询视图
		IdentityVO  identityVO=queryPageVO.getQueryVO();
		PageVO<IdentityVO> pageVO=queryPageVO.getPageVO();
		return identityService.getPage(identityVO,pageVO);
	}
	@PostMapping("/id")
	@Override
	public IdentityVO getById(Long id) throws Exception {
		return identityService.getById(id);
	}
	@PostMapping("/code")
	@Override
	public IdentityVO getByCode(String code) throws Exception {
		return identityService.getByCode(code);
	}
	@PostMapping("/insert")
	@Override
	public boolean insert(IdentityVO vo) throws Exception {
		return identityService.insert(vo);
	}
	@PostMapping("/update")
	@Override
	public boolean update(IdentityVO vo) throws Exception {
		return identityService.update(vo);
	}
}
