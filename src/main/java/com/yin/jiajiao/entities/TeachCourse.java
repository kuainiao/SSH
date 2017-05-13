package com.yin.jiajiao.entities;

/**
 * @Describe: 教授课程信息(注：年级+科目)
 * @ClassName: com.yin.jiajiao.entities.TeachCourse
 * @WriterName: QQ
 * @CreateDate: 2017年5月10日 下午2:19:30
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class TeachCourse {
	private Integer id;
	private String courseName;// 科目名称

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "TeachCourse [id=" + id + ", courseName=" + courseName + "]";
	}

}
