<%-- 
    Document   : procesaFormulario
    Created on : 26/07/2018, 09:15:01 AM
    Author     : Abel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Processa formulario</title>
    </head>
    <body>
        <h1>Resultado</h1>
        Usuario  : <%= request.getParameter("usuario")%>
        <br>
        Password : <%= request.getParameter("password")%>      
        <br>
        <a href="index.html">Regresar</a>
    </body>
</html>
