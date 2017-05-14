package com.yin.jiajiao.dao.impl.teacher;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.yin.jiajiao.dao.inter.teacher.ITeacherDao;
import com.yin.jiajiao.entities.Teacher;

/**
 * @Describe: 教师Dao层实现
 * @WriterName: QQ
 * @CreateDate: 2017年5月14日 上午9:58:53
 * @Package: com.yin.jiajiao.dao.impl.teacher.TeacherDaoImpl
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class TeacherDaoImpl implements ITeacherDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public Teacher login(Teacher teacher) {
		String hql = "FROM Teacher t WHERE t.loginName=? AND t.password=?";
		Query query = getSession().createQuery(hql);
		query.setString(0, teacher.getLoginName()).setString(1, teacher.getPassword());
		@SuppressWarnings("unchecked")
		List<Teacher> lists = query.list();
		if (lists != null && lists.size() == 1) {
			return lists.get(0);
		}
		return null;
	}

	@Override
	public boolean saveTeacher(Teacher teacher) {
		boolean saveSuccess = false;
		try {
			getSession().saveOrUpdate(teacher);
			saveSuccess = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saveSuccess;
	}

	@Override
	public Teacher findTeacherById(Integer id) {
		return (Teacher) getSession().get(Teacher.class, id);
	}

	@Override
	public List<Teacher> findList() {
		String hql = "FROM Teacher";
		@SuppressWarnings("unchecked")
		List<Teacher> lists = getSession().createQuery(hql).list();
		return lists;
	}

}
