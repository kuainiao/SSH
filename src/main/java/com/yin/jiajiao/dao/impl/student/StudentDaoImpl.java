package com.yin.jiajiao.dao.impl.student;

import java.util.List;

import org.hibernate.Query;

import com.yin.jiajiao.dao.BasDao;
import com.yin.jiajiao.dao.inter.student.IStudentDao;
import com.yin.jiajiao.entities.Student;

public class StudentDaoImpl extends BasDao<Student> implements IStudentDao {

	public boolean saveStudent(Student student) {
		return super.save(student);
	}

	@Override
	public Student findStudentById(Integer id) {
		return super.findById(Student.class, id);
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

	@Override
	public Integer findCount() {
		String hql = "SELECT count(*) FROM Student";
		Integer count = (Integer) getSession().createQuery(hql).uniqueResult();
		return count;
	}

}
