<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/css_2017_zip.css">
<title>测试JiaJiao</title>

<style type="text/css">
#Logo {
	WIDTH: 300px;
	HEIGHT: 65px;
	BACKGROUND-POSITION: 0px 0px;
	cursor: hand;
	float: left;
	margin-top: 10px;
}

.index_column_1 {
	height: 385px;
}

.index_column_2 {
	height: 385px;
}

#index_RightColumn_2 {
	height: 382px;
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

	<div id="BannerDiv">
		<p style="text-align: center;">
			<span style="line-height: 3em; font-size: 36px;"><span
				style="font-size: 24px;"><span
					style="line-height: 48px; font-size: 24px;"><span
						style="font-family: 微软雅黑, Tahoma, Arial, 宋体; font-size: 18px; line-height: 35px; text-align: center; background-color: rgb(221, 217, 195);">张家口家教吧唯一网址：&nbsp;</span><span
						style="font-size: 24px; text-decoration: underline; line-height: 48px;"><a
							href="http://www.zjkjj8.com" target="_self"
							style="font-size: 24px; text-decoration: underline; line-height: 48px;">&nbsp;www.zjkjj8.com</a>&nbsp;</span><span
						style="font-family: 微软雅黑, Tahoma, Arial, 宋体; font-size: 18px; line-height: 35px; text-align: center; background-color: rgb(221, 217, 195);">，<span
							style="line-height: 35px; font-size: 20px; font-family: 微软雅黑, Tahoma, Arial, 宋体; text-align: center; background-color: rgb(221, 217, 195);">直
								接 搜 索</span>：&nbsp;
					</span> <a href="http://www.zjkjj8.com" target="_self">“张家口家教吧</a>”&nbsp;&nbsp;&nbsp;</span>
			</span> </span>
		</p>
		<p dir="ltr" style="text-align: center;">
			<span style="font-size: 24px; line-height: 3em;">免费上门试讲：</span><span
				style="line-height: 3em; font-size: 24px;"><strong
				style="font-size: 36px; line-height: 48px; white-space: normal;"></strong><span
				style="font-size: 36px; line-height: 48px; color: rgb(255, 0, 0);">13293329290</span><span
				style="line-height: 48px; font-size: 20px;">&nbsp; &nbsp;<strong><span
						style="line-height: 48px; font-size: 24px;">樊老师 &nbsp;</span></strong>
			</span><span style="line-height: 48px; font-size: 24px;">QQ</span><span
				style="font-size: 36px; line-height: 48px;">:&nbsp;</span><strong
				style="font-size: 36px; line-height: 48px; white-space: normal;"><span
					style="color: rgb(0, 112, 192);">859096372&nbsp;</span></strong>&nbsp;&nbsp;</span>
		</p>
		<p style="text-align: center; line-height: 3em;">
			<span style="font-size: 36px; color: #7030a0;"><span
				style="font-size: 24px; color: rgb(112, 48, 160);">家教吧不向家长（学员）收取任何费用，免费推荐张家口高校优秀家教老师！</span></span>
		</p>
	</div>
	
	<div id="index_gg_banner_login">
		<div id="index_gg">
			<dl class="switchBox" id="switchBox3">
				<dt>
					<a href="/NewsListMore.asp?ntype=9">公告通知</a><a
						href="/NewsListMore.asp?ntype=1">学员必读</a><a
						href="/NewsListMore.asp?ntype=2">教员必读</a>
				</dt>
				<dd>
					<ul class="List2013">
						<div class="div5px"></div>

						<li><span id="gonggao_icon"></span> <a
							href="http://www.zjkjj8.com/News/74535.html"
							title="张家口家教吧免费请家教 - 2013/12/11 20:27:00" target="_blank">张家口家教吧免费请家教</a>
						</li>
						<li><span id="gonggao_icon"></span> <a
							href="http://www.zjkjj8.com/News/73175.html"
							title="免费家教 - 2013/11/5 0:17:00" target="_blank">免费家教</a></li>
						<li><span id="gonggao_icon"></span> <a
							href="http://www.zjkjj8.com/News/72844.html"
							title="张家口家教吧教员群 - 2013/10/27 19:26:00" target="_blank">张家口家教吧教员群</a>
						</li>
					</ul>
				</dd>
				<dd>
					<ul class="List2013">
						<div class="div5px"></div>

						<li><span id="gonggao_icon"></span> <a
							href="http://www.zjkjj8.com/News/74536.html"
							title="在张家口免费请家教流程 - 2013/12/11 20:33:00" target="_blank">在张家口免费请家教流程</a>
						</li>
						<li><span id="gonggao_icon"></span> <a
							href="http://www.zjkjj8.com/News/3549.html"
							title="请大学生和专业教师的区别 - 2013/4/28 0:28:00" target="_blank">请大学生和专业教师的区别</a>
						</li>
						<li><span id="gonggao_icon"></span> <a
							href="http://www.zjkjj8.com/News/3548.html"
							title="十大建议帮你轻松学外语 - 2013/4/28 0:26:00" target="_blank">十大建议帮你轻松学外语</a>
						</li>
					</ul>
				</dd>
				<dd>
					<ul class="List2013">
						<div class="div5px"></div>

						<li><span id="gonggao_icon"></span> <a
							href="http://www.zjkjj8.com/News/88329.html"
							title="对获取家教信息的补充说明 - 2015/11/14 21:44:00" target="_blank">对获取家教信息的补充说明</a>
						</li>
						<li><span id="gonggao_icon"></span> <a
							href="http://www.zjkjj8.com/News/75903.html"
							title="教员面试注意事项 - 2014/3/13 21:33:00" target="_blank">教员面试注意事项</a>
						</li>
						<li><span id="gonggao_icon"></span> <a
							href="http://www.zjkjj8.com/News/75902.html"
							title="怎样快速得到家教工作 - 2014/3/13 21:32:00" target="_blank">怎样快速得到家教工作</a>
						</li>
						<li><span id="gonggao_icon"></span> <a
							href="http://www.zjkjj8.com/News/3547.html"
							title="做家教过程中产生不快的几个例子 - 2013/4/28 0:23:00" target="_blank">做家教过程中产生不快的几个例子</a>
						</li>
						<li><span id="gonggao_icon"></span> <a
							href="http://www.zjkjj8.com/News/3546.html"
							title="试教的注意事项 - 2013/4/28 0:21:00" target="_blank">试教的注意事项</a></li>
					</ul>
				</dd>
			</dl>
		</div>
		<div id="Banner_div">
			<div class="JJDBY_AD">
				<div class="ad">
					<ul class="slider" id="idSlider">
						<li><a href="http://www.zjkjj8.com/student/reg/"
							target="_blank"><img
								src="http://img-cdn-hk.wzjj8.com/iBanner/20131127/13855198056948.jpg?x-oss-process=image/resize,m_fixed,h_188,w_443"
								alt="张家口家教吧_张家口家教吧" width="443" height="188"></a></li>
						<li><a href="http://www.zjkjj8.com/student/reg/"
							target="_blank"><img
								src="http://img-cdn-hk.wzjj8.com/iBanner/20131127/13855197188363.jpg?x-oss-process=image/resize,m_fixed,h_188,w_443"
								alt="张家口家教吧_张家口家教吧" width="443" height="188"></a></li>
						<li><a href="http://www.zjkjj8.com/student/reg/"
							target="_blank"><img
								src="http://img-cdn-hk.wzjj8.com/iBanner/20131027/13828674857991.jpg?x-oss-process=image/resize,m_fixed,h_188,w_443"
								alt="张家口家教吧_张家口家教吧2" width="443" height="188"></a></li>
					</ul>
					<ul class="num" id="idNum">
						<li>1</li>
						<li>2</li>
						<li>3</li>
						<!--<li>4</li><li>5</li><li>6</li>-->
					</ul>
				</div>
			</div>
		</div>
		<div id="index_login">
			<TABLE width="193" border=0 cellPadding=0 cellSpacing=1
				bgColor=#cccccc>
				<tr>
					<Td width="191" align=middle bgColor=#FFFFCC valign="top">
						<TABLE width="100%" border=0 cellPadding=0 cellSpacing=0>
							<tr>
								<td height="188" bgcolor="#FFFFFF">
									<div align="center">
										<img src="http://img.wzjj8.com/web/2008/Images/Login.png"
											alt="注册会员" border="0" usemap="#Map" width="165" height="177" />
									</div>
								</TD>
							</TR>
						</TABLE>
					</Td>
				</tr>
			</TABLE>
		</div>
	</div>

	<div id="index_form_search" style="background-color: #FFFFCC">
		<FORM name="form_search" method="POST"
			action="/?form_search_act=search">
			<strong>张家口家教吧教员搜索</strong> 科目: <input name="km" type="text" id="km"
				size="10" /> <select name="xx" id="xx" style="width: 120px;">
				<OPTION value="" selected>高校不限</OPTION>
				<OPTION value=河北工业大学>河北工业大学</OPTION>
				<OPTION value=河北师范大学>河北师范大学</OPTION>
				<OPTION value=河北经贸大学>河北经贸大学</OPTION>
				<OPTION value=河北医科大学>河北医科大学</OPTION>
				<OPTION value=华北煤炭医学院>华北煤炭医学院</OPTION>
				<OPTION value=河北科技大学>河北科技大学</OPTION>
				<OPTION value=河北理工大学>河北理工大学</OPTION>
				<OPTION value=石家庄铁道学院>石家庄铁道学院</OPTION>
				<OPTION value=河北工程大学>河北工程大学</OPTION>
				<OPTION value=河北北方学院>河北北方学院</OPTION>
				<OPTION value=华北科技学院>华北科技学院</OPTION>
				<OPTION value=石家庄经济学院>石家庄经济学院</OPTION>
				<OPTION value=河北科技师范学院>河北科技师范学院</OPTION>
				<OPTION value=石家庄学院>石家庄学院</OPTION>
				<OPTION value=衡水学院>衡水学院</OPTION>
				<OPTION value=邢台学院>邢台学院</OPTION>
				<OPTION value=北华航天工业学院>北华航天工业学院</OPTION>
				<OPTION value=廊坊师范学院>廊坊师范学院</OPTION>
				<OPTION value=邯郸学院>邯郸学院</OPTION>
				<OPTION value=河北建筑工程学院>河北建筑工程学院</OPTION>
				<OPTION value=唐山学院>唐山学院</OPTION>
				<OPTION value=河北体育学院>河北体育学院</OPTION>
				<OPTION value=防灾科技学院>防灾科技学院</OPTION>
			</select> <select id="skdq" name="skdq">
				<option value="" selected="selected">区域不限</option>
				<option value="桥东区">桥东区</option>
				<option value="桥西区">桥西区</option>
				<option value="宣化区">宣化区</option>
				<option value="下花园区">下花园区</option>
				<option value="宣化">宣化</option>
				<option value="张北">张北</option>
				<option value="康保">康保</option>
				<option value="沽源">沽源</option>
				<option value="尚义">尚义</option>
				<option value="蔚县">蔚县</option>
				<option value="阳原">阳原</option>
				<option value="怀安">怀安</option>
				<option value="万全">万全</option>
				<option value="怀来">怀来</option>
				<option value="涿鹿">涿鹿</option>
				<option value="赤城">赤城</option>
				<option value="崇礼">崇礼</option>

			</select> <select class="input_text" id="sex" name="sex">
				<option value="" selected="selected">性别不限</option>
				<option value="男">男</option>
				<option value="女">女</option>
			</select> <input type="checkbox" name="rz" id="rz" value="1" /><label
				for="rz" class="orange">金牌教员</label> <input type="checkbox"
				name="zp" id="zp" value="1" /><label for="zp" class="orange">有照片</label>
			<input type="submit" value="搜索教员" name="submit"
				style="font-weight: bold; font-size: 15px;" />
		</FORM>
	</div>
	
	<div class="index_column_1">
		<div class="index_LeftColumn">
			<div class="index_title" id="index_title_stu">张家口家教吧最新学员信息</div>
			<div class="index_info_list">
				<ul>
					<li><a href="http://www.zjkjj8.com/student/314256.html"
						target="_blank" title="点击查看详细"> <span class="w60">桥东区</span> <span
							class="w40">幼儿</span> <span class="w25">&nbsp;</span> <span
							class="w100">语数外</span> <span class="w300">有家教经验，有责任心。</span> <span
							class="w80">30元/时</span> <span class="w50 c">04-19</span></a> <span
						class="w50 c"><font color='#0000FF'>已成功</font></span></a></li>
					<li><a href="http://www.zjkjj8.com/student/312948.html"
						target="_blank" title="点击查看详细"> <span class="w60">宣化区</span> <span
							class="w40">高二</span> <span class="w25">&nbsp;</span> <span
							class="w100">语数外地</span> <span class="w300">有家教经验，有责任心。</span> <span
							class="w80">50元/时</span> <span class="w50 c">04-11</span></a> <span
						class="w50 c"><font color='#0000FF'>已成功</font></span></a></li>
					<li><a href="http://www.zjkjj8.com/student/312876.html"
						target="_blank" title="点击查看详细"> <span class="w60">桥西区</span> <span
							class="w40">高三</span> <span class="w25">&nbsp;</span> <span
							class="w100">数学</span> <span class="w300">有家教经验，有责任心。</span> <span
							class="w80">薪水面议</span> <span class="w50 c">04-11</span></a> <span
						class="w50 c"><font color='#0000FF'>已成功</font></span></a></li>
					<li><a href="http://www.zjkjj8.com/student/312875.html"
						target="_blank" title="点击查看详细"> <span class="w60">桥西区</span> <span
							class="w40">高三</span> <span class="w25">&nbsp;</span> <span
							class="w100">数学</span> <span class="w300">有家教经验，有责任心。</span> <span
							class="w80">薪水面议</span> <span class="w50 c">04-11</span></a> <span
						class="w50 c"><font color='#0000FF'>已成功</font></span></a></li>
					<li><a href="http://www.zjkjj8.com/student/311433.html"
						target="_blank" title="点击查看详细"> <span class="w60">桥东区</span> <span
							class="w40">高二</span> <span class="w25">&nbsp;</span> <span
							class="w100">物理化学</span> <span class="w300">有家教经验，有责任心，有家教经验，有责任...</span>
							<span class="w80">50元/时</span> <span class="w50 c">04-01</span></a> <span
						class="w50 c"><font color='#0000FF'>已成功</font></span></a></li>
					<li><a href="http://www.zjkjj8.com/student/311228.html"
						target="_blank" title="点击查看详细"> <span class="w60">宣化</span> <span
							class="w40">初四</span> <span class="w25">&nbsp;</span> <span
							class="w100">数理化</span> <span class="w300">认真细致，经验丰富，有家教经验，有责任心...</span>
							<span class="w80">30元/时</span> <span class="w50 c">03-31</span></a> <span
						class="w50 c"><font color='#0000FF'>已成功</font></span></a></li>
					<li><a href="http://www.zjkjj8.com/student/297452.html"
						target="_blank" title="点击查看详细"> <span class="w60">桥东区</span> <span
							class="w40">初二</span> <span class="w25">&nbsp;</span> <span
							class="w100">数学，英语</span> <span class="w300">有家教经验，有责任心。</span> <span
							class="w80">薪水面议</span> <span class="w50 c">02-07</span></a> <span
						class="w50 c"><font color='#0000FF'>已成功</font></span></a></li>
					<li><a href="http://www.zjkjj8.com/student/296882.html"
						target="_blank" title="点击查看详细"> <span class="w60">桥东区</span> <span
							class="w40">高二</span> <span class="w25">&nbsp;</span> <span
							class="w100">数学，物理，</span> <span class="w300">有家教经验，有责任心。</span>
							<span class="w80">45元/时</span> <span class="w50 c">02-04</span></a> <span
						class="w50 c"><font color='#0000FF'>已成功</font></span></a></li>
					<li><a href="http://www.zjkjj8.com/student/295807.html"
						target="_blank" title="点击查看详细"> <span class="w60">桥东区</span> <span
							class="w40">高一</span> <span class="w25">&nbsp;</span> <span
							class="w100">数学</span> <span class="w300">有家教经验，有家教经验，有责任心。</span>
							<span class="w80">45元/时</span> <span class="w50 c">01-19</span></a> <span
						class="w50 c"><font color='#0000FF'>已成功</font></span></a></li>
					<li><a href="http://www.zjkjj8.com/student/295336.html"
						target="_blank" title="点击查看详细"> <span class="w60">桥西区</span> <span
							class="w40">-</span> <span class="w25">&nbsp;</span> <span
							class="w100">数理化</span> <span class="w300">，有家教经验，有责任心。</span> <span
							class="w80">40元/时</span> <span class="w50 c">01-17</span></a> <span
						class="w50 c"><font color='#0000FF'>已成功</font></span></a></li>
					<li><a href="http://www.zjkjj8.com/student/295103.html"
						target="_blank" title="点击查看详细"> <span class="w60">桥东区</span> <span
							class="w40">高二</span> <span class="w25">&nbsp;</span> <span
							class="w100">物理化学</span> <span class="w300">有家教经验，有责任心，有家教经验，有责任...</span>
							<span class="w80">50元/时</span> <span class="w50 c">01-16</span></a> <span
						class="w50 c"><font color='#0000FF'>已成功</font></span></a></li>
					<li><a href="http://www.zjkjj8.com/student/293191.html"
						target="_blank" title="点击查看详细"> <span class="w60">宣化区</span> <span
							class="w40">高二</span> <span class="w25">&nbsp;</span> <span
							class="w100">数学</span> <span class="w300">有家教经验，有责任心。</span> <span
							class="w80">100元/时</span> <span class="w50 c">01-04</span></a> <span
						class="w50 c"><font color='#0000FF'>已成功</font></span></a></li>
				</ul>
			</div>
			<div class="index_more">
				<a href="http://www.zjkjj8.com/student/" class=o_link_9>更多学员&gt;&gt;</a>
			</div>
		</div>
		<div class="index_RightColumn">
			<div class="index_title_r" id="index_title_stu">金 牌 教 员</div>
			<ul>
				<li><span class="trust_f"></span> <a
					href="http://www.zjkjj8.com/jiajiao/769146.html" target="_blank"
					title="金牌教员-王教员" class="asho_link_9">王教员.临床医学</a></li>
				<li><span class="trust_m"></span> <a
					href="http://www.zjkjj8.com/jiajiao/253904.html" target="_blank"
					title="金牌教员-张教员" class="asho_link_9">张教员.自动化</a></li>
				<li><span class="trust_f"></span> <a
					href="http://www.zjkjj8.com/jiajiao/32241.html" target="_blank"
					title="金牌教员-刘教员" class="asho_link_9">刘教员.英语</a></li>
				<li><span class="trust_m"></span> <a
					href="http://www.zjkjj8.com/jiajiao/32240.html" target="_blank"
					title="金牌教员-王教员" class="asho_link_9">王教员.数学教育</a></li>
				<li><span class="trust_f"></span> <a
					href="http://www.zjkjj8.com/jiajiao/32239.html" target="_blank"
					title="金牌教员-李教员" class="asho_link_9">李教员.数学教育</a></li>
				<li><span class="trust_f"></span> <a
					href="http://www.zjkjj8.com/jiajiao/32238.html" target="_blank"
					title="金牌教员-李教员" class="asho_link_9">李教员.英语</a></li>
				<li><span class="trust_m"></span> <a
					href="http://www.zjkjj8.com/jiajiao/32236.html" target="_blank"
					title="金牌教员-王教员" class="asho_link_9">王教员.医学</a></li>
				<li><span class="trust_m"></span> <a
					href="http://www.zjkjj8.com/jiajiao/32228.html" target="_blank"
					title="金牌教员-晏教员" class="asho_link_9">晏教员.建筑电气与智能</a></li>
				<li><span class="trust_f"></span> <a
					href="http://www.zjkjj8.com/jiajiao/32227.html" target="_blank"
					title="金牌教员-伊教员" class="asho_link_9">伊教员.音乐学</a></li>
				<li><span class="trust_m"></span> <a
					href="http://www.zjkjj8.com/jiajiao/32226.html" target="_blank"
					title="金牌教员-晏教员" class="asho_link_9">晏教员.建筑电气与智能</a></li>
				<li><span class="trust_m"></span> <a
					href="http://www.zjkjj8.com/jiajiao/32224.html" target="_blank"
					title="金牌教员-孟教员" class="asho_link_9">孟教员.音乐学，声乐本</a></li>
				<li><span class="trust_f"></span> <a
					href="http://www.zjkjj8.com/jiajiao/32223.html" target="_blank"
					title="金牌教员-郭教员" class="asho_link_9">郭教员.心理咨询</a></li>
			</ul>
			<div class="index_more_r">
				<a href="http://www.zjkjj8.com/king/" class=o_link_9>更多>></a>
			</div>
		</div>
	</div>

	<div id="imageRow" style="padding-top: 10px; height: 165px;">

		<div class="flipcard-container">
			<div class="flipcard">
				<div class="back face">
					<div class="proIntro">
						<h5 style="margin: 0px 0px 5px 0px;">刘教员</h5>
						<div class="text">
							编号:350881<br /> 本科在读，河北北方学院，物理师范专业 <br /> <a
								href="/jiajiao/350881.html" title="查看家教简历">查看此教员简历</a> <br /> <a
								href="/iPhoto.asp" title="点击此图片，进入张家口家教吧所有教员图片库">进入教员照片库</a>
						</div>
					</div>
				</div>
				<div class="front face">
					<a href="#"><img src="http://img.wzjj8.com/web/images/grey.gif"
						data-url="http://img-cdn-cn.wzjj8.com/201411/2014111121339676.jpg?x-oss-process=image/resize,m_fixed,h_150,w_122"
						alt="张家口家教吧_刘教员_350881"
						style="width: 122px; height: 150px; border-radius: 10px;"
						class="scrollLoading" /></a>
				</div>
			</div>
		</div>

		<div class="flipcard-container">
			<div class="flipcard">
				<div class="back face">
					<div class="proIntro">
						<h5 style="margin: 0px 0px 5px 0px;">冯教员</h5>
						<div class="text">
							编号:765707<br /> 高中毕业，河北北方学院，学前教育专业 <br /> <a
								href="/jiajiao/765707.html" title="查看家教简历">查看此教员简历</a> <br /> <a
								href="/iPhoto.asp" title="点击此图片，进入张家口家教吧所有教员图片库">进入教员照片库</a>
						</div>
					</div>
				</div>
				<div class="front face">
					<a href="#"><img src="http://img.wzjj8.com/web/images/grey.gif"
						data-url="http://img-cdn-cn.wzjj8.com/201704/3cedd0c6-8247-4e3e-9a9f-d14bff37d171.JPG?x-oss-process=image/resize,m_fixed,h_150,w_122"
						alt="张家口家教吧_冯教员_765707"
						style="width: 122px; height: 150px; border-radius: 10px;"
						class="scrollLoading" /></a>
				</div>
			</div>
		</div>

		<div class="flipcard-container">
			<div class="flipcard">
				<div class="back face">
					<div class="proIntro">
						<h5 style="margin: 0px 0px 5px 0px;">姜教员</h5>
						<div class="text">
							编号:760060<br /> 本科毕业，西安石油大学，电气自动化专业 <br /> <a
								href="/jiajiao/760060.html" title="查看家教简历">查看此教员简历</a> <br /> <a
								href="/iPhoto.asp" title="点击此图片，进入张家口家教吧所有教员图片库">进入教员照片库</a>
						</div>
					</div>
				</div>
				<div class="front face">
					<a href="#"><img src="http://img.wzjj8.com/web/images/grey.gif"
						data-url="http://img-cdn-cn.wzjj8.com/201703/b1560e23-4ebd-4b4c-b75b-6cba66ef4633.JPG?x-oss-process=image/resize,m_fixed,h_150,w_122"
						alt="张家口家教吧_姜教员_760060"
						style="width: 122px; height: 150px; border-radius: 10px;"
						class="scrollLoading" /></a>
				</div>
			</div>
		</div>

		<div class="flipcard-container">
			<div class="flipcard">
				<div class="back face">
					<div class="proIntro">
						<h5 style="margin: 0px 0px 5px 0px;">杨教员</h5>
						<div class="text">
							编号:739404<br /> 本科在读，河北北方学院，应用心理学专业 <br /> <a
								href="/jiajiao/739404.html" title="查看家教简历">查看此教员简历</a> <br /> <a
								href="/iPhoto.asp" title="点击此图片，进入张家口家教吧所有教员图片库">进入教员照片库</a>
						</div>
					</div>
				</div>
				<div class="front face">
					<a href="#"><img src="http://img.wzjj8.com/web/images/grey.gif"
						data-url="http://img-cdn-cn.wzjj8.com/201703/a092b2a5-687f-432f-b2c2-c79bd8464ad8.JPG?x-oss-process=image/resize,m_fixed,h_150,w_122"
						alt="张家口家教吧_杨教员_739404"
						style="width: 122px; height: 150px; border-radius: 10px;"
						class="scrollLoading" /></a>
				</div>
			</div>
		</div>

		<div class="flipcard-container">
			<div class="flipcard">
				<div class="back face">
					<div class="proIntro">
						<h5 style="margin: 0px 0px 5px 0px;">杨教员</h5>
						<div class="text">
							编号:740435<br /> 本科在读，河北建筑工程学院，电子信息工程专业 <br /> <a
								href="/jiajiao/740435.html" title="查看家教简历">查看此教员简历</a> <br /> <a
								href="/iPhoto.asp" title="点击此图片，进入张家口家教吧所有教员图片库">进入教员照片库</a>
						</div>
					</div>
				</div>
				<div class="front face">
					<a href="#"><img src="http://img.wzjj8.com/web/images/grey.gif"
						data-url="http://img-cdn-cn.wzjj8.com/201703/9950cc53-71c4-4d83-a394-356ac8b57196.JPG?x-oss-process=image/resize,m_fixed,h_150,w_122"
						alt="张家口家教吧_杨教员_740435"
						style="width: 122px; height: 150px; border-radius: 10px;"
						class="scrollLoading" /></a>
				</div>
			</div>
		</div>

		<div class="flipcard-container">
			<div class="flipcard">
				<div class="back face">
					<div class="proIntro">
						<h5 style="margin: 0px 0px 5px 0px;">张教员</h5>
						<div class="text">
							编号:740427<br /> 本科在读，河北建筑工程学院，给排水科学与工程专业 <br /> <a
								href="/jiajiao/740427.html" title="查看家教简历">查看此教员简历</a> <br /> <a
								href="/iPhoto.asp" title="点击此图片，进入张家口家教吧所有教员图片库">进入教员照片库</a>
						</div>
					</div>
				</div>
				<div class="front face">
					<a href="#"><img src="http://img.wzjj8.com/web/images/grey.gif"
						data-url="http://img-cdn-cn.wzjj8.com/201703/cea9c984-6475-4db2-ab1e-cb22c893ca03.JPG?x-oss-process=image/resize,m_fixed,h_150,w_122"
						alt="张家口家教吧_张教员_740427"
						style="width: 122px; height: 150px; border-radius: 10px;"
						class="scrollLoading" /></a>
				</div>
			</div>
		</div>

		<div class="flipcard-container">
			<div class="flipcard">
				<div class="back face">
					<div class="proIntro">
						<h5 style="margin: 0px 0px 5px 0px;">师教员</h5>
						<div class="text">
							编号:614049<br /> 本科在读，河北北方学院，数学教育专业 <br /> <a
								href="/jiajiao/614049.html" title="查看家教简历">查看此教员简历</a> <br /> <a
								href="/iPhoto.asp" title="点击此图片，进入张家口家教吧所有教员图片库">进入教员照片库</a>
						</div>
					</div>
				</div>
				<div class="front face">
					<a href="#"><img src="http://img.wzjj8.com/web/images/grey.gif"
						data-url="http://img-cdn-cn.wzjj8.com/201604/2a5c3e67ef04f0087335fb124eb73d8b_S.jpg?x-oss-process=image/resize,m_fixed,h_150,w_122"
						alt="张家口家教吧_师教员_614049"
						style="width: 122px; height: 150px; border-radius: 10px;"
						class="scrollLoading" /></a>
				</div>
			</div>
		</div>

	</div>

	<div class="index_column_2">
		<div class="index_LeftColumn">
			<div class="index_title" id="index_title_tea">张家口家教吧最新大学生教员信息</DIV>
			<div class="index_info_list">
				<ul>
					<li><a href="http://www.zjkjj8.com/jiajiao/761287.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">教教员</span> <span class="w25"><font
								class='ZhiDing' title='推荐信息'>荐</font></span> <span class="w120">-</span>
							<span class="w435">本科就读于苏大中文师范专业，现保研为苏大中国现当代文学硕士。时...</span> <span
							class="w50 c">04-01</span> <span class="w30 c">&nbsp;</span></a></li>
					<li><a href="http://www.zjkjj8.com/jiajiao/270655.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">刘教员</span> <span class="w25">&nbsp;</span> <span
							class="w120">河北建筑工程学院</span> <span class="w435">河北建筑工程在校大学生，有责任心，有耐心，河北建筑工程在校大学...</span>
							<span class="w50 c">05-04</span> <span class="w30 c">&nbsp;</span></a>
					</li>
					<li><a href="http://www.zjkjj8.com/jiajiao/763681.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">曹教员</span> <span class="w25">&nbsp;</span> <span
							class="w120">河北建筑工程学院</span> <span class="w435">河北建筑工程学院学生，曾经带过三个初三学生一对一家教，家长和学...</span>
							<span class="w50 c">05-02</span> <span class="w30 c">&nbsp;</span></a>
					</li>
					<li><a href="http://www.zjkjj8.com/jiajiao/492579.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">孔教员</span> <span class="w25">&nbsp;</span> <span
							class="w120">河北建筑工程学院</span> <span class="w435">本人男，性格随和开朗，表达能力出众，善于沟通，有家教开课经验，...</span>
							<span class="w50 c">04-27</span> <span class="w30 c">&nbsp;</span></a>
					</li>
					<li><a href="http://www.zjkjj8.com/jiajiao/742244.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">于教员</span> <span class="w25">&nbsp;</span> <span
							class="w120">河北北方学院</span> <span class="w435">曾经做过一年半补习班老师，教授过新概念英语。教授三年级-六年级...</span>
							<span class="w50 c">04-24</span> <span class="w30 c">&nbsp;</span></a>
					</li>
					<li><a href="http://www.zjkjj8.com/jiajiao/769716.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">小教员</span> <span class="w25">&nbsp;</span> <span
							class="w120">河北医科大学</span> <span class="w435">实习期间（2012.9月-11月，江苏省昆山中学高二年级文科班...</span>
							<span class="w50 c">04-20</span> <span class="w30 c">&nbsp;</span></a>
					</li>
					<li><a href="http://www.zjkjj8.com/jiajiao/769146.html"
						title="点击查看详细" target="_blank"> <span class="w20"><div
									id="star" title="金牌教员"></div></span> <span class="w40">王教员</span> <span
							class="w25">&nbsp;</span> <span class="w120">河北北方学院</span> <span
							class="w435">本科就读于河北北方学院临床医学专业。在校期间连续三年获得二等，...</span> <span
							class="w50 c">04-19</span> <span class="w30 c">&nbsp;</span></a></li>
					<li><a href="http://www.zjkjj8.com/jiajiao/636769.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">高教员</span> <span class="w25">&nbsp;</span> <span
							class="w120">衡水学院</span> <span class="w435">我是衡水学院数学专业的本科生，已经毕业四年，一直事教育工作，年...</span>
							<span class="w50 c">04-17</span> <span class="w30 c">&nbsp;</span></a>
					</li>
					<li><a href="http://www.zjkjj8.com/jiajiao/595790.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">武教员</span> <span class="w25">&nbsp;</span> <span
							class="w120">河北北方学院</span> <span class="w435">我很有耐心，自信心，英语是我的特长，性格友好，善于沟通，有家教...</span>
							<span class="w50 c">04-12</span> <span class="w30 c">&nbsp;</span></a>
					</li>
					<li><a href="http://www.zjkjj8.com/jiajiao/764098.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">张教员</span> <span class="w25">&nbsp;</span> <span
							class="w120">河北建筑工程学院</span> <span class="w435">现在是大二本科，从高中毕业开始做家教，教过初中升高中的学生，教...</span>
							<span class="w50 c">04-11</span> <span class="w30 c">&nbsp;</span></a>
					</li>
					<li><a href="http://www.zjkjj8.com/jiajiao/766241.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">郜教员</span> <span class="w25">&nbsp;</span> <span
							class="w120">河北北方学院</span> <span class="w435">您好，我是大二口腔专业的一名男学生，从小学一直到现在都非常热爱...</span>
							<span class="w50 c">04-09</span> <span class="w30 c">&nbsp;</span></a>
					</li>
					<li><a href="http://www.zjkjj8.com/jiajiao/350881.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">刘教员</span> <span class="w25"><font
								color="red" title="此教员有照片">图</font></span> <span class="w120">河北北方学院</span>
							<span class="w435">本人喜欢和同学交流问题，善于发现问题，表达能力较强，有家教经验...</span> <span
							class="w50 c">04-08</span> <span class="w30 c">&nbsp;</span></a></li>
				</ul>
			</div>
			<DIV class="index_more">
				<a href="/iPhoto.asp" class="o_link_9" title="张家口家教吧所有教员照片">所有教员照片展示&gt;&gt;</a>&nbsp;&nbsp;&nbsp;&nbsp;
				<A class=o_link_9 href="http://www.zjkjj8.com/jiajiao/">教员库&gt;&gt;</A>
			</DIV>
		</div>
		<div class="index_RightColumn" id="index_RightColumn_2">
			<div class="index_title_r" id="index_title_tea">教 学 资 源</DIV>
			<ul>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/79.html"
					title="让您成为开明父母的8个要点 - 2011/10/1 22:06:00" target="_blank">让您成为开明父母的...</a>
				</li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/15.html"
					title="家教吧教员上课签到表 - 2011/6/14 15:18:00" target="_blank">家教吧教员上课签到...</a>
				</li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/7.html"
					title="私人家庭教师聘用协议书 - 2011/5/7 17:06:00" target="_blank">私人家庭教师聘用协...</a>
				</li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/77.html"
					title="谷歌支付宝战略合作 网上支付将无需登录网银 - 2011/4/19 13:24:00" target="_blank">谷歌支付宝战略合作...</a>
				</li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/137.html"
					title="孩子童年时需学会倾听 - 2011/4/18 11:25:00" target="_blank">孩子童年时需学会倾...</a>
				</li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/75.html"
					title="美国大学联盟IAUC课程引入中国 - 2011/4/18 11:23:00" target="_blank">美国大学联盟IAU...</a>
				</li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/13.html"
					title="家教吧教员试教注意事项 - 2011/4/8 18:11:00" target="_blank">家教吧教员试教注意...</a>
				</li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/11.html"
					title="一个优秀家教工作者的必备条件 - 2011/4/7 21:45:00" target="_blank">一个优秀家教工作者...</a>
				</li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/5.html"
					title="什么样的学生请家教有用 - 2011/1/21 17:47:00" target="_blank">什么样的学生请家教...</a>
				</li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/3.html"
					title="请大学生和专业教师的区别 - 2011/1/1" target="_blank">请大学生和专业教师...</a></li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/33.html" title="如何集体备课 - 2011/1/1"
					target="_blank">如何集体备课</a></li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/35.html"
					title="讲述：我这样考上清华大学研究生 - 2011/1/1" target="_blank">讲述：我这样考上清...</a>
				</li>
			</ul>
			<DIV class="index_more">
				<a href="http://www.zjkjj8.com/NewsListMore.asp?ntype=3"
					class="o_link_9" title="学员必读">更多>></a>
			</DIV>
		</div>
	</div>
	
	<div id="Sort_Div">
		<table cellspacing="0" cellpadding="0" width="100%" border="0">
			<tbody>
				<tr>
					<td height="22" align="left">
						<div align="left">
							<strong>张家口家教</strong>区域： <a href='/Teacher.asp?skdq=桥东区'
								title='桥东区家教' target='_blank'>桥东区</a> <a
								href='/Teacher.asp?skdq=桥西区' title='桥西区家教' target='_blank'>桥西区</a>
							<a href='/Teacher.asp?skdq=宣化区' title='宣化区家教' target='_blank'>宣化区</a>
							<a href='/Teacher.asp?skdq=下花园区' title='下花园区家教' target='_blank'>下花园区</a>
							<a href='/Teacher.asp?skdq=宣化' title='宣化家教' target='_blank'>宣化</a>
							<a href='/Teacher.asp?skdq=张北' title='张北家教' target='_blank'>张北</a>
							<a href='/Teacher.asp?skdq=康保' title='康保家教' target='_blank'>康保</a>
							<a href='/Teacher.asp?skdq=沽源' title='沽源家教' target='_blank'>沽源</a>
							<a href='/Teacher.asp?skdq=尚义' title='尚义家教' target='_blank'>尚义</a>
							<a href='/Teacher.asp?skdq=蔚县' title='蔚县家教' target='_blank'>蔚县</a>
							<a href='/Teacher.asp?skdq=阳原' title='阳原家教' target='_blank'>阳原</a>
							<a href='/Teacher.asp?skdq=怀安' title='怀安家教' target='_blank'>怀安</a>
							<a href='/Teacher.asp?skdq=万全' title='万全家教' target='_blank'>万全</a>
							<a href='/Teacher.asp?skdq=怀来' title='怀来家教' target='_blank'>怀来</a>
							<a href='/Teacher.asp?skdq=涿鹿' title='涿鹿家教' target='_blank'>涿鹿</a>
							<a href='/Teacher.asp?skdq=赤城' title='赤城家教' target='_blank'>赤城</a>
							<a href='/Teacher.asp?skdq=崇礼' title='崇礼家教' target='_blank'>崇礼</a>
						</div>
					</td>
				</tr>
				<tr>
					<td height="22">
						<div align="left">
							<strong>张家口家教</strong>科目： <a href="/Teacher.asp?km=1">数学</a> <a
								href="/Teacher.asp?km=语文">语文</a> <a href="/Teacher.asp?km=物理">物理</a>
							<a href="/Teacher.asp?km=化学">化学</a> <a href="/Teacher.asp?km=英语">英语</a>
							<a href="/Teacher.asp?km=历史">历史</a> <a href="/Teacher.asp?km=地理">地理</a>
							<a href="/Teacher.asp?km=政治">政治</a> <a href="/Teacher.asp?km=钢琴">钢琴</a>
							<a href="/Teacher.asp?km=美术">美术</a> <a href="/Teacher.asp?km=书法">书法</a>
							<a href="/Teacher.asp?km=网球">网球</a> <a href="/Teacher.asp?km=日语">日语</a>
							<a href="/Teacher.asp?km=托福">托福</a> <a href="/Teacher.asp?km=雅思">雅思</a>
							<a href="/Teacher.asp?km=计算机">计算机</a> <a
								href="/Teacher.asp?km=韩语">韩语</a> <a href="/Teacher.asp?km=奥数">奥数</a>
							<a href="/Teacher.asp?km=吉他">吉他</a> <a href="/Teacher.asp?km=围棋">围棋</a>
							<a href="/Teacher.asp?km=英语口语">英语口语</a> <a
								href="/Teacher.asp?km=法语">法语</a> <a href="/Teacher.asp?km=德语">德语</a>
						</div>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
	
	<div class="index_column_2">
		<div class="index_LeftColumn">
			<div class="index_title" id="index_title_pro">张家口家教吧最新在职和退休教师信息</DIV>
			<div class="index_info_list">
				<ul>
					<li><a href="http://www.zjkjj8.com/jiajiao/763168.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">l老师</span> <span class="w25">&nbsp;</span> <span
							class="w120">机构教师</span> <span class="w435">qqqsgergeeeeeeeeeeeeeeeeeeer鐨勫唴...</span>
							<span class="w50 c">05-04</span> <span class="w30 c">&nbsp;</span></a>
					</li>
					<li><a href="http://www.zjkjj8.com/jiajiao/755756.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">李老师</span> <span class="w25">&nbsp;</span> <span
							class="w120">其他教师</span> <span class="w435">本人热爱教育事业，现从事教师行业。需要得到被辅导者的教材，熟悉...</span>
							<span class="w50 c">03-15</span> <span class="w30 c">&nbsp;</span></a>
					</li>
					<li><a href="http://www.zjkjj8.com/jiajiao/653744.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">王老师</span> <span class="w25"><font
								color="red" title="此教员有照片">图</font></span> <span class="w120">硕士毕业</span>
							<span class="w435">本人高考分数626分，本科四年就读于重庆大学（211 985大...</span> <span
							class="w50 c">01-04</span> <span class="w30 c">&nbsp;</span></a></li>
					<li><a href="http://www.zjkjj8.com/jiajiao/504223.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">杨老师</span> <span class="w25"><font
								color="red" title="此教员有照片">图</font></span> <span class="w120">机构教师</span>
							<span class="w435">本人师范毕业本科毕业，擅长教育培训，曾辅导过多所小学、初中生，...</span> <span
							class="w50 c">09-02</span> <span class="w30 c">&nbsp;</span></a></li>
					<li><a href="http://www.zjkjj8.com/jiajiao/606152.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">刘老师</span> <span class="w25"><font
								color="red" title="此教员有照片">图</font></span> <span class="w120">在职初中教师</span>
							<span class="w435">本人特别有耐心，善于用多种方法讲授一个知识点，有多年的家教经验...</span> <span
							class="w50 c">08-09</span> <span class="w30 c">&nbsp;</span></a></li>
					<li><a href="http://www.zjkjj8.com/jiajiao/654219.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">常老师</span> <span class="w25">&nbsp;</span> <span
							class="w120">在职初中教师</span> <span class="w435">本人任教14年以来，一直担任初中班主任，任数学课，带过四届毕业...</span>
							<span class="w50 c">07-15</span> <span class="w30 c">&nbsp;</span></a>
					</li>
					<li><a href="http://www.zjkjj8.com/jiajiao/579513.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">饶老师</span> <span class="w25"><font
								color="red" title="此教员有照片">图</font></span> <span class="w120">机构教师</span>
							<span class="w435">2012年大学毕业后在北京的辅导机构辅导高三数学两年半，201...</span> <span
							class="w50 c">03-01</span> <span class="w30 c">&nbsp;</span></a></li>
					<li><a href="http://www.zjkjj8.com/jiajiao/582033.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">曹老师</span> <span class="w25"><font
								color="red" title="此教员有照片">图</font></span> <span class="w120">在职初中教师</span>
							<span class="w435">多年从教经验，真诚，耐心。擅长中小学理科教学。2005-200...</span> <span
							class="w50 c">02-17</span> <span class="w30 c">&nbsp;</span></a></li>
					<li><a href="http://www.zjkjj8.com/jiajiao/565554.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">吕老师</span> <span class="w25"><font
								color="red" title="此教员有照片">图</font></span> <span class="w120">机构教师</span>
							<span class="w435">本人在职辅导机构老师，从事家教工作两年有余，擅长初中数理化，高...</span> <span
							class="w50 c">01-26</span> <span class="w30 c">&nbsp;</span></a></li>
					<li><a href="http://www.zjkjj8.com/jiajiao/565617.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">王老师</span> <span class="w25">&nbsp;</span> <span
							class="w120">在职小学教师</span> <span class="w435">所学专业语文教育，可以更好的帮助学生，认识自己，了解自己家教是...</span>
							<span class="w50 c">01-19</span> <span class="w30 c">&nbsp;</span></a>
					</li>
					<li><a href="http://www.zjkjj8.com/jiajiao/275039.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">李老师</span> <span class="w25"><font
								color="red" title="此教员有照片">图</font></span> <span class="w120">在职初中教师</span>
							<span class="w435">从教多年，个性化教学，提高学生学习数学兴趣，快速提高成绩！寒暑...</span> <span
							class="w50 c">01-14</span> <span class="w30 c">&nbsp;</span></a></li>
					<li><a href="http://www.zjkjj8.com/jiajiao/503683.html"
						title="点击查看详细" target="_blank"> <span class="w20">&nbsp;</span>
							<span class="w40">张老师</span> <span class="w25"><font
								color="red" title="此教员有照片">图</font></span> <span class="w120">在职小学教师</span>
							<span class="w435">擅长小学毕业班数学教学，大学期间，在石家庄教过半年的小学奥数，...</span> <span
							class="w50 c">11-23</span> <span class="w30 c">&nbsp;</span></a></li>
				</ul>
			</div>
			<div class="index_more">
				<a href="/iPhoto.asp" class="o_link_9" title="张家口家教吧所有教员照片">所有教员照片展示&gt;&gt;</a>&nbsp;&nbsp;&nbsp;&nbsp;
				<A class=o_link_9 href="http://www.zjkjj8.com/professional/">专职老师库&gt;&gt;</A>
			</div>
		</div>
		<div class="index_RightColumn" id="index_RightColumn_2">
			<div class="index_title_r" id="index_title_pro">家 长 课 堂</div>
			<ul>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/78.html"
					title="家教吧告诉你通常家教选择的18问题 - 2011/10/1 22:13:00" target="_blank">家教吧告诉你通常家...</a>
				</li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/138.html"
					title="家教吧提醒各位家长：再富也不能富孩子 - 2011/10/1 21:56:00" target="_blank">家教吧提醒各位家长...</a>
				</li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/12.html"
					title="给应届毕业生一些忠告 - 2011/4/7 21:47:00" target="_blank">给应届毕业生一些忠...</a>
				</li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/66.html"
					title="外媒称比尔-盖茨名气在中国盖过雷锋 - 2011/1/1" target="_blank">外媒称比尔-盖茨名...</a>
				</li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/54.html"
					title="孩子学英语要谨慎选培训班 - 2011/1/1" target="_blank">孩子学英语要谨慎选...</a></li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/42.html"
					title="十首现代琵琶协奏曲 - 2011/1/1" target="_blank">十首现代琵琶协奏曲</a></li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/36.html"
					title="浅谈英语阅读习惯 - 2011/1/1" target="_blank">浅谈英语阅读习惯</a></li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/6.html"
					title="如何挑选合适自己的老师 - 2011/1/1" target="_blank">如何挑选合适自己的...</a></li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/96.html"
					title="打破及格论调--考研公共课备考的一般共性 - 2011/1/1" target="_blank">打破及格论调--考...</a>
				</li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/102.html"
					title="家长：别让学习压力浇灭孩子好奇的天性 - 2011/1/1" target="_blank">家长：别让学习压力...</a>
				</li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/114.html"
					title="幼儿介入英语考级竞争有必要吗 - 2011/1/1" target="_blank">幼儿介入英语考级竞...</a>
				</li>
				<li><span id="stu_tea_bd"></span> <a class="asho_link_9"
					href="http://www.zjkjj8.com/News/120.html"
					title="如何为宝宝选择英语教材 - 2011/1/1" target="_blank">如何为宝宝选择英语...</a></li>
			</ul>
			<div class="index_more">
				<a href="http://www.zjkjj8.com/NewsListMore.asp?ntype=4"
					title="教员必读" class="o_link_9">更多>></a>
			</DIV>
		</div>
	</div>
	
	<map name="Map" id="Map">
		<area shape="rect" coords="13,95,153,123"
			href="http://www.zjkjj8.com/StudentAdd.asp" alt="请家教" />
		<area shape="rect" coords="12,134,153,164" href="/reg1.asp"
			target="_self" alt="做家教" />
		<area shape="rect" coords="13,10,152,42" href="/login/" target="_self" />
		<area shape="rect" coords="12,52,153,83"
			href="http://www.zjkjj8.com/reg/" />
	</map>

	<div id="FriendLink">
		<div class="title">张家口家教吧合作伙伴链接</div>
		<div class="link">
			<ul>
				<li><a href="http://www.ncttjj.com" target="_blank">南昌家教</a></li>
				<li><a href="http://www.0311jjlm.com" target="_blank">石家庄家教网</a>
				</li>
			</ul>
		</div>
	</div>
	
	<c:import url="tail.jsp"></c:import>
</body>
</html>