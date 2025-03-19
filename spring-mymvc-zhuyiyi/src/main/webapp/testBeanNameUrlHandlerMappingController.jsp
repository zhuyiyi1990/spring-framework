<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试BeanNameUrlHandlerMappingController</title>
</head>
<%
    pageContext.setAttribute("contextPath",request.getContextPath());
%>
<body>
    <a href="${contextPath}/beanNameUrlHandlerMapping">测试/beanNameUrlHandlerMapping</a><br>
</body>
</html>