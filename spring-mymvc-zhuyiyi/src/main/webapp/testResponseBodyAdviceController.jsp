<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试ResponseBodyAdviceController</title>
</head>
<%
    pageContext.setAttribute("contextPath",request.getContextPath());
%>
<body>
    <a href="${contextPath}/responseBodyAdvice/test">测试/responseBodyAdvice/test</a><br>
</body>
</html>