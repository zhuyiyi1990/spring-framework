<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试InitBinderController</title>
</head>
<%
    pageContext.setAttribute("contextPath",request.getContextPath());
%>
<body>
    <a href="${contextPath}/initBinder/test?s.name=学生名&b.name=书名">测试/initBinder/test</a><br>
</body>
</html>