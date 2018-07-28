<%-- 
    Document   : scriptlet
    Created on : 26/07/2018, 09:36:26 AM
    Author     : Abel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <% out.println("Saludos desde Scriptlets"); %>
        <br>
        <!-- Scriptlets para manipular los objetos implicitos -->
        <% 
            String nombreAplicacion = request.getContextPath();
            out.println("Nombre de app " + nombreAplicacion);
         %>
         <br>
         <!-- Scriptlets con codigo condicionado -->
         <%
             if(session != null && session.isNew()){
         %>
         la sesion SI es nueva
         <%
             } else if(session != null){
         %>
         ls sesion NO es nueva
         <%
             }
         %>
    </body>
</html>
