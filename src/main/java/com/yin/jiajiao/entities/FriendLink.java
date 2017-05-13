package com.yin.jiajiao.entities;

/**
 * @Describe: 友情链接
 * @ClassName: com.yin.jiajiao.entities.FriendLink
 * @WriterName: QQ
 * @CreateDate: 2017年5月10日 下午3:49:23
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class FriendLink {
	private Integer id;
	private String type;// 类型
	private String title;// 标题
	private String url;// url
	private String pic;// 图片
	private String state;// 状态
	private String desc;// 描述

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	@Override
	public String toString() {
		return "FriendLink [id=" + id + ", type=" + type + ", title=" + title + ", url=" + url + ", pic=" + pic
				+ ", state=" + state + ", desc=" + desc + "]";
	}

}
