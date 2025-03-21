<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%-- <fmt:setBundle basename="login" /> --%>
<html>
<head>
    <title>测试I18nController</title>
</head>
<%
    pageContext.setAttribute("contextPath",request.getContextPath());
%>
<body>
    <a href="${contextPath}/i18n/i18n">测试/i18n/i18n</a><br>
    <hr>
    <h1><fmt:message key="welcomeInfo"></fmt:message></h1>
    <form action="#" method="post">
        <fmt:message key="username"></fmt:message>:<input type="text" name="username"><br>
        <fmt:message key="password"></fmt:message>:<input type="text" name="password"><br>
        <input type="submit" value="<fmt:message key='btn'/>"/>
    </form>
    <a href="${contextPath}/i18n/i18nLocaleChange?locale=zh_CN">中文</a><br>
    <a href="${contextPath}/i18n/i18nLocaleChange?locale=en_US">英文</a><br>
</body>
</html>