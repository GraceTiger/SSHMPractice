<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>添加产品</title>
</head>
<body>
<h1>添加产品</h1>
<form method="post" action="add">
    产品名称:<input type="text" name="name"/><br/>
    生产日期:<input type="date" name="date"/><br/>
    产品单价:<input type="text" name="unitPrice"/><br/>
    库存数量:<input type="text" name="qty"/><br/>
    包装类型:<input type="text" name="packaging.type"/><br/>
    包装尺寸:<input type="text" name="packaging.size"/><br/>
    销售区域:
    <c:forEach var="area" items="${areas}" varStatus="status">
        <label><input name="areas[${status.index}].no" type="checkbox" value="${area.no}" />${area.name}</label>
    </c:forEach>
    <br/>
    <input type="submit" value="增加"/>
</form>
</body>
</html>
