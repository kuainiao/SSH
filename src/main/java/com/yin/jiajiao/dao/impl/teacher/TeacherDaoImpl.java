package com.yin.jiajiao.dao.impl.teacher;

import java.util.List;

import org.hibernate.Query;

import com.yin.jiajiao.dao.BasDao;
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
public class TeacherDaoImpl extends BasDao<Teacher> implements ITeacherDao {

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
		return super.save(teacher);
	}

	@Override
	public Teacher findTeacherById(Integer id) {
		return super.findById(Teacher.class, id);
	}

	@Override
	public List<Teacher> findList() {
		String hql = "FROM Teacher";
		@SuppressWarnings("unchecked")
		List<Teacher> lists = getSession().createQuery(hql).list();
		return lists;
	}

	@Override
	public Integer findCount() {
		String hql = "SELECT count(*) FROM Teacher";
		Integer count = (Integer) getSession().createQuery(hql).uniqueResult();
		return count;
	}

	@Override
	public boolean validationTeacherName(String teacherName) {
		String hql = "FROM Teacher t WHERE t.loginName=?";
		@SuppressWarnings("unchecked")
		List<Teacher> lists = getSession().createQuery(hql).setString(0, teacherName).list();
		if(lists == null || lists.size() == 0) {
			return false;
		}
		return true;
	}

}
