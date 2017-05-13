package com.yin.jiajiao.entities;

/**
 * @Describe: 学生/学员 实体类
 * @ClassName: com.yin.jiajiao.entities.Student
 * @WriterName: QQ
 * @CreateDate: 2017年5月10日 上午11:13:32
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class Student {
	private Integer id;
	private String linkName;// 联系人姓名
	private String linkTel;// 联系人电话
	private String loginName;// 登陆名
	private String password;// 密码
	private String studentGrade;// 学生年级
	private String studentCourse;// 学生求教科目
	private String otherAsk;// 其它要求
	private String remuneration;// 报酬
	private String teachTime;// 授课时间
	private Integer studentSex;// 学生性别
	private String studentAddr;// 所住区域
	private String AddrInfo;// 详细信息
	private String studentDesc;// 学员描述
	private String studentType;// 学员类型
	private String studentState;// 学员状态
	private String orderTeachers;// 预约教员
	private String countTimes;// 申请家教次数
	private String isShow;// 是否显示
	private String operator;// 发布人
	private String createTime;// 创建时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getLinkTel() {
		return linkTel;
	}

	public void setLinkTel(String linkTel) {
		this.linkTel = linkTel;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public String getOtherAsk() {
		return otherAsk;
	}

	public void setOtherAsk(String otherAsk) {
		this.otherAsk = otherAsk;
	}

	public String getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(String remuneration) {
		this.remuneration = remuneration;
	}

	public String getTeachTime() {
		return teachTime;
	}

	public void setTeachTime(String teachTime) {
		this.teachTime = teachTime;
	}

	public Integer getStudentSex() {
		return studentSex;
	}

	public void setStudentSex(Integer studentSex) {
		this.studentSex = studentSex;
	}

	public String getStudentAddr() {
		return studentAddr;
	}

	public void setStudentAddr(String studentAddr) {
		this.studentAddr = studentAddr;
	}

	public String getAddrInfo() {
		return AddrInfo;
	}

	public void setAddrInfo(String addrInfo) {
		AddrInfo = addrInfo;
	}

	public String getStudentDesc() {
		return studentDesc;
	}

	public void setStudentDesc(String studentDesc) {
		this.studentDesc = studentDesc;
	}

	public String getStudentType() {
		return studentType;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}

	public String getStudentState() {
		return studentState;
	}

	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}

	public String getOrderTeachers() {
		return orderTeachers;
	}

	public void setOrderTeachers(String orderTeachers) {
		this.orderTeachers = orderTeachers;
	}

	public String getCountTimes() {
		return countTimes;
	}

	public void setCountTimes(String countTimes) {
		this.countTimes = countTimes;
	}

	public String getIsShow() {
		return isShow;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", linkName=" + linkName + ", linkTel=" + linkTel + ", loginName=" + loginName
				+ ", password=" + password + ", studentGrade=" + studentGrade + ", studentCourse=" + studentCourse
				+ ", otherAsk=" + otherAsk + ", remuneration=" + remuneration + ", teachTime=" + teachTime
				+ ", studentSex=" + studentSex + ", studentAddr=" + studentAddr + ", AddrInfo=" + AddrInfo
				+ ", studentDesc=" + studentDesc + ", studentType=" + studentType + ", studentState=" + studentState
				+ ", orderTeachers=" + orderTeachers + ", countTimes=" + countTimes + ", isShow=" + isShow
				+ ", operator=" + operator + ", createTime=" + createTime + "]";
	}

}
