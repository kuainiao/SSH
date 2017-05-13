package com.yin.jiajiao.service.impl.student;

import java.util.List;

import com.yin.jiajiao.dao.inter.student.IStudentDao;
import com.yin.jiajiao.entities.Student;
import com.yin.jiajiao.service.inter.student.IStudentService;

/**
 * @Describe: 学生service层实现类
 * @WriterName: QQ
 * @CreateDate: 2017年5月13日 下午9:48:29
 * @Package: com.yin.jiajiao.service.impl.student.StudentServiceImpl
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class StudentServiceImpl implements IStudentService {

	private IStudentDao studentDao;

	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public boolean saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

	@Override
	public Student findStudentById(Integer id) {
		return studentDao.findStudentById(id);
	}

	@Override
	public List<Student> findList() {
		return studentDao.findList();
	}

	@Override
	public Student login(Student student) {
		return studentDao.login(student);
	}

}
