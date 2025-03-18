<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 2020/3/21
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script src="scripts/jquery-1.9.1.min.js"></script>
<head>
    <title>Title</title>
</head>
<%
    pageContext.setAttribute("ctp",request.getContextPath());
%>
<body>
<a href="${ctp}/json/testRequestJson">发送接送数据</a>
</body>
<script type="text/javascript">
    $("a:first").click(function(){
        var user = {id:"1",name:"zhangsan",age:"12",gender:"man"};
        var jsonuser = JSON.stringify(user);
        $.ajax({
            url:"${ctp}/json/testRequestJson",
            type:"post",
            data:jsonuser,
            contentType:"application/json",
            success:function (data) {
                var user = data.id+"--"+data.name+"--"+data.age+"--"+data.gender;
                alert(user)
            }
        });
        return false;
    })
</script>
</html>