package com.yin.jiajiao.entities;

/**
 * @Describe: 广告
 * @ClassName: com.yin.jiajiao.entities.Advertisement
 * @WriterName: QQ
 * @CreateDate: 2017年5月10日 下午3:59:23
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class Advertisement {
	private Integer id;
	private String title;// 标题
	private String url;// 链接
	private String pic;// 图片地址
	private String state;// 状态
	private String desc;// 描述
	private String isShow;// 是否显示

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getIsShow() {
		return isShow;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}

	@Override
	public String toString() {
		return "Advertisement [id=" + id + ", title=" + title + ", url=" + url + ", pic=" + pic + ", state=" + state
				+ ", desc=" + desc + ", isShow=" + isShow + "]";
	}

}
