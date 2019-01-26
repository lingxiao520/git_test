<%--
  Created by IntelliJ IDEA.
  User: lingxiao
  Date: 2019/1/18
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ssm</title>
</head>
<body>
        <a href="/account/findAll">整合测试</a>
        <form method="post" action="/account/saveAccount">
            姓名<input type="text" name="name">
            金额<input type="text" name="money">
            <input type="submit" value="提交">
        </form>
</body>
</html>
