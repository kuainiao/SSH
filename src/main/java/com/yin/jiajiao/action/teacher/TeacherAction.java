package com.yin.jiajiao.action.teacher;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

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
public class TeacherAction extends ActionSupport implements ModelDriven<Teacher>, RequestAware {

	private static final long serialVersionUID = 1L;
	private Teacher teacher = new Teacher();
	private ITeacherService teacherService;
	private InputStream inputStream;

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setTeacherService(ITeacherService teacherService) {
		this.teacherService = teacherService;
	}

	public String login() {
		teacher = teacherService.login(teacher);
		if (teacher != null) {
			System.err.println(teacher.toString());
		} else {
			System.err.println(" ....  NULL ... null ");
		}
		return "login-success";
	}

	public String validationLoginName() throws UnsupportedEncodingException {
		boolean hasName = teacherService.validationTeacherName(teacher.getLoginName());
		teacher = teacherService.findTeacherById(1);
		if (hasName) {
			request.put("teacher", teacher);
			inputStream = new ByteArrayInputStream("1".getBytes("UTF-8"));
		} else {
			inputStream = new ByteArrayInputStream("0".getBytes("UTF-8"));
		}
		return "valida-success";
	}

	@Override
	public Teacher getModel() {
		return teacher;
	}

	private Map<String, Object> request;

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

}
