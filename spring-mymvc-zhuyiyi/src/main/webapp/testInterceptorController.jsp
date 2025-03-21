<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试InterceptorController.jsp</title>
</head>
<%
    pageContext.setAttribute("contextPath",request.getContextPath());
%>
<body>
    <a href="${contextPath}/interceptor/testInterceptor">测试/interceptor/testInterceptor</a><br>
</body>
</html>