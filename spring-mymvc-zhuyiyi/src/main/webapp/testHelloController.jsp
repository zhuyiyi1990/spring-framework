<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试HelloController</title>
</head>
<%
    pageContext.setAttribute("contextPath",request.getContextPath());
%>
<body>
    <a href="${contextPath}/hello/hello">测试/hello/hello</a><br>
    <a href="${contextPath}/hello/helloaaa">测试/hello/hello*</a><br>
</body>
</html>