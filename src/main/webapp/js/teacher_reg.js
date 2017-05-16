$(function() {
	var canSubmint = false;
	$("input:submit", "#myform").button();

	$("#userid").blur(function() {
		var val = $.trim($("#userid").val());
		var reg = /^[a-zA-Z]+[0-9]*$/;
		alert(val + " = " + reg.test(val));
		if (val.length < 3) {
			alert("登录名不能小于3位");
			return;
		}
		var url = "teacher-validationLoginName";
		var args = {
			"loginName" : val,
			"time" : new Date()
		};
		$.post(url, args, function(data) {
			// 表示可用
			if (data == "1") {
				/*$this.after("<font color='green'>LastName可用!</font>");*/
				alert("不能使用，已存在登录名");
			}
			// 不可用
			else if (data == "0") {
				/*$this.after("<font color='red'>LastName不可用!</font>");*/
				alert("可以使用");
			}
			// 服务器错误
			else {
				alert("服务器错误!");
			}
		});
	});

	$("#psw").blur(function() {
		var pwd = $.trim($("#psw").val());
		if (pwd.length < 6 && pwd.length != 0) {
			alert("密码不能小于6位");
		}
	});

});