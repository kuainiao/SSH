package com.yin.jiajiao.action.student;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yin.jiajiao.entities.Student;
import com.yin.jiajiao.service.inter.student.IStudentService;

/**
 * @Describe: 学生Action类
 * @WriterName: QQ
 * @CreateDate: 2017年5月13日 下午9:35:54
 * @Package: com.yin.jiajiao.action.student.StudentAction
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class StudentAction extends ActionSupport implements ModelDriven<Student> {

	private static final long serialVersionUID = 1L;
	private Student student = new Student();
	private IStudentService studentService;

	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}

	public String login() {
		student = studentService.login(student);
		System.out.println(student.toString());
		return "login-success";
	}

	@Override
	public Student getModel() {
		return student;
	}

}
