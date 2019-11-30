<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>index</title>
</head>
<body>
<h2>Hello World!--struts2</h2>
<form action="helloActionlogin" method="post">
    <input type="text" name="name">
    姓名：<input type="text" name="user.username">
    年龄：<input type="text" name="user.age">
    <input type="submit" value="提交">
</form>

${pageContext.request.contextPath}
<%=request%>
</body>
</html>
