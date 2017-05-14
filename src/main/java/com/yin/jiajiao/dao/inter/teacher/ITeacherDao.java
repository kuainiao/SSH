package com.yin.jiajiao.dao.inter.teacher;

import java.util.List;

import com.yin.jiajiao.entities.Teacher;

/**
 * @Describe: 教师Dao层接口
 * @WriterName: QQ
 * @CreateDate: 2017年5月14日 上午9:52:23
 * @Package: com.yin.jiajiao.dao.inter.teacher.ITeacherDao
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public interface ITeacherDao {

	public Teacher login(Teacher teacher);

	public boolean saveTeacher(Teacher teacher);

	public Teacher findTeacherById(Integer id);

	public List<Teacher> findList();

}
