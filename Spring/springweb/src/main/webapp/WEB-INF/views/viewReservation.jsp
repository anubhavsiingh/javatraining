<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
        <tr>
            <td>Name :</td>
            <td>${name}</td> <!-- Expression lang is used to access data stored in the request or an application or bean -->
        </tr>
        <tr>
            <td>City :</td>
            <td>${city}</td>
        </tr>
        <tr>
            <td>Gender :</td>
            <td>${gender}</td>
        </tr>
    </table>

</body>
</html>