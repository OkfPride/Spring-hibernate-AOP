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

                <c:url var="emp" value="/edit" >
                    <c:param name="empId" value="${each.id}" />
                </c:url>
                <c:url var="emp2" value="/delete">
                    <c:param name="empId" value="${each.id}"/>
                </c:url>
                <tr>
                    <td>${each.name}</td>
                    <td>${each.surnname}</td>
                    <td>${each.email}</td>
                    <td>${each.department}</td>
                    <td>${each.salary}</td>
                    <td>
                        <input style = "color: red" type="button" onclick="window.location.href = '${emp}'" value="update" >
                    </td>
                    <td>
                        <input style = "color: green" type="button" onclick="window.location.href = '${emp2}'" value="DELETE">
                    </td>
                </tr>
            </c:forEach>

        </table>
        <br/>
        <form action="/add" method="get" >
            <button style="color: red"  >add new</button>
        </form>
        <input style = "color: red" type="button"
               value="Add new" onclick="window.location.href = '/add'">
    </body>
</html>
