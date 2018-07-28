<%-- 
    Document   : variableImplicitas
    Created on : 27/07/2018, 05:08:20 PM
    Author     : Abel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL y Varibles implicitas</title>
    </head>
    <body>
        <h1>EL y Varibles implicitas</h1>
        <ul>
            <li>Nombre App: ${pageContext.request.contextPath}</li
            <li>Navegador del cliente: ${header["User-Agent"]}</li>
            <li>Id Session: ${cookie.JSESSIONID.value}</li>
            <li>Web Server: ${pageContext.servletContext.serverInfo}</li>
            <li>Valor parametro usuario: ${param["usuario"]}</li>
        </ul>
         <br/>
        <br/>
        <a href="index.jsp">Regresar</a>
    </body>
</html>
