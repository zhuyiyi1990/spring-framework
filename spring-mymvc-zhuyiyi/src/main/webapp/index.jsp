<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<%
    pageContext.setAttribute("contextPath",request.getContextPath());
%>
<body>
    <h2>Hello World!</h2>
    <a href="${contextPath}/testExceptionController.jsp">测试ExceptionController</a>
</body>
</html>