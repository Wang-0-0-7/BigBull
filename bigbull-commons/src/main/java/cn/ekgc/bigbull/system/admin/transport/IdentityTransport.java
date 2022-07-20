package cn.ekgc.bigbull.system.admin.transport;

import cn.ekgc.bigbull.base.pojo.vo.PageVO;
import cn.ekgc.bigbull.base.pojo.vo.QueryPageVO;
import cn.ekgc.bigbull.system.admin.pojo.vo.IdentityVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <b>大牛医疗信息平台-系统功能-人员身份传输接层口</b>
 *
 * @author Lixubo
 * @date 2022/7/14
 */
@FeignClient(name = "bigbull-system-provider")
public interface IdentityTransport {
	/**
	 * 查询分页
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/system/admin/identity/page")
	PageVO<IdentityVO> getPageList(@RequestBody QueryPageVO<IdentityVO> queryPageVO)throws Exception ;

	/**
	 *
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/system/admin/identity/id")
	IdentityVO getById(@RequestParam Long id)throws Exception;

	/**
	 * 根据编码查询实体
	 * @param code
	 * @return
	 */
	@PostMapping("/system/admin/identity/code")
	IdentityVO getByCode(@RequestParam String code)throws Exception;
	@PostMapping("/system/admin/identity/insert")
	boolean insert(@RequestBody IdentityVO vo)throws Exception;
	@PostMapping("/system/admin/identity/update")
	boolean update(@RequestBody IdentityVO vo)throws Exception ;
}
