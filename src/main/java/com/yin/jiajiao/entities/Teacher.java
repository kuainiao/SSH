package com.yin.jiajiao.entities;

/**
 * @Describe: 教员实体类
 * @ClassName: com.yin.jiajiao.entities.Teacher
 * @WriterName: QQ
 * @CreateDate: 2017年5月10日 上午11:39:53
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class Teacher {
	private Integer id;
	private String username;// 用户名
	private String password;// 密码
	private String regTime;// 注册时间
	private Integer teacherSex;// 性别
	private String idCard;// 身份证号
	private String trueName;// 真实姓名
	private String address;// 目前住址
	private String telphone;// 联系电话
	private String school;// 学校
	private String startSchoolYear;// 入学年份
	private String education;// 最终学历
	private String majorClass;// 专业
	private String teacherCourses;// 教授科目
	private String canTeachTime;// 可教授时间
	private String teachArea;// 授课区域说明
	private String teacherDesc;// 自我描述
	private String reward;// 奖励证书

	private String qq;// QQ
	private String email;// 邮箱
	private String integral;// 积分
	private String levels;// 级别
	private String isShow;// 是否显示
	private String creatTime;// 创建时间
	private String lastTime;// 最后一次登录时间
	private String startLevl;// 星级
	private String idCardPic;// 身份证图片
	private String schoolPic;// 毕业证图片
	private String teacherPic;// 教员相片
	private String qualificationPic;// 资格证书
	private String showCount;// 浏览次数
	private String loginCount;// 登录次数
	private String lastLoginIp;// 最后登录ip
	private String reviewerId;// 审核人id
	private Integer teacherState;// 教员状态
	private String operator;// 操作员

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRegTime() {
		return regTime;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	public Integer getTeacherSex() {
		return teacherSex;
	}

	public void setTeacherSex(Integer teacherSex) {
		this.teacherSex = teacherSex;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getStartSchoolYear() {
		return startSchoolYear;
	}

	public void setStartSchoolYear(String startSchoolYear) {
		this.startSchoolYear = startSchoolYear;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getMajorClass() {
		return majorClass;
	}

	public void setMajorClass(String majorClass) {
		this.majorClass = majorClass;
	}

	public String getTeacherCourses() {
		return teacherCourses;
	}

	public void setTeacherCourses(String teacherCourses) {
		this.teacherCourses = teacherCourses;
	}

	public String getCanTeachTime() {
		return canTeachTime;
	}

	public void setCanTeachTime(String canTeachTime) {
		this.canTeachTime = canTeachTime;
	}

	public String getTeachArea() {
		return teachArea;
	}

	public void setTeachArea(String teachArea) {
		this.teachArea = teachArea;
	}

	public String getTeacherDesc() {
		return teacherDesc;
	}

	public void setTeacherDesc(String teacherDesc) {
		this.teacherDesc = teacherDesc;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIntegral() {
		return integral;
	}

	public void setIntegral(String integral) {
		this.integral = integral;
	}

	public String getLevels() {
		return levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
	}

	public String getIsShow() {
		return isShow;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}

	public String getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(String creatTime) {
		this.creatTime = creatTime;
	}

	public String getLastTime() {
		return lastTime;
	}

	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}

	public String getStartLevl() {
		return startLevl;
	}

	public void setStartLevl(String startLevl) {
		this.startLevl = startLevl;
	}

	public String getIdCardPic() {
		return idCardPic;
	}

	public void setIdCardPic(String idCardPic) {
		this.idCardPic = idCardPic;
	}

	public String getSchoolPic() {
		return schoolPic;
	}

	public void setSchoolPic(String schoolPic) {
		this.schoolPic = schoolPic;
	}

	public String getTeacherPic() {
		return teacherPic;
	}

	public void setTeacherPic(String teacherPic) {
		this.teacherPic = teacherPic;
	}

	public String getQualificationPic() {
		return qualificationPic;
	}

	public void setQualificationPic(String qualificationPic) {
		this.qualificationPic = qualificationPic;
	}

	public String getShowCount() {
		return showCount;
	}

	public void setShowCount(String showCount) {
		this.showCount = showCount;
	}

	public String getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(String loginCount) {
		this.loginCount = loginCount;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getReviewerId() {
		return reviewerId;
	}

	public void setReviewerId(String reviewerId) {
		this.reviewerId = reviewerId;
	}

	public Integer getTeacherState() {
		return teacherState;
	}

	public void setTeacherState(Integer teacherState) {
		this.teacherState = teacherState;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", username=" + username + ", password=" + password + ", regTime=" + regTime
				+ ", teacherSex=" + teacherSex + ", idCard=" + idCard + ", trueName=" + trueName + ", address="
				+ address + ", telphone=" + telphone + ", school=" + school + ", startSchoolYear=" + startSchoolYear
				+ ", education=" + education + ", majorClass=" + majorClass + ", teacherCourses=" + teacherCourses
				+ ", canTeachTime=" + canTeachTime + ", teachArea=" + teachArea + ", teacherDesc=" + teacherDesc
				+ ", reward=" + reward + ", qq=" + qq + ", email=" + email + ", integral=" + integral + ", levels="
				+ levels + ", isShow=" + isShow + ", creatTime=" + creatTime + ", lastTime=" + lastTime + ", startLevl="
				+ startLevl + ", idCardPic=" + idCardPic + ", schoolPic=" + schoolPic + ", teacherPic=" + teacherPic
				+ ", qualificationPic=" + qualificationPic + ", showCount=" + showCount + ", loginCount=" + loginCount
				+ ", lastLoginIp=" + lastLoginIp + ", reviewerId=" + reviewerId + ", teacherState=" + teacherState
				+ ", operator=" + operator + "]";
	}

}
