<%-- 
    Document   : index
    Created on : 27/07/2018, 05:07:47 PM
    Author     : Abel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expression Language</title>
    </head>
    <body>
        <h1>Expression Language</h1>
        <br/>
        <a href="variableImplicitas.jsp?usuario=Abel">Objetos implicitos con El</a>
        <br/><br/>
        <!--Entramos al jsp que accede al Javabean -->
        Formulario HTML:
        <br/>
        <form name="form1" action="accesoJavaBeans.jsp">
            Base:<input type="text" name="base" />
            <br/>
            Altura:<input type="text" name="altura" />
            <input type="submit" value="Enviar" />
        </form>
    </body>
</html>
