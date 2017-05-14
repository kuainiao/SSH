$(function() {
	$("input:submit", "#index_form_search").button();
});

$(function() {
	var len = $(".num > li").length;
	var index = 0;
	var adTimer;
	$(".num li").mouseover(function() {
		index = $(".num li").index(this);
		showImg(index);
	}).eq(0).mouseover();
	$('.ad').hover(function() {
		clearInterval(adTimer);
	}, function() {
		adTimer = setInterval(function() {
			showImg(index)
			index++;
			if (index == len) {
				index = 0;
			}
		}, 3000);
	}).trigger("mouseleave");
});

function showImg(index) {
	var adHeight = $(".JJDBY_AD .ad").height();
	$(".slider").stop(true, false).animate({
		top : -adHeight * index
	}, 400);
	$(".num li").removeClass("on").eq(index).addClass("on");
};

$(function($) {
	$("#switchBox3").switchTab({
		titCell : "dt a",
		trigger : "mouseover",
		delayTime : 0
	});
});

$(function() {
	$(".scrollLoading").scrollLoading();
});

/*
var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");
document.write(unescape("%3Cspan id='cnzz_stat_icon_1000166634'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s22.cnzz.com/z_stat.php%3Fid%3D1000166634%26show%3Dpic' type='text/javascript'%3E%3C/script%3E"));
*/

function AddFavorite(sURL, sTitle) {
	try {
		window.external.addFavorite(sURL, sTitle)
	} catch(e) {
		try {
			window.sidebar.addPanel(sTitle, sURL, "")
		} catch(e) {
			alert("抱歉，浏览器不支持此功能，\n\n请使用【Ctrl+D】进行添加！")
		}
	}
};

function setmodel(value, id, siteid, q) {
	$("#typeid").val(value);
	$("#search a").removeClass();
	id.addClass('on');
	if(q != null && q != '') {
		window.location = '?m=search&c=index&a=init&siteid=' + siteid + '&typeid=' + value + '&q=' + q
	}
};
$(function() {
	// 返回顶部

	$("#header").after("<div class='fixediv floater2'><div id='QQkf'><dl><dt>非常感谢您关注张家口家教吧</dt><dd>QQ在线客服: <a target='_blank' href='http://wpa.qq.com/msgrd?v=3&uin=859096372&site=qq&menu=yes'><img border='0' src='http://pub.idqqimg.com/wpa/images/counseling_style_52.png' alt='点击这里给我发消息' title='点击这里给我发消息'/></a></dd><dd>教员群（禁言）:196850151</dd><dd>家教热线: 13293329290 樊老师  </dd><dd>微信公众账号: </dd></dl></div><a href='javascript:void(0)' id='ShouCang'>收藏</a><a href='javascript:void(0)' id='gotop'></a></div>");

	$('#gotop').live('click', function() {
		$('html,body').animate({
			scrollTop: '0px'
		}, 500);
		return false;
	});
	$("#ShouCang,#nav .end a").live('click', function() {
		AddFavorite(location.href, $('title').text());
	});
	$("#QQkf,.Qqun_url1 img").mouseenter(function() {
		$("#QQkf").attr("class", "open");
		$("#QQkf dl").dequeue();
		$("#QQkf dl").show();
		$("#QQkf dl").css({
			"width": "0",
			"height": "0"
		});
		$("#QQkf dl").animate({
			width: '300px',
			height: '175px'
		});
	});
	$("#QQkf,.Qqun_url1 img").mouseleave(function() {
		$("#QQkf").attr("class", "");
		$("#QQkf dl").dequeue();
		$("#QQkf dl").css({
			"width": "0",
			"height": "0"
		});
		$("#QQkf dl").hide();
	});
	$(".fixediv").floatadv();
	if(CName) {
		CNAME(CName)
	}
});
var CName = false;
var ShowCountSrc = false; // 内容页统计网址
jQuery.fn.floatadv = function(loaded) {
	var obj = this;
	body_height = parseInt($(window).height());
	block_height = parseInt(obj.height());

	top_position = parseInt((body_height / 2)-(block_height / 2) + $(window).scrollTop());
	if(body_height < block_height) {
		top_position = 0 + $(window).scrollTop();
	};

	if(!loaded) {
		obj.css({
			'position': 'absolute'
		});
		obj.css({
			'top': top_position-1125
		});
		$(window).bind('resize', function() {
			obj.floatadv(!loaded);
		});
		$(window).bind('scroll', function() {
			obj.floatadv(!loaded);
		});
	} else {
		obj.stop();
		obj.css({
			'position': 'absolute'
		});
		obj.animate({
			'top': top_position-890
		}, 400, 'linear');
	}
};

window._bd_share_config = {
	"common": {
		"bdSnsKey": {},
		"bdText": "",
		"bdMini": "2",
		"bdMiniList": false,
		"bdPic": "",
		"bdStyle": "1",
		"bdSize": "32"
	},
	"slide": {
		"type": "slide",
		"bdImg": "3",
		"bdPos": "right",
		"bdTop": "100"
	},
	"image": {
		"viewList": ["qzone", "tsina", "tqq", "weixin", "sqq", "douban", "bdhome", "tieba"],
		"viewText": "分享到：",
		"viewSize": "16"
	}
};
with(document) 0[(getElementsByTagName('head')[0] || body).appendChild(createElement('script')).src = 'http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion=' + ~(-new Date() / 36e5)];

