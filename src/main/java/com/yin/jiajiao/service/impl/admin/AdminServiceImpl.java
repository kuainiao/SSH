package com.yin.jiajiao.service.impl.admin;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.yin.jiajiao.dao.inter.admin.IAdminDao;
import com.yin.jiajiao.entities.User;
import com.yin.jiajiao.service.inter.admin.IAdminService;
import com.yin.jiajiao.util.DateStringUtil;

/**
 * @Describe: 管理员用户Service实现类
 * @ClassName: com.yin.jiajiao.service.impl.admin.AdminServiceImpl
 * @WriterName: QQ
 * @CreateDate: 2017年5月11日 上午10:29:01
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class AdminServiceImpl implements IAdminService {
	
	private IAdminDao adminDao;

	public void setAdminDao(IAdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public User login(User user) {
		user = adminDao.login(user);
		if(user.getId() != null) {
			user.setLastLoginTime(DateStringUtil.getCurTime_yyyyMMddHHmmss());
			adminDao.updateLastLoginTime(user);
		}
		return adminDao.login(user);
	}

	public User findUserById(User user) {
		return adminDao.findUserById(user);
	}

	public boolean saveUser(User user) {
//		Map<String, Object> session = ActionContext.getContext().getSession();
//		User curUser = (User)session.get("user");
//		if(user.getId() < 1) {
//			user.setCreateUser(curUser.getId()+"|"+curUser.getUserName());
//			user.setCreateTime(DateStringUtil.getCurTime_yyyyMMddHHmmss());
//		}
//		user.setOperator(curUser.getId()+"|"+curUser.getUserName());
		user.setEditTime(DateStringUtil.getCurTime_yyyyMMddHHmmss());
		return adminDao.saveUser(user);
	}

	public List<User> findList() {
		return adminDao.findList();
	}

}
