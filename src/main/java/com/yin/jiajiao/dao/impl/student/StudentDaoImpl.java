package com.yin.jiajiao.dao.impl.student;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.yin.jiajiao.dao.inter.student.IStudentDao;
import com.yin.jiajiao.entities.Student;

public class StudentDaoImpl implements IStudentDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public boolean saveStudent(Student student) {
		boolean saveSuccess = false;
		try {
			getSession().saveOrUpdate(student);
			saveSuccess = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saveSuccess;
	}

	@Override
	public Student findStudentById(Integer id) {
		return (Student) getSession().get(Student.class, id);
	}

	@Override
	public List<Student> findList() {
		String hql = "FROM Student";
		@SuppressWarnings("unchecked")
		List<Student> students = getSession().createQuery(hql).list();
		return students;
	}

	@Override
	public Student login(Student student) {
		String hql = "FROM Student s WHERE s.loginName = ? AND s.password = ?";
		Query query = getSession().createQuery(hql);
		query.setString(0, student.getLoginName()).setString(1, student.getPassword());
		@SuppressWarnings("unchecked")
		List<Student> lists = query.list();
		if(lists != null && lists.size() == 1) {
			return lists.get(0);
		}
		return null;
	}

}
