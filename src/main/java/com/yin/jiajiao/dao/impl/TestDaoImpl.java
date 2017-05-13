package com.yin.jiajiao.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.yin.jiajiao.dao.BasDao;
import com.yin.jiajiao.dao.inter.ITestDaoInteface;
import com.yin.jiajiao.entities.User;

/**
 * @Describe: DAO测试实现
 * @ClassName: com.yin.jiajiao.dao.impl.TestDaoImpl
 * @WriterName: QQ
 * @CreateDate: 2017年5月10日 下午5:16:14
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class TestDaoImpl extends BasDao implements ITestDaoInteface {

	public User login(User user) {
		String hql = "FROM User u WHERE u.userName=? AND u.password=?";
		Query query = getSession().createQuery(hql);
		query.setString(0, user.getUserName());
		query.setString(1, user.getPassword());
		@SuppressWarnings("unchecked")
		List<User> users = query.list();
		if(users != null && users.size() > 0) {
			user = users.get(0);
		} else {
			user = null;
		}
		return user;
	}

}
