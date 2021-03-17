<%-- 
    Document   : create-new-employee
    Created on : 17.03.2021, 7:19:08
    Author     : JavaDev
--%>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%--<%@ taglib prefix="form" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<!DOCTYPE html>
<html>
    <!--    <head>
          
            <title>Create new employee</title>
        </head>-->
    <br/>
    <body>

        <form:form action="/save" modelAtribute = "${employee}" method="post">  
            <%--<form:hidden  path="id"/>--%>
            <input type="hidden" name="id" value="${employee.id}"/>
            <br/>
            Name <input type = "text" name = "name" value="${employee.name}"/>
            <br/>
            Surname <input type = "text" name = "surname"  value="${employee.name}"/>
            <br/>
            Email <input type = "text" name = "email" value="${employee.email}"/>
            <br/>
            department <input type = "text" name = "department" value="${employee.department} "/>
            <br/>
            salary <input type = "text" name = "salary" value="${employee.salary} "/>
            <br/>
            <input type="submit" value="OK" >

        </form:form>
    </body>
</html>
