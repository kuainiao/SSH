/**
 * 浮动DIV定时显示提示信息,如操作成功, 失败等
 * 
 * @param string
 *            tips (提示的内容)
 * @param int
 *            height 显示的信息距离浏览器顶部的高度
 * @param int
 *            time 显示的时间(按秒算), time > 0
 * @sample <a href="javascript:void(0);" onclick="showTips( '操作成功', 100, 3
 *         );">点击</a>
 * @sample 上面代码表示点击后显示操作成功3秒钟, 距离顶部100px
 * @copyright ZhouHr 2010-08-27
 */ 
function showTips( tips,type ){ 
var windowWidth = document.documentElement.clientWidth; 
var tipsDiv = '<div class="tipsClass">' + tips + '</div>'; 
var color="";
var times=2;
switch   (type)   {   
case   1   :   
color = "#009900"; 
times = 2;
break;     
case   2:   
color = "#3399FF"; 
times = 3; 
break;   
case   3:   
color = "#FF3300"; 
times = 5; 
break;   
}

$( 'body' ).append( tipsDiv ); 
$( 'div.tipsClass' ).css({ 
'top' : 0 + 'px', 
'left' : ( windowWidth / 2 ) - ( tips.length * 16 / 2) + 'px', 
'position' : 'fixed', 
'padding' : '20px 20px', 
'background': color, 
'font-weight': 'bold',
'font-size' : 20 + 'px', 
'margin' : '0px auto', 
'text-align': 'center', 
'width' : 'auto', 
'color' : '#ffffff', 
'opacity' : '0.85' 
}).show(); 
setTimeout(function () { $('div.tipsClass').fadeOut("slow", function () { $(this).remove(); }); }, (times * 1000));
} 

// 公告切换
eval(function(p,a,c,k,e,r){e=function(c){return(c<a?'':e(parseInt(c/a)))+((c=c%a)>35?String.fromCharCode(c+29):c.toString(36))};if(!''.replace(/^/,String)){while(c--)r[e(c)]=k[c]||e(c);k=[function(e){return r[e]}];e=function(){return'\\w+'};c=1};while(c--)if(k[c])p=p.replace(new RegExp('\\b'+e(c)+'\\b','g'),k[c]);return p}('6.I.J=2(l){l=6.K({w:0,8:"L",9:"M N",m:"O",o:p,s:0,x:"t",n:"",y:q,u:""},l,{P:Q});v.z(2(){4 b;4 c=-1;4 d=6(v);3(l.y){l.9=l.9+"[R^=\'#\']"}4 e=d.7(l.9);4 f=d.7(l.m);4 g=e.S;4 h=2(a){3(a!=c){e.5(c).A(l.8);f.B();d.7(l.9+":5("+a+")").C(l.8);3(l.o<p&&l.n!="")l.n="";3(l.n=="T"){d.7(l.m+":5("+a+")").U({D:q,E:p})}r 3(l.n=="V"){d.7(l.m+":5("+a+")").W({D:q,E:p})}r{d.7(l.m+":5("+a+")").F()}c=a}};4 j=2(){e.5(c).A(l.8);f.B();3(++c>=g)c=0;e.5(c).C(l.8);f.5(c).F()};h(l.w);3(l.s>0){4 k=X(2(){j()},l.s)}e.z(2(i,a){3(l.x=="t"){6(a).t(2(){h(i);G q})}r 3(l.o>0){6(a).Y(2(){b=Z(2(){h(i);b=H},l.o)},2(){3(b!=H)10(b)})}r{6(a).11(2(){h(i)})}})});3(l.u!="")12(l[l.u]);G v};',62,65,'||function|if|var|eq|jQuery|find|titOnClassName|titCell|||||||||||||mainCell|effect|delayTime|250|false|else|interTime|click|debug|this|defaultIndex|trigger|omitLinks|each|removeClass|hide|addClass|queue|duration|show|return|null|fn|switchTab|extend|on|dt|span|dd|version|120|href|length|fade|fadeIn|slide|slideDown|setInterval|hover|setTimeout|clearTimeout|mouseover|alert'.split('|'),0,{}))

/*
 * Modernizr 2.6.2 (Custom Build) | MIT & BSD * Build:
 * http://modernizr.com/download/#-fontface-opacity-cssanimations-generatedcontent-cssgradients-csstransforms-csstransforms3d-csstransitions-input-inputtypes-touch-shiv-cssclasses-teststyles-testprop-testallprops-hasevent-prefixes-domprefixes-forms_placeholder
 */
