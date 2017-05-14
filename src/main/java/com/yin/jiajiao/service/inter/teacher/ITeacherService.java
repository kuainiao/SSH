package com.yin.jiajiao.service.inter.teacher;

import java.util.List;

import com.yin.jiajiao.entities.Teacher;

/**
 * @Describe: 教师Service层接口
 * @WriterName: QQ
 * @CreateDate: 2017年5月14日 上午10:09:35
 * @Package: com.yin.jiajiao.service.inter.teacher.ITeacherService
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public interface ITeacherService {

	public Teacher login(Teacher teacher);

	public boolean saveTeacher(Teacher teacher);

	public Teacher findTeacherById(Integer id);

	public List<Teacher> findList();

}
