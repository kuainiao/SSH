package com.yin.jiajiao.action.admin;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yin.jiajiao.entities.User;
import com.yin.jiajiao.service.inter.admin.IAdminService;

/**
 * @Describe: 管理员用户action类
 * @ClassName: com.yin.jiajiao.action.admin.AdminAction
 * @WriterName: QQ
 * @CreateDate: 2017年5月11日 上午10:19:04
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class AdminAction extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = 1L;
	private User model = new User();
	private IAdminService adminService;

	public String login() {
		User user = adminService.login(model);
		if (user != null) {
			System.out.println(" .... " + user.toString());

			HttpServletRequest request = ServletActionContext.getRequest();
			HttpServletResponse response = ServletActionContext.getResponse();
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("user", user);
			
			System.out.println("login 成功..  "+request+"   -   "+response);

		} else {
			System.err.println(" ++++++++++++ ");
		}
		return "login-success";
	}

	public String findUserById() {
		User user = adminService.findUserById(model);
		System.out.println("findUserById  成功。。。"+user.toString());
		return "find-success";
	}

	public String saveUesr() {
		boolean saveSuccess = adminService.saveUser(model);
		System.out.println("saveUser   成功。。。"+saveSuccess);
		//返回管理员列表页面
		return "save-success";
	}

	public String findList() {
		List<User> users = adminService.findList();
		Iterator<User> it = users.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		
		System.out.println("findList  成功...");
		return "list-success";
	}
	
	public void setAdminService(IAdminService adminService) {
		this.adminService = adminService;
	}

	public User getModel() {
		return model;
	}

}
