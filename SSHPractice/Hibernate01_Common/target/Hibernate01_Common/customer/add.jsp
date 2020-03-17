<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>客户增加</h1>
<form action="procecss.do" method="post"">
客户序号:<input type="text" name="no"/><br/>
客户编码:<input type="text" name="code"/><br/>
客户名称:<input type="text" name="name"/><br/>
员工人数:<input type="text" name="num"/><br/>
成立日期:<input type="text" name="date"/><br/>
年销售额:<input type="text" name="yearsales"/><br/>
注册地址:<input type="text" name="address"/><br/>
公司电话:<input type="text" name="tel"/><br/>

<input type="submit" name="action" value="添加" /><br/>
<input type="submit" name="action" value="修改" /><br/>
</form>
</body>
</html>