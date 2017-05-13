package com.yin.jiajiao.test;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.yin.jiajiao.entities.User;
import com.yin.jiajiao.service.inter.admin.IAdminService;
import com.yin.jiajiao.util.DateStringUtil;

/**
 * @Describe: TODO
 * @WriterName: QQ
 * @CreateDate: 2017年5月13日 下午4:34:42
 * @Package: com.yin.jiajiao.test.TestAdminUser
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class TestAdminUser {
	@Test
	public void testLogin() {
		@SuppressWarnings("resource")
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/test/resources/applicationContext*.xml");
		// ApplicationContext ac = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// ITestServiceInterface testService = (ITestServiceInterface)
		// ac.getBean("testService");
		IAdminService adminService = (IAdminService) ac.getBean("adminService");
		User user = new User();
		user.setUserName("admin");
		user.setPassword("admin");
		user = adminService.login(user);
		System.err.println(user.toString());
	}

	@SuppressWarnings("resource")
	@Test
	public void testFindUserById() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext*.xml");
		IAdminService adminService = (IAdminService) ac.getBean("adminService");
		User user = new User();
		user.setId(1);
		user = adminService.findUserById(user);
		System.out.println(user.toString());
		Date date = DateStringUtil.String2Date("1999-01-01");
		System.out.println(date);
	}

	@Test
	public void testSaveUser() {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext*.xml");
		IAdminService adminService = (IAdminService) ac.getBean("adminService");
		User user = new User();
		// user.setCreateTime("1990-09-21 12:12:12");
		// user.setLevel("3");
		// user.setOperator("1");
		// user.setPassword("test1");
		// user.setUserName("test1");
		// user.setState("1");
		user.setId(2);
		user = adminService.findUserById(user);
		System.out.println(user.toString());
		user.setOperator("123");
		adminService.saveUser(user);
		System.out.println(user.toString());

	}

	@Test
	public void testFindList() {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext*.xml");
		IAdminService adminService = (IAdminService) ac.getBean("adminService");
		List<User> users = adminService.findList();
		Iterator<User> it = users.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
}
