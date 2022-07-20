package cn.ekgc.bigbull.controller;

import cn.ekgc.bigbull.base.controller.BaseController;
import cn.ekgc.bigbull.base.pojo.vo.ResponseVO;
import cn.ekgc.bigbull.system.admin.pojo.vo.AdminVO;
import cn.ekgc.bigbull.system.admin.transport.AdminTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <b>大牛医疗信息平台-系统功能-人员信息控制层</b>
 *
 * @author Lixubo
 * @date 2022/7/18
 */
@RestController("adminController")
@RequestMapping("/system/admin/admin")
public class AdminController extends BaseController {
	@Autowired
	private AdminTransport adminTransport;

	public ResponseVO register(@Validated @RequestBody AdminVO adminVO,
	                           BindingResult bindingResult)throws Exception{
		return null;
	}
}
