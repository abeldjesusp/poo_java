<%-- 
    Document   : index
    Created on : 25/07/2018, 07:19:54 PM
    Author     : Abel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola mundo</title>
    </head>
    <body>
        <h1>Ejercicio de Hola mundo! con JSP</h1>
        <!--Impresion de cadenas con diferentes tecnologias-->
        <ul>
            <li>Hola mundo con HTML
            <li><% out.print("Hola mundo con Scriptlets");%>
            <li>${"Hola mundo con Expression Language (EL)"}
            <li><c:out value="Hola mundo con JSTL"/>
        </ul>
        <!--Algunos valores del lado del servdor-->
        <ul>
            <li> Hola: <%= new java.util.Date()%>
            <li> Nombre del contexto de la aplciacion: 
                <%= request.getContextPath()%>
            <li>Valor de l parametro x: 
                <%= request.getParameter("X")%>
        </ul>
    </body>
</html>
