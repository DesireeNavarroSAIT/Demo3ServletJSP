<%-- 
    Document   : helloWorldJSP
    Created on : 25-May-2021, 2:29:57 PM
    Author     : m-navarro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World Form</title>
    </head>
    <body>
        <h1>Hello World Form</h1>
        <form method="post" action="helloWorld">
            <label>First Name:</label>
            <input type="text" name="firstname" value="${firstname}" placeholder="John">
            <br>
            <label>Last Name:</label>
            <input type="text" name="lastname" value="${lastname}" placeholder="Smith">
            <br>
            <input type="submit" value="Say Hello">
        </form>
        <p>${message}</p>
    </body>
</html>
