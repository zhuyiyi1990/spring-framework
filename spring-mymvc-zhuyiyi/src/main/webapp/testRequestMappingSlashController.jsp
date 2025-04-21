<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试RequestMappingSlashController</title>
</head>
<%
    pageContext.setAttribute("contextPath",request.getContextPath());
%>
<body>
    <a href="${contextPath}/slash/withSlash">测试有斜线号</a><br>
    <a href="${contextPath}/slash/withoutSlash">测试没有斜线号</a><br>
</body>
</html>