package com.yin.jiajiao.dao.inter.student;

import java.util.List;

import com.yin.jiajiao.entities.Student;

/**
 * @Describe: 学生dao层接口
 * @WriterName: QQ
 * @CreateDate: 2017年5月13日 下午9:51:01
 * @Package: com.yin.jiajiao.dao.inter.student.IStudentDao
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public interface IStudentDao {
	
	public boolean saveStudent(Student student);
	
	public Student findStudentById(Integer id);
	
	public List<Student> findList();
	
	public Student login(Student student);
	
}
