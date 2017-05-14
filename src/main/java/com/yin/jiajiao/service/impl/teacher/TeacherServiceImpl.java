package com.yin.jiajiao.service.impl.teacher;

import java.util.List;

import com.yin.jiajiao.dao.inter.teacher.ITeacherDao;
import com.yin.jiajiao.entities.Teacher;
import com.yin.jiajiao.service.inter.teacher.ITeacherService;

/**
 * @Describe: 教师Service层实现
 * @WriterName: QQ
 * @CreateDate: 2017年5月14日 上午10:11:37
 * @Package: com.yin.jiajiao.service.impl.teacher.TeacherServiceImpl
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class TeacherServiceImpl implements ITeacherService {

	private ITeacherDao teacherDao;

	public void setTeacherDao(ITeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	@Override
	public Teacher login(Teacher teacher) {
		return teacherDao.login(teacher);
	}

	@Override
	public boolean saveTeacher(Teacher teacher) {
		return teacherDao.saveTeacher(teacher);
	}

	@Override
	public Teacher findTeacherById(Integer id) {
		return teacherDao.findTeacherById(id);
	}

	@Override
	public List<Teacher> findList() {
		return teacherDao.findList();
	}

}
