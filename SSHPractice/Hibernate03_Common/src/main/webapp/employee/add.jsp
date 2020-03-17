<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>员工增加</h1>
<form action="add.do" method="post">
员工ID:<input type="text" name="id"/><br/>
员工姓名:<input type="text" name="name"/><br/>
性别:<input type="text" name="sex"/><br/>
生日:<input type="text" name="birthday"/><br/>
加入日期:<input type="text" name="joinDate"/><br/>
身份证号:<input type="text" name="cardId"/><br/>
<input type="submit" value="提交"/><br/>
</form>
</body>
</html>