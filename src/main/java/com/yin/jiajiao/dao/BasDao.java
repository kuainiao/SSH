package com.yin.jiajiao.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @Describe: DAO层基础
 * @ClassName: com.yin.jiajiao.dao.BasDao
 * @WriterName: QQ
 * @CreateDate: 2017年5月10日 下午8:45:04
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class BasDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
}
