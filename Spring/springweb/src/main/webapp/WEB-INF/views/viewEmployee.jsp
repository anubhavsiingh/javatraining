<%@page import="com.coforge.training.springweb.model.Employee"%>
<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Information</title>
</head>
<body>
<% String param = (String)request.getAttribute("name");
	out.println(param);
%>
<h2>Employee Information Submitted Successfully</h2>
    <table>
        <tr>
            <td>Name :</td>
            <td>${name}</td> <!-- Expression language is used to access data stored in the request or an application or bean -->
        </tr>
        <tr>
            <td>ID :</td>
            <td>${id}</td>
        </tr>
        <tr>
            <td>Contact Number :</td>
            <td>${contactNumber}</td>
        </tr>
    </table>

</body>
</html>