package com.yin.jiajiao.entities;

/**
 * @Describe: 可授课区域
 * @ClassName: com.yin.jiajiao.entities.TeachArea
 * @WriterName: QQ
 * @CreateDate: 2017年5月10日 下午2:35:13
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class TeachArea {
	private Integer id;
	private String area;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "TeachArea [id=" + id + ", area=" + area + "]";
	}

}
