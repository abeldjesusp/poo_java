<%-- 
    Document   : Expresiones
    Created on : 26/07/2018, 09:14:37 AM
    Author     : Abel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expresiones</title>
    </head>
    <body>
        <h1>Expresiones JSPs</h1>
        <p>Concatenacion: <%= "Saludos " + "JSP" %></p>
        <p>Opereacion matematica: <%= 2 * 3 / 2 %></p>
        <p>Session id: <%= session.getId()%></p>
        <br>
        <a href="index.html">Regresar</a>
    </body>
</html>
