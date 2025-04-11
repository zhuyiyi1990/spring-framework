<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试SessionAttributeModelAttributeInitBinderController</title>
</head>
<%
    pageContext.setAttribute("contextPath",request.getContextPath());
%>
<body>
    <a href="${contextPath}/sessionAttributeModelAttributeInitBinder/testSessionAttribute">测试/sessionAttributeModelAttributeInitBinder/testSessionAttribute</a><br>
    <a href="${contextPath}/sessionAttributeModelAttributeInitBinder/testSessionComplete">测试/sessionAttributeModelAttributeInitBinder/testSessionComplete</a><br>
    <a href="${contextPath}/sessionAttributeModelAttributeInitBinder/testModelAttributeInitBinder?s.name=学生名&b.name=书名">测试/sessionAttributeModelAttributeInitBinder/testModelAttributeInitBinder</a><br>
</body>
</html>