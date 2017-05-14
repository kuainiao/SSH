package com.yin.jiajiao.dao.impl.admin;

import java.util.List;

import org.hibernate.Query;

import com.yin.jiajiao.dao.BasDao;
import com.yin.jiajiao.dao.inter.admin.IAdminDao;
import com.yin.jiajiao.entities.User;

/**
 * @Describe: 管理员用户Dao实现类
 * @ClassName: com.yin.jiajiao.dao.impl.admin.AdminDaoImpl
 * @WriterName: QQ
 * @CreateDate: 2017年5月11日 上午10:29:57
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class AdminDaoImpl extends BasDao<User> implements IAdminDao {

	@Override
	public User login(User user) {
		String hql = "FROM User u WHERE u.userName=? AND u.password=?";
		Query query = getSession().createQuery(hql);
		query.setString(0, user.getUserName());
		query.setString(1, user.getPassword());
		@SuppressWarnings("unchecked")
		List<User> users = query.list();
		if (users != null && users.size() > 0) {
			user = users.get(0);
		} else {
			user = null;
		}
		return user;
	}

	@Override
	public Integer findCount() {
		String hql = "SELECT count(*) FROM User";
		Integer count = (Integer) getSession().createQuery(hql).uniqueResult();
		return count;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<User> findList() {
		String hql = "FROM User";
		return getSession().createQuery(hql).list();
	}

	public User findUserById(User user) {
		return super.findById(User.class, user.getId());
	}

	public boolean saveUser(User user) {
		return super.save(user);
	}

	public boolean updateUser(User user) {
		return super.update(user);
	}

	public void updateLastLoginTime(User user) {
		getSession().update(user);
	}

}
