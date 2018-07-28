<%-- 
    Document   : accesoJavaBeans
    Created on : 27/07/2018, 05:08:07 PM
    Author     : Abel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acceso JavaBeans</title>
        
    </head>
    <body>
        <h1>Acceso JavaBeans</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" />
        <!-- Asignamos los valores del formulario al JavaBean -->
        <jsp:setProperty name="rectangulo" property="*" />
        <br>
        Valor base: ${rectangulo.base}
        <br/>
        Valor altura: ${rectangulo.altura}
        <br/>
        Valor area: ${rectangulo.area}
        <br/>
        Calculo del area: ${rectangulo.base*rectangulo.altura}
        <br/>
        <br/>
        <a href="index.jsp">Regresar</a>
    </body>
</html>
