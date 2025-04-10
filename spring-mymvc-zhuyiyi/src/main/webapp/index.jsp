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
    <a href="${contextPath}/testHelloController.jsp">测试HelloController</a><br>
    <a href="${contextPath}/testBeanNameUrlHandlerMappingController.jsp">测试BeanNameUrlHandlerMappingController</a><br>
    <a href="${contextPath}/testPathVariableController.jsp">测试PathVariableController</a><br>
    <a href="${contextPath}/testRedirectForwardController.jsp">测试RedirectForwardController</a><br>
    <a href="${contextPath}/testModelMapController.jsp">测试ModelMapController</a><br>
    <a href="${contextPath}/testSessionAttributeModelAttributeInitBinderController.jsp">测试SessionAttributeModelAttributeInitBinderController</a><br>
    <a href="${contextPath}/testDateConverterController.jsp">测试DateConverterController</a><br>
    <a href="${contextPath}/testMyConverterController.jsp">测试MyConverterController</a><br>
    <a href="${contextPath}/testValidationController.jsp">测试ValidationController</a><br>
    <a href="${contextPath}/testViewResolverController.jsp">测试ViewResolverController</a><br>
    <a href="${contextPath}/testDownloadController.jsp">测试DownloadController</a><br>
    <a href="${contextPath}/testEntityController.jsp">测试EntityController</a><br>
    <a href="${contextPath}/testInterceptorController.jsp">测试InterceptorController</a><br>
    <a href="${contextPath}/testJsonController.jsp">测试JsonController</a><br>
    <a href="${contextPath}/testUploadController.jsp">测试UploadController</a><br>
    <a href="${contextPath}/testExceptionController.jsp">测试ExceptionController</a><br>
    <a href="${contextPath}/testI18nController.jsp">测试I18nController</a><br>
    <a href="${contextPath}/testAsyncController.jsp">测试AsyncController</a><br>
</body>
</html>