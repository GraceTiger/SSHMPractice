<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加客户</title>
</head>
<body>
  <form action="process" method="post">
      <h1>添加客户</h1>
      客户序号：<input type="text" name="no"/><br/>
      客户编码：<input type="text" name="code"/><br/>
      客户名称：<input type="text" name="name"/><br/>
      客户人数：<input type="text" name="staffNum"/><br/>
      客户日期：<input type="text" name="createDate"/><br/>
      年销售额：<input type="text" name="yearSales"/><br/>
      注册地址：<input type="text" name="address"/><br/>
      公司电话：<input type="text" name="tel"/><br/>
      <input type="submit" value="增加"/>
      <input type="submit" value="修改"/>
  </form>
</body>
</html>
