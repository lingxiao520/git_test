<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/account/findAccount">查找所有账户</a>
<form method="post" action="/account/saveAccount">
    姓名<input type="text" name="name" >
    余额<input type="text" name="money" >
    <input type="submit" value="提交">
</form>
</body>
</html>
