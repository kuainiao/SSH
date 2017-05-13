package com.yin.jiajiao.entities;

/**
 * @Describe: 教员可授课时间
 * @ClassName: com.yin.jiajiao.entities.TeachTime
 * @WriterName: QQ
 * @CreateDate: 2017年5月10日 下午2:34:30
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class TeachTime {
	private Integer id;
	private String teachTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTeachTime() {
		return teachTime;
	}

	public void setTeachTime(String teachTime) {
		this.teachTime = teachTime;
	}

	@Override
	public String toString() {
		return "TeachTime [id=" + id + ", teachTime=" + teachTime + "]";
	}

}
