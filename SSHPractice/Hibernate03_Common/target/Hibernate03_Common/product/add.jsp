<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>产品增加</title>
</head>
<body>
<h1>产品增加</h1>
<form action="add.do" method="post">
产品编码:<input type="text" name="code"/><br/>
产品名称:<input type="text" name="name"/><br/>
生产日期:<input type="date" name="date"/><br/>
单价:<input type="text" name="unitPrice"/><br/>
库存数量:<input type="text" name="qtyInStock"/><br/>
<input type="submit" value="增加"/><br/>
</form>
</body>
</html>