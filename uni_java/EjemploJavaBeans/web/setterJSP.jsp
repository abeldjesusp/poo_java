<%-- 
    Document   : setterJSP
    Created on : 27/07/2018, 09:31:46 AM
    Author     : Abel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que modifica a un JavaBean</title>
    </head>
    <body>
        <h1>JSP que modifica a un JavaBean</h1>
        <!-- Declaramos el javaBean a utilizar -->
        <!-- El alcance de la variable es de tipo session -->
        <jsp:useBean id="rectangulo"
                     class="beans.Rectangulo" scope="session"/>
        
        Modificamos los atributos:
        <br/>
        <br/>
        <%
            //valores en codigo duro
            int baseValor = 5;
            int alturaValor = 10;
        %>
        
        <jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>" />
        Nuevo valor base: <%=baseValor%>
        <br>
        <jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>" />
        Nuevo valor altura: <%=alturaValor%>
        <br><br>
        <a href="index.jsp">Regresar</a>
    </body>
</html>
