package com.yin.jiajiao.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yin.jiajiao.entities.Teacher;
import com.yin.jiajiao.service.inter.teacher.ITeacherService;

/**
 * @Describe: 测试登录
 * @ClassName: com.yin.jiajiao.action.TestAction
 * @WriterName: QQ
 * @CreateDate: 2017年5月10日 下午5:05:28
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class TestAction extends ActionSupport implements ModelDriven<Teacher> {

	private static final long serialVersionUID = 1L;
	private Teacher teacher = new Teacher();
	private ITeacherService teacherService;
	
	public void setTeacherService(ITeacherService teacherService) {
		this.teacherService = teacherService;
	}

	public String login() {
		teacher = teacherService.login(teacher);
		System.err.println(teacher);
		return "login-success";
	}

	@Override
	public Teacher getModel() {
		return teacher;
	}
	
	/*private User model = new User();
	private ITestServiceInterface testService;

	public void setTestService(ITestServiceInterface testService) {
		this.testService = testService;
	}

	public String login() {
		User user = testService.login(model);
		if (user == null) {
			// 无该用户
			System.out.println("无该用户...");
		} else {
			// 把用户信息设置到session中
			System.out.println("用该用户..." + user.toString());
		}
		return "login-success";
	}

	public User getModel() {
		return model;
	}
*/
}
