package cn.ekgc.bigbull.admin.service.impl;

import cn.ekgc.bigbull.admin.dao.AdminDao;
import cn.ekgc.bigbull.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <b></b>
 *
 * @author Lixubo
 * @date 2022/7/18
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;
}
