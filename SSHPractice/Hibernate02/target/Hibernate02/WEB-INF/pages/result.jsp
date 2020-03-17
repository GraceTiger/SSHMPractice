<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>员工列表</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>员工编号</th>
        <th>员工姓名</th>
        <th>员工性别</th>
        <th>员工生日</th>
        <th>员工工资</th>
    </tr>
    </thead>
    <tbody>
    <!-- row -->
    <c:forEach var="employee" items="${employeeList}">
        <tr>
            <td>
                    ${employee.id}
            </td>
            <td>
                    ${employee.name}
            </td>
            <td>
                    ${employee.sex}
            </td>
            <td>
                    ${employee.birthday}
            </td>
            <td>
                    ${employee.salary}
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
