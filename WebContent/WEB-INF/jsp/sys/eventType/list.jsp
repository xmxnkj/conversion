<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		var listjsonUrl = '<s:url action="listjson" namespace="/sys/eventType"/>';
		var editUrl = '<s:url action="edit" namespace="/sys/eventType" />';
		var deleteUrl = '<s:url action="delete" namespace="/sys/eventType" />';
		
		var addTitle="添加事件类型";
		var editTitle = "修改事件类型";
		var confirmDeleteTitle = "提示信息";
		var confirmDeleteInfo = "您确认要删除吗？";
		var deleteSuccess = "删除成功！";
		var dlgWidth = 450;
		var dlgHeight = 380;
	</script>
	<script src="<s:url value="/content/scripts/common/list.js"/>"></script>
    
	<table id="tbl" data-options="fit:true">
		<thead>
			<tr>
				<th data-options="field:'name'">事件类型名称</th>
				<th data-options="field:'displayOrder'">顺序</th>
			</tr>
		</thead>
	</table>
</body>
</html>