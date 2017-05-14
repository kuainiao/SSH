package com.yin.jiajiao.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yin.jiajiao.entities.Student;
import com.yin.jiajiao.service.inter.student.IStudentService;

/**
 * @Describe: 学生类测试方法
 * @WriterName: QQ
 * @CreateDate: 2017年5月14日 下午4:58:51
 * @Package: com.yin.jiajiao.test.TestStudent
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class TestStudent {

	private ApplicationContext ac = null;
	private IStudentService studentService = null;
	
	@Before
	public void setUp() {
		System.err.println("@@0000000000000-----------");
		System.err.println("@@0000000000000-----------");
		System.err.println("@@0000000000000-----------");
		System.err.println("@@0000000000000-----------");
		ac = new ClassPathXmlApplicationContext("testSpringConfig.xml");
		studentService = (IStudentService) ac.getBean("studentService");
		System.err.println("@@0000000000000-----------");
		System.err.println("@@0000000000000-----------");
		System.err.println("@@0000000000000-----------");
		System.err.println("@@0000000000000-----------");
	}
	
	@Test
	public void testLogin() {
		Student student = new Student();
		student.setLoginName("student");
		student.setPassword("123");
		student = studentService.login(student);
		System.err.println(student.toString());
	}

	@Test
	public void testFindStudentById() {
		Student student = new Student();
		student = studentService.findStudentById(1);
		System.err.println(student.toString());
	}

	@Test
	public void testSaveOrUpdate() {
		Student student = new Student();
		student.setLoginName("student01");
		student.setPassword("123");
		List<Student> lists = studentService.findList();
		Iterator<Student> it = lists.iterator();
		while (it.hasNext()) {
			System.err.println(it.next().toString());
		}
		System.err.println(studentService.saveStudent(student));
		lists = studentService.findList();
		it = lists.iterator();
		while (it.hasNext()) {
			System.err.println(it.next().toString());
		}

	}

	@Test
	public void testUpdate() {
		Student student = new Student();
		student = studentService.findStudentById(2);
		student.setLinkName("测试员");
		studentService.saveStudent(student);
		System.err.println(studentService.findStudentById(2).toString());
	}

}
