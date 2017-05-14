package com.yin.jiajiao.action.teacher;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yin.jiajiao.entities.Teacher;
import com.yin.jiajiao.service.inter.teacher.ITeacherService;

/**
 * @Describe: 教师Action层
 * @WriterName: QQ
 * @CreateDate: 2017年5月14日 上午10:15:07
 * @Package: com.yin.jiajiao.action.teacher.TeacherAction
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class TeacherAction extends ActionSupport implements ModelDriven<Teacher> {

	private static final long serialVersionUID = 1L;
	private Teacher teacher = new Teacher();
	private ITeacherService teacherService;

	public void setTeacherService(ITeacherService teacherService) {
		this.teacherService = teacherService;
	}

	public String login() {
		teacher = teacherService.login(teacher);
		if(teacher != null) {
			System.err.println(teacher.toString());
		} else {
			System.err.println(" ....  NULL ... null ");
		}
		return "login-success";
	}

	@Override
	public Teacher getModel() {
		return teacher;
	}

}
