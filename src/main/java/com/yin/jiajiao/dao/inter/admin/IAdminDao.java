package com.yin.jiajiao.dao.inter.admin;

import java.util.List;

import com.yin.jiajiao.entities.User;

/**
 * @Describe: 管理员用户Dao接口
 * @ClassName: com.yin.jiajiao.dao.inter.admin.IAdminDao
 * @WriterName: QQ
 * @CreateDate: 2017年5月11日 上午10:28:54
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public interface IAdminDao {

	public User login(User user);

	public User findUserById(User user);

	public boolean saveUser(User user);

	public List<User> findList();

	public void updateLastLoginTime(User user);

}
