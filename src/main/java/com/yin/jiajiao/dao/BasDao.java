package com.yin.jiajiao.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @Describe: DAO层基础
 * @ClassName: com.yin.jiajiao.dao.BasDao
 * @WriterName: QQ
 * @CreateDate: 2017年5月10日 下午8:45:04
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public abstract class BasDao<T> {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	public abstract T login(T obj);

	public abstract List<T> findList();

	public abstract Integer findCount();

	public boolean save(T obj) {
		boolean isSave = false;
		try {
			getSession().saveOrUpdate(obj);
			isSave = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSave;
	}

	@SuppressWarnings("unchecked")
	public T findById(Class<T> cls, Integer id) {
		return (T) getSession().get(cls, id);
	}

	public boolean update(T obj) {
		boolean isUpdate = false;
		try {
			getSession().update(obj);
			isUpdate = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isUpdate;
	}

}
