<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>添加产品</title>
</head>
<body>
<h1>添加产品</h1>
<form method="post" action="add.do">
    产品名称:<input type="text" name="name"/><br/>
    产品单价:<input type="text" name="price"/><br/>
    库存数量:<input type="text" name="qty"/><br/>
    产品类别:
    <select name="group">
        <c:forEach var="category" items="${categorys}">
            <option value="${category.no}">${category.name}</option>
        </c:forEach>
    </select><br/>
    <input type="submit" value="增加"/>
</form>
</body>
</html>
