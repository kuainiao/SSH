package com.yin.jiajiao.entities;

/**
 * @Describe: 管理员用户
 * @ClassName: com.yin.jiajiao.entities.User
 * @WriterName: QQ
 * @CreateDate: 2017年5月10日 下午3:00:15
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class User {
	private Integer id;
	private String trueName;// 真实姓名
	private String userName;// 用户名
	private String password;// 密码
	private String lastLoginTime;// 最后登录时间
	private String createUser;// 创建人
	private String createTime;// 创建时间
	private String operator;// 修改人
	private String editTime;// 编辑时间
	private String level;// 管理员级别
	private String state;// 管理员状态
	private String email;// 邮箱|以后申诉密码使用
	private String validateCode;// 验证码|和当前日期加密，验证时，解密在校验
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
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

	public String getEditTime() {
		return editTime;
	}

	public void setEditTime(String editTime) {
		this.editTime = editTime;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getValidateCode() {
		return validateCode;
	}

	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", trueName=" + trueName + ", userName=" + userName + ", password=" + password
				+ ", lastLoginTime=" + lastLoginTime + ", createUser=" + createUser + ", createTime=" + createTime
				+ ", operator=" + operator + ", editTime=" + editTime + ", level=" + level + ", state=" + state
				+ ", email=" + email + ", validateCode=" + validateCode + "]";
	}

}
