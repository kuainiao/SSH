package com.yin.jiajiao.service.inter.student;

import java.util.List;

import com.yin.jiajiao.entities.Student;

/**
 * @Describe: 学生service层接口
 * @WriterName: QQ
 * @CreateDate: 2017年5月13日 下午9:40:21
 * @Package: com.yin.jiajiao.service.inter.student.IStudentService
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public interface IStudentService {
	
	public boolean saveStudent(Student student);
	
	public Student findStudentById(Integer id);
	
	public List<Student> findList();
	
	public Student login(Student student);
	
}
