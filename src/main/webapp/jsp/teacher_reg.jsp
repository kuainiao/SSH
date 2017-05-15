<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/css_2017_zip.css">
<link rel="Shortcut Icon"
	href="${pageContext.request.contextPath }/img/favicon.ico" />
<title>教师注册</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery1.8.3.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-ui-1.8.2.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/teacher_reg.js"></script>
<style type="text/css">
#Logo {
	WIDTH: 300px;
	HEIGHT: 65px;
	BACKGROUND-POSITION: 0px 0px;
	cursor: hand;
	float: left;
	margin-top: 10px;
}

#nav {
	height: 40px;
	width: 960px;
	clear: both;
	margin: 0px auto;
}
</style>
</head>

<body>
	<IFRAME id="top_navi" name="top_navi" frameBorder=0 scrolling=no
		src="SubStation.htm" width="100%" height="26" marginheight="0"
		marginwidth="0" align="center"></IFRAME>

	<!--
			作者：1241467840@qq.com
			时间：2017-05-06
			描述：学员/家长  登录上去后，会一直有提示
			
			
	<div id="u_loging">
		尊敬的学员(家长)：老万您好，您的编号是 ： <a
			href="http://www.zjkjj8.com/student/317055.html" title="这是您的家教编号"
			class="red">317055</a>( <font color=red>审核中</font> )。家教状态：<strong
			class="red"><font color='#FF0000'>新家教</font></strong> 。 已经有 <a
			href="/student/317055.html#yuyue" title="查看在线预约的教员" class="red">0</a>个老师预约。<br>
		您现在可以： <a href="/student/317055.html#yuyue" title="查看在线预约的教员">查看预约的教员</a>、
		<a href="http://www.zjkjj8.com/student/317055.html" title="查看你发布的家教信息">查看家教信息</a>、
		<a href="/StudentChangeinfo.asp" title="修改请家教需求信息">修改家教要求</a>、 <A
			href="/logout/" title="点击这里退出登录状态，如果这是您的私人电脑，不必退出。">退出登录</A>。

	</div>
			
			
        	作者：1241467840@qq.com
        	时间：2017-05-06
        	描述：学员/家长  登录上去后，会一直有提示
        -->

	<c:import url="top.jsp"></c:import>
	<h1 style="margin-top: 30px;">新教员注册第一步，设置登录用户名和密码</h1>

	<TABLE width="960" height="18" border=0 align="center" cellPadding=0
		cellSpacing=0>
		<TBODY>
			<TR>
				<TD height=6 bgcolor="#FFFFFF">
					<form method="post" action="/reg1.asp?action=save"
						onSubmit="return ChkFields();" name="myform" id="myform">
						<table width="100%" border="0" align="center" cellpadding="2"
							cellspacing="0">
							<tr>
								<td height="10" colspan="2"></td>
							</tr>
							<tr>
								<td width="40%">
									<div align="right">
										<font size="2"><span id="myclick" class="red_link_10"
											style="font-weight: bold">*</span>设定登录用户名:</font>
									</div>
								</td>
								<td width="60%" class="123"><input name="userid"
									type="text" id="userid" class="reg_txt"></input><span>用户名必须用字母或字母加数字，且长度大于3位.</span></td>
							</tr>
							<tr>
								<td>
									<div align="right">
										<font size="2"><span class="red_link_10"
											style="font-weight: bold">*</span>设定登录密码:</font>
									</div>
								</td>
								<td><font size="2"> <input name="psw"
										type="password" id="psw" class="reg_txt">
								</font><span>密码长度不小于6位</span></td>
							</tr>
							<tr>
								<td>
									<div align="right">
										<font size="2"><span class="red_link_10"
											style="font-weight: bold">*</span>再输入一次登录密码:</font>
									</div>
								</td>
								<td><font size="2"> <input name="repsw"
										type="password" id="repsw" class="reg_txt">
								</font></td>
							</tr>
							<!--<tr>
  <td colspan="2" height="40px">
  <div class="sm">为了保证家教老师能接收到的各类邮件通知（最新家教、接单时家长的电话号码、充值、扣款、改密码等通知），请将 <u>jiajiao8@188.com</u> 添加到邮箱白名单，<a href="http://user.qzone.qq.com/896839285/blog/1396933327" target="_blank" title="将【jiajiao8@188.com】添加到邮件白名单的通知">点击这里查看详细</a>。</div>
  </td>
</tr>-->
							<tr>
								<td colspan="2" height="60px">
									<div align="center">
										<input type="submit" name="Submit" style="font-size: 18px;"
											id="submit" value="提交，并进入第二步 ">
									</div>
								</td>
							</tr>
						</table>
					</form>
				</TD>
			</TR>
		</TBODY>
	</TABLE>


	<c:import url="tail.jsp"></c:import>
</body>
</html>