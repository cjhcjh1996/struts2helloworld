<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2019/11/28
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <title>hello</title>
</head>
<body>
<h1>欢迎进入我的第一个Struts2程序</h1>
${pageContext.request.contextPath}
<%=request.getContextPath()%>
${successmsg }
${msg }
${requestScope.msg }

用户登录信息：<br>
用户名：${requestScope.usernamemsg }<br>
密码：${requestScope.pwdmsg }


</body>
</html>