;window.Modernizr=function(a,b,c){function B(a){j.cssText=a}function C(a,b){return B(n.join(a+";")+(b||""))}function D(a,b){return typeof a===b}function E(a,b){return!!~(""+a).indexOf(b)}function F(a,b){for(var d in a){var e=a[d];if(!E(e,"-")&&j[e]!==c)return b=="pfx"?e:!0}return!1}function G(a,b,d){for(var e in a){var f=b[a[e]];if(f!==c)return d===!1?a[e]:D(f,"function")?f.bind(d||b):f}return!1}function H(a,b,c){var d=a.charAt(0).toUpperCase()+a.slice(1),e=(a+" "+p.join(d+" ")+d).split(" ");return D(b,"string")||D(b,"undefined")?F(e,b):(e=(a+" "+q.join(d+" ")+d).split(" "),G(e,b,c))}function I(){e.input=function(c){for(var d=0,e=c.length;d<e;d++)t[c[d]]=c[d]in k;return t.list&&(t.list=!!b.createElement("datalist")&&!!a.HTMLDataListElement),t}("autocomplete autofocus list placeholder max min multiple pattern required step".split(" ")),e.inputtypes=function(a){for(var d=0,e,f,h,i=a.length;d<i;d++)k.setAttribute("type",f=a[d]),e=k.type!=="text",e&&(k.value=l,k.style.cssText="position:absolute;visibility:hidden;",/^range$/.test(f)&&k.style.WebkitAppearance!==c?(g.appendChild(k),h=b.defaultView,e=h.getComputedStyle&&h.getComputedStyle(k,null).WebkitAppearance!=="textfield"&&k.offsetHeight!==0,g.removeChild(k)):/^(search|tel)$/.test(f)||(/^(url|email)$/.test(f)?e=k.checkValidity&&k.checkValidity()===!1:e=k.value!=l)),s[a[d]]=!!e;return s}("search tel url email datetime date month week time datetime-local number range color".split(" "))}var d="2.6.2",e={},f=!0,g=b.documentElement,h="modernizr",i=b.createElement(h),j=i.style,k=b.createElement("input"),l=":)",m={}.toString,n=" -webkit- -moz- -o- -ms- ".split(" "),o="Webkit Moz O ms",p=o.split(" "),q=o.toLowerCase().split(" "),r={},s={},t={},u=[],v=u.slice,w,x=function(a,c,d,e){var f,i,j,k,l=b.createElement("div"),m=b.body,n=m||b.createElement("body");if(parseInt(d,10))while(d--)j=b.createElement("div"),j.id=e?e[d]:h+(d+1),l.appendChild(j);return f=["&#173;",'<style id="s',h,'">',a,"</style>"].join(""),l.id=h,(m?l:n).innerHTML+=f,n.appendChild(l),m||(n.style.background="",n.style.overflow="hidden",k=g.style.overflow,g.style.overflow="hidden",g.appendChild(n)),i=c(l,a),m?l.parentNode.removeChild(l):(n.parentNode.removeChild(n),g.style.overflow=k),!!i},y=function(){function d(d,e){e=e||b.createElement(a[d]||"div"),d="on"+d;var f=d in e;return f||(e.setAttribute||(e=b.createElement("div")),e.setAttribute&&e.removeAttribute&&(e.setAttribute(d,""),f=D(e[d],"function"),D(e[d],"undefined")||(e[d]=c),e.removeAttribute(d))),e=null,f}var a={select:"input",change:"input",submit:"form",reset:"form",error:"img",load:"img",abort:"img"};return d}(),z={}.hasOwnProperty,A;!D(z,"undefined")&&!D(z.call,"undefined")?A=function(a,b){return z.call(a,b)}:A=function(a,b){return b in a&&D(a.constructor.prototype[b],"undefined")},Function.prototype.bind||(Function.prototype.bind=function(b){var c=this;if(typeof c!="function")throw new TypeError;var d=v.call(arguments,1),e=function(){if(this instanceof e){var a=function(){};a.prototype=c.prototype;var f=new a,g=c.apply(f,d.concat(v.call(arguments)));return Object(g)===g?g:f}return c.apply(b,d.concat(v.call(arguments)))};return e}),r.touch=function(){var c;return"ontouchstart"in a||a.DocumentTouch&&b instanceof DocumentTouch?c=!0:x(["@media (",n.join("touch-enabled),("),h,")","{#modernizr{top:9px;position:absolute}}"].join(""),function(a){c=a.offsetTop===9}),c},r.opacity=function(){return C("opacity:.55"),/^0.55$/.test(j.opacity)},r.cssanimations=function(){return H("animationName")},r.cssgradients=function(){var a="background-image:",b="gradient(linear,left top,right bottom,from(#9f9),to(white));",c="linear-gradient(left top,#9f9, white);";return B((a+"-webkit- ".split(" ").join(b+a)+n.join(c+a)).slice(0,-a.length)),E(j.backgroundImage,"gradient")},r.csstransforms=function(){return!!H("transform")},r.csstransforms3d=function(){var a=!!H("perspective");return a&&"webkitPerspective"in g.style&&x("@media (transform-3d),(-webkit-transform-3d){#modernizr{left:9px;position:absolute;height:3px;}}",function(b,c){a=b.offsetLeft===9&&b.offsetHeight===3}),a},r.csstransitions=function(){return H("transition")},r.fontface=function(){var a;return x('@font-face {font-family:"font";src:url("https://")}',function(c,d){var e=b.getElementById("smodernizr"),f=e.sheet||e.styleSheet,g=f?f.cssRules&&f.cssRules[0]?f.cssRules[0].cssText:f.cssText||"":"";a=/src/i.test(g)&&g.indexOf(d.split(" ")[0])===0}),a},r.generatedcontent=function(){var a;return x(["#",h,"{font:0/0 a}#",h,':after{content:"',l,'";visibility:hidden;font:3px/1 a}'].join(""),function(b){a=b.offsetHeight>=3}),a};for(var J in r)A(r,J)&&(w=J.toLowerCase(),e[w]=r[J](),u.push((e[w]?"":"no-")+w));return e.input||I(),e.addTest=function(a,b){if(typeof a=="object")for(var d in a)A(a,d)&&e.addTest(d,a[d]);else{a=a.toLowerCase();if(e[a]!==c)return e;b=typeof b=="function"?b():b,typeof f!="undefined"&&f&&(g.className+=" "+(b?"":"no-")+a),e[a]=b}return e},B(""),i=k=null,function(a,b){function k(a,b){var c=a.createElement("p"),d=a.getElementsByTagName("head")[0]||a.documentElement;return c.innerHTML="x<style>"+b+"</style>",d.insertBefore(c.lastChild,d.firstChild)}function l(){var a=r.elements;return typeof a=="string"?a.split(" "):a}function m(a){var b=i[a[g]];return b||(b={},h++,a[g]=h,i[h]=b),b}function n(a,c,f){c||(c=b);if(j)return c.createElement(a);f||(f=m(c));var g;return f.cache[a]?g=f.cache[a].cloneNode():e.test(a)?g=(f.cache[a]=f.createElem(a)).cloneNode():g=f.createElem(a),g.canHaveChildren&&!d.test(a)?f.frag.appendChild(g):g}function o(a,c){a||(a=b);if(j)return a.createDocumentFragment();c=c||m(a);var d=c.frag.cloneNode(),e=0,f=l(),g=f.length;for(;e<g;e++)d.createElement(f[e]);return d}function p(a,b){b.cache||(b.cache={},b.createElem=a.createElement,b.createFrag=a.createDocumentFragment,b.frag=b.createFrag()),a.createElement=function(c){return r.shivMethods?n(c,a,b):b.createElem(c)},a.createDocumentFragment=Function("h,f","return function(){var n=f.cloneNode(),c=n.createElement;h.shivMethods&&("+l().join().replace(/\w+/g,function(a){return b.createElem(a),b.frag.createElement(a),'c("'+a+'")'})+");return n}")(r,b.frag)}function q(a){a||(a=b);var c=m(a);return r.shivCSS&&!f&&!c.hasCSS&&(c.hasCSS=!!k(a,"article,aside,figcaption,figure,footer,header,hgroup,nav,section{display:block}mark{background:#FF0;color:#000}")),j||p(a,c),a}var c=a.html5||{},d=/^<|^(?:button|map|select|textarea|object|iframe|option|optgroup)$/i,e=/^(?:a|b|code|div|fieldset|h1|h2|h3|h4|h5|h6|i|label|li|ol|p|q|span|strong|style|table|tbody|td|th|tr|ul)$/i,f,g="_html5shiv",h=0,i={},j;(function(){try{var a=b.createElement("a");a.innerHTML="<xyz></xyz>",f="hidden"in a,j=a.childNodes.length==1||function(){b.createElement("a");var a=b.createDocumentFragment();return typeof a.cloneNode=="undefined"||typeof a.createDocumentFragment=="undefined"||typeof a.createElement=="undefined"}()}catch(c){f=!0,j=!0}})();var r={elements:c.elements||"abbr article aside audio bdi canvas data datalist details figcaption figure footer header hgroup mark meter nav output progress section summary time video",shivCSS:c.shivCSS!==!1,supportsUnknownElements:j,shivMethods:c.shivMethods!==!1,type:"default",shivDocument:q,createElement:n,createDocumentFragment:o};a.html5=r,q(b)}(this,b),e._version=d,e._prefixes=n,e._domPrefixes=q,e._cssomPrefixes=p,e.hasEvent=y,e.testProp=function(a){return F([a])},e.testAllProps=H,e.testStyles=x,g.className=g.className.replace(/(^|\s)no-js(\s|$)/,"$1$2")+(f?" js "+u.join(" "):""),e}(this,this.document),Modernizr.addTest("placeholder",function(){return"placeholder"in(Modernizr.input||document.createElement("input"))&&"placeholder"in(Modernizr.textarea||document.createElement("textarea"))});

