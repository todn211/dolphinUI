<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tisson" uri="/WEB-INF/tags/jqgrid.tld"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html lang="zh-cn">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>Bootstrap 101 Template</title>

	<!-- 新 Bootstrap 核心 CSS 文件 -->
	<link rel="stylesheet" href="${ctx}/static/ui-lib/bootstrap-3.2.0-dist/css/bootstrap.min.css">
	
	<!-- 可选的Bootstrap主题文件（一般不用引入）
	<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap-theme.min.css"> -->
	
	<script src="${ctx}/static/plugin/jquery-1.11.1.min.js"></script>
	<script src="${ctx}/static/ui-lib/bootstrap-3.2.0-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<%
		List<String> labels = new ArrayList<String>();
		labels.add("abc");
		labels.add("abc");
		labels.add("abc");
		labels.add("abc");
		
		request.setAttribute("labels", labels);
	%>
	
	
	<tisson:hgroup labels="${labels}">
		<tisson:hgitem label="${label}"></tisson:hgitem>****page<br>
		
	</tisson:hgroup>
</body>
</html>