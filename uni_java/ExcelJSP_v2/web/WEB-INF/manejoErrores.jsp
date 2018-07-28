<%-- 
    Document   : manejoErrores
    Created on : 26/07/2018, 12:52:49 PM
    Author     : Abel
--%>
<%@page isErrorPage="true"%>
<%@page import="java.io.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manejo de errores</title>
        <script src="<%= request.getContextPath()%>/recursos/funciones.js"></script>
    </head>
    <body>
        <h1>Manejo de errores</h1>
        <p>Ocurrio un error</p>
        <p><%= exception.getMessage() %></p>
        <br/>
        <a href="#" onclick="cambio('mensaje1')">
            Ver detalles
        </a>
        <div id="mensaje1" style="position: relative; visibility: hidden">
            <pre>
                <% exception.printStackTrace(new PrintWriter(out)); %>
            </pre>
        </div>
    </body>
</html>
