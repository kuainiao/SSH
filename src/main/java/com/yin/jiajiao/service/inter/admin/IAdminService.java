package com.yin.jiajiao.service.inter.admin;

import java.util.List;

import com.yin.jiajiao.entities.User;

/**
 * @Describe: 管理员用户Service接口
 * @ClassName: com.yin.jiajiao.service.inter.admin.IAdminService
 * @WriterName: QQ
 * @CreateDate: 2017年5月11日 上午10:21:46
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public interface IAdminService {

	public User login(User user);

	public User findUserById(User user);

	public boolean saveUser(User model);

	public List<User> findList();

}
