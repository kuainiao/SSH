package com.yin.jiajiao.entities;

/**
 * @Describe: 配置信息
 * @ClassName: com.yin.jiajiao.entities.WebConfig
 * @WriterName: QQ
 * @CreateDate: 2017年5月10日 下午4:10:21
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class WebConfig {
	private Integer id;
	private String webTile;// 网站名称
	private String keyWord;// 关键字
	private String description;// 网站描述
	private String logo;// logo地址
	private String linkMan;// 联系人
	private String telphone;// 手机号
	private String qq;// QQ
	private String aliPay;// 支付宝
	private String weChat;// 微信

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWebTile() {
		return webTile;
	}

	public void setWebTile(String webTile) {
		this.webTile = webTile;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLinkMan() {
		return linkMan;
	}

	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getAliPay() {
		return aliPay;
	}

	public void setAliPay(String aliPay) {
		this.aliPay = aliPay;
	}

	public String getWeChat() {
		return weChat;
	}

	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}

	@Override
	public String toString() {
		return "WebConfig [id=" + id + ", webTile=" + webTile + ", keyWord=" + keyWord + ", description=" + description
				+ ", logo=" + logo + ", linkMan=" + linkMan + ", telphone=" + telphone + ", qq=" + qq + ", aliPay="
				+ aliPay + ", weChat=" + weChat + "]";
	}

}
