package com.yin.jiajiao.dao.impl.admin;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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
public class AdminDaoImpl implements IAdminDao {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

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

	public User findUserById(User user) {
		return (User) getSession().get(User.class, user.getId());
	}

	public boolean saveUser(User user) {
		boolean saveSuccess = false;
		try {
			getSession().saveOrUpdate(user);
			saveSuccess = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saveSuccess;
	}

	@SuppressWarnings("unchecked")
	public List<User> findList() {
		String hql = "FROM User";
		return getSession().createQuery(hql).list();
	}

	public void updateLastLoginTime(User user) {
		getSession().update(user);
	}

}
