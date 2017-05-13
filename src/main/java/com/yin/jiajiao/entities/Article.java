package com.yin.jiajiao.entities;

/**
 * @Describe: 文章
 * @ClassName: com.yin.jiajiao.entities.Article
 * @WriterName: QQ
 * @CreateDate: 2017年5月10日 下午4:05:48
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class Article {
	private Integer id;
	private String title;// 标题
	private String author;// 作者
	private String levels;// 级别
	private String state;// 状态
	private String createTime;// 创建时间
	private String operator;// 操作人
	private String classType;// 文章类型
	private String outTime;// 发布时间
	private String pic;// 图片
	private String count;// 点击量
	private String desc;// 描述

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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLevels() {
		return levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", author=" + author + ", levels=" + levels + ", state="
				+ state + ", createTime=" + createTime + ", operator=" + operator + ", classType=" + classType
				+ ", outTime=" + outTime + ", pic=" + pic + ", count=" + count + ", desc=" + desc + "]";
	}

}
