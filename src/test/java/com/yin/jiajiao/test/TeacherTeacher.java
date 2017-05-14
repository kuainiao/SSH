package com.yin.jiajiao.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yin.jiajiao.entities.Teacher;
import com.yin.jiajiao.service.inter.teacher.ITeacherService;

/**
 * @Describe: 老师测试类
 * @WriterName: QQ
 * @CreateDate: 2017年5月14日 下午5:29:14
 * @Package: com.yin.jiajiao.test.TeacherTeacher
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class TeacherTeacher {

	private ApplicationContext ac = null;
	private ITeacherService teacherService = null;
	private Teacher teacher = new Teacher();

	@Before
	public void setUp() {
		ac = new ClassPathXmlApplicationContext("testSpringConfig.xml");
		teacherService = (ITeacherService) ac.getBean("teacherService");
	}

	@Test
	public void testLogin() {
		teacher.setLoginName("teacher");
		teacher.setPassword("123");
		teacher = teacherService.login(teacher);
		System.err.println(teacher.toString());
	}

	@Test
	public void testSave() {
		teacher.setLoginName("teacher01");
		teacher.setPassword("123");
		List<Teacher> lists = teacherService.findList();
		Iterator<Teacher> it = lists.iterator();
		while (it.hasNext()) {
			System.err.println(it.next().toString());
		}
		System.err.println(teacherService.saveTeacher(teacher));
		lists = teacherService.findList();
		it = lists.iterator();
		while (it.hasNext()) {
			System.err.println(it.next().toString());
		}
	}

	@Test
	public void testUpdate() {
		teacher = teacherService.findTeacherById(2);
		System.err.println(teacher.toString());
		teacher.setRegTime("2018-05-14 17:44:28");
		teacherService.saveTeacher(teacher);
		teacher = teacherService.findTeacherById(2);
		System.out.println(teacher.toString());
	}
	
	@Test
	public void testFindById() {
		teacher = teacherService.findTeacherById(1);
		System.err.println(teacher.toString());
	}

}
