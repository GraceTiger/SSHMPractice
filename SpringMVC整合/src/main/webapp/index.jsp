<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/9 0009
  Time: 下午 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
    <a href="account/selectAll">查询所有</a>
    <form action="account/insert" method="post">
        编号：<input type="text" name="id"/><br/>
        姓名：<input type="text" name="name"/><br/>
        金额：<input type="text" name="money"/><br/>
        <input type="submit" value="添加"/>
    </form>
</body>
</html>
