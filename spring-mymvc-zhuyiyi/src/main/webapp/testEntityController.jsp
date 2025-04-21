<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试EntityController</title>
</head>
<%
    pageContext.setAttribute("contextPath",request.getContextPath());
%>
<body>
    测试/entity/testParameter
    <form action="${contextPath}/entity/testParameter" method="post">
        姓名：<input type="text" name="name" value="zhuyiyi"><br>
        <input type="submit" value="提交"><br>
    </form>
    <a href="${contextPath}/entity/testReturnValue">测试/entity/testReturnValue</a><br>
    <a href="${contextPath}/entity/testResponseEntity1">测试/entity/testResponseEntity1</a><br>
    <a href="${contextPath}/entity/testResponseEntity2">测试/entity/testResponseEntity2</a><br>
</body>
</html>