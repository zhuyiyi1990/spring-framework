<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试FlashMapController</title>
</head>
<%
    pageContext.setAttribute("contextPath",request.getContextPath());
%>
<body>
    <a href="${contextPath}/flashMap/submitOrder">测试/flashMap/submitOrder</a><br>
</body>
</html>