$(function() {  
  // For touch devices, flip the cards on a click or touch start event
  if(Modernizr.touch) // iPads and the like
  {
    // Functions for toggling flipcard
    $('.flipcard').bind('touchstart MSPointerDown',function(){ $(this).toggleClass('hover'); });
  }
  // For devices that just dont support 3d transforms
  else if(!Modernizr.csstransforms3d)// IE and the like
  {
    // Make the overflow hidden and set the back card to the left
    $('.flipcard-container').css({ overflow: 'hidden' });
    
    // Functions for toggling flipcard
    var show_back = function(){$('.face.back').css({left: '100%'}); $('.face.front',$(this)).animate({'left':'-100%'});$('.face.back',$(this)).animate({'left':'0'}); }
    var hide_back = function(){$('.face.front',$(this)).animate({'left':'0'});$('.face.back',$(this)).animate({'left':'100%'}); }
  
    $('.flipcard').hover(show_back,hide_back);
  }
  
  // I think we should show the flip at least once.
  var flipOnce3d = function(recur){
    $('.flipcard:eq(0)').toggleClass('hover');
    if(recur)
    {
      setTimeout(flipOnce3d,750,false);
    }
  };
  var flipOnceIE = function(recur)
  {
    var action = recur ? 'mouseover' : 'mouseout';
    $('.flipcard:eq(0)').trigger(action);
    if(recur)
    {
      setTimeout(flipOnceIE,750,false);
    }
  }
  var flipOnce = Modernizr.csstransforms3d ? flipOnce3d : flipOnceIE;
  var flip = setTimeout(function(){flipOnce(true)},1500);
  
  /* Overlay for when the form gets focus */
  var show_overlay = function(){
    $('#pageoverlay').show();
    if(typeof $.unblockUI == 'function')
    {
			$.unblockUI();
    }
  };
});


(function($){$.fn.scrollLoading=function(options){var defaults={attr:"data-url",container:$(window),callback:$.noop};var params=$.extend({},defaults,options||{});params.cache=[];$(this).each(function(){var node=this.nodeName.toLowerCase(),url=$(this).attr(params["attr"]);var data={obj:$(this),tag:node,url:url};params.cache.push(data)});var callback=function(call){if($.isFunction(params.callback)){params.callback.call(call.get(0))}};var loading=function(){var contHeight=params.container.height();if($(window).get(0)===window){contop=$(window).scrollTop()}else{contop=params.container.offset().top};$.each(params.cache,function(i,data){var o=data.obj,tag=data.tag,url=data.url,post,posb;if(o){post=o.offset().top-contop,post+o.height();if((post>=0&&post<contHeight)||(posb>0&&posb<=contHeight)){if(url){if(tag==="img"){callback(o.attr("src",url))}else{o.load(url,{},function(){callback(o)})}}else{callback(o)};data.obj=null}}})};loading();params.container.bind("scroll",loading)}})(jQuery);