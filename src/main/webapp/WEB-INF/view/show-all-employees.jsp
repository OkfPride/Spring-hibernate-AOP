<%-- 
    Document   : show-all-employees
    Created on : 16.03.2021, 7:55:36
    Author     : JavaDev
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show all employees</title>
    </head>
    <body>
        <h2>Table</h2>

        <table>
            <tr>
                <th>Name</th>
                <th>surnname</th>
                <th>Email</th>
                <th>Department</th>
                <th>Salary</th>
            </tr>
            <c:forEach var="each" items="${employees}">

                <tr>
                    <td>${each.name}</td>
                    <td>${each.surnname}</td>
                    <td>${each.email}</td>
                    <td>${each.department}</td>
                    <td>${each.salary}</td>
                </tr>
            </c:forEach>

        </table>
    </body>
</html>
