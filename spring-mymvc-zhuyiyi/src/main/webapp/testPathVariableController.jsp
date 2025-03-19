<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试PathVariableController</title>
</head>
<%
    pageContext.setAttribute("contextPath",request.getContextPath());
%>
<body>
    <a href="${contextPath}/pathVariable/testPathVariable/1/zhuyiyi">测试/pathVariable/testPathVariable/{id}/{name}</a><br>
</body>
</html>