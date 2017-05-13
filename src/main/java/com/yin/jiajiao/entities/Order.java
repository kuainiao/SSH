package com.yin.jiajiao.entities;

/**
 * @Describe: 订单id
 * @ClassName: com.yin.jiajiao.entities.Order
 * @WriterName: QQ
 * @CreateDate: 2017年5月10日 下午2:10:08
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class Order {
	private Integer id;
	private Integer teacherId;
	private Integer sutdentId;
	private String orderState;// 订单状态
	private String operator;// 操作人
	private String createTime;// 创建时间
	private String updateTime;// 修改时间
	private String isShow;// 是否显示
	private String whoOrder;// 教员预约学员 or 学员预约教员
	private String teacher;// 以往教员信息

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public Integer getSutdentId() {
		return sutdentId;
	}

	public void setSutdentId(Integer sutdentId) {
		this.sutdentId = sutdentId;
	}

	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getIsShow() {
		return isShow;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}

	public String getWhoOrder() {
		return whoOrder;
	}

	public void setWhoOrder(String whoOrder) {
		this.whoOrder = whoOrder;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", teacherId=" + teacherId + ", sutdentId=" + sutdentId + ", orderState="
				+ orderState + ", operator=" + operator + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", isShow=" + isShow + ", whoOrder=" + whoOrder + ", teacher=" + teacher + "]";
	}

}
