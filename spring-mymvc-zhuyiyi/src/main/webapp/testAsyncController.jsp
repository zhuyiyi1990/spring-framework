<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试AsyncController</title>
</head>
<%
    pageContext.setAttribute("contextPath",request.getContextPath());
%>
<body>
    <a href="${contextPath}/async/webAsyncTask">测试/async/webAsyncTask</a><br>
    <a href="${contextPath}/async/callable">测试/async/callable</a><br>
</body>
</html>