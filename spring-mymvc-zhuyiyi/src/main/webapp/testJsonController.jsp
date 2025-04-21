<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试JsonController</title>
</head>
<%
    pageContext.setAttribute("contextPath",request.getContextPath());
%>
<body>
    <a href="${contextPath}/json/json">测试/json/json</a><br>
</body>
</html>