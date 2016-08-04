<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%String path = request.getContextPath();%>
<%String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>
<!DOCTYPE html>
<html>
<head>
	<title>首页</title>
    <meta charset="utf-8">
    <base href="<%=basePath%>">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5/themes/bootstrap/easyui.css">  
	<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5/themes/mobile.css">  
	<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5/themes/icon.css">  
	<script type="text/javascript" src="js/jquery-easyui-1.5/jquery.min.js"></script>  
	<script type="text/javascript" src="js/jquery-easyui-1.5/jquery.easyui.min.js"></script> 
	<script type="text/javascript" src="js/jquery-easyui-1.5/jquery.easyui.mobile.js"></script> 
	<script type="text/javascript" src="js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script> 
	<script src="js/public.js"></script>
</head>
<script>
</script>
<body>
<div class="easyui-navpanel">
	<header>
		<div class="m-toolbar">
			<div class="m-title">发布</div>
			<div class="m-right">
			    <a href="javascript:void(0)" class="easyui-linkbutton" plain="true" outline="true">分享</a>
			</div>
		</div>
	</header>
	<form id="publishForm">
		<div style="margin-bottom:10px">
			<input class="easyui-textbox" label="标题：" prompt="标题" style="width:100%">
		</div>
		<div style="margin-bottom:10px">
			<input class="easyui-textbox" label="任务要求：" prompt="任务要求" style="width:100%;height:100px" data-options="multiline:true">
		</div>
		<div style="margin-bottom:10px">
			<input class="easyui-datebox" label="截止时间：" prompt="截止时间" data-options="editable:false,panelWidth:220,panelHeight:240,iconWidth:30" style="width:100%">
		</div>
		<div style="margin-bottom:10px">
			<input class="easyui-numberspinner" label="悬赏：" prompt="悬赏" style="width:100%;" data-options="min:0,max:10">
		</div>
		<div style="margin-bottom:10px">
			<a href="#" class="easyui-linkbutton" plain="true" outline="true" style="width:100px;height:35px">添加图片</a>
		</div>
		<div style="margin:10px;height:110px">
			<img style="float:left" alt="" src="taskImg/1.jpg"/><img style="float:left" alt="" src="taskImg/1.jpg"/><img style="float:left" alt="" src="taskImg/1.jpg"/><img style="float:left" alt="" src="taskImg/1.jpg"/>
		</div>
		<div style="margin-bottom:10px">
			<img src="image/map.jpg" width=100px height=100px/>
		</div>
		<div style="text-align:center">
			<a href="#" class="easyui-linkbutton" style="width:100%;height:40px"><span style="font-size:16px">发布</span></a>
		</div>
	</form>
	
	
	<footer>
		<div class="m-buttongroup m-buttongroup-justified" style="width:100%">
			<a href="pooper/publish.jsp" class="easyui-linkbutton" data-options="iconCls:'icon-large-picture',size:'large',iconAlign:'top',plain:true">发布</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-large-clipart',size:'large',iconAlign:'top',plain:true">铲屎</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-large-shapes',size:'large',iconAlign:'top',plain:true">历史</a>
		</div>
	</footer>
</div>
</body>
</html>