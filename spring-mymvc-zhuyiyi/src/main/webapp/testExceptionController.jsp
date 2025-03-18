<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>testExceptionController</title>
</head>
<%
    pageContext.setAttribute("contextPath",request.getContextPath());
%>
<body>
    <a href="${contextPath}/exception/exception1">测试/exception/exception1</a><br>
    <a href="${contextPath}/exception/exception2">测试/exception/exception2</a><br>
    <a href="${contextPath}/exception/exception3">测试/exception/exception3</a><br>
    <a href="${contextPath}/exception/exception4">测试/exception/exception4</a>
</body>
</html>