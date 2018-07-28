<%-- 
    Document   : fondoColor
    Created on : 26/07/2018, 09:35:57 AM
    Author     : Abel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String fondo = request.getParameter("colorFondo");
    //Si no se envio un color, ponemos un color por default
    if(fondo == null || fondo.trim().equals("")){
        fondo = "white";
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fondo color JSP</title>
    </head>
    <body bgColor="<%= fondo%>">
        <h1>Fondo de color aplicado: <%= fondo%></h1>
        <a href="index.html">Regresar</a>
    </body>
</html>
