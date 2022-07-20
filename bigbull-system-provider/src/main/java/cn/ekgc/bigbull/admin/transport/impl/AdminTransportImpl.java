package cn.ekgc.bigbull.admin.transport.impl;

import cn.ekgc.bigbull.admin.service.AdminService;
import cn.ekgc.bigbull.system.admin.transport.AdminTransport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <b></b>
 *
 * @author Lixubo
 * @date 2022/7/18
 */
@RestController("adminTransportImpl")
@RequestMapping("/system/admin/admin")
public class AdminTransportImpl implements AdminTransport {
	@Resource(name = "adminService")
	private AdminService adminService;
}
