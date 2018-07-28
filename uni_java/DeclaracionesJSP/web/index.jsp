<%-- 
    Document   : index
    Created on : 26/07/2018, 11:02:29 AM
    Author     : Abel
--%>

<%-- Agregamos una declaracion --%>
<%!
    //Declaramos una variable con su metodo get
    private String usuario = "Abel";
    public String getUsuario(){
        return this.usuario;
    }
    private int contadorVisitas = 1;
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de declaraciones</title>
    </head>
    <body>
        <h1>Uso de declaraciones</h1>
        <p>Usuario por medio del atributo : <%= this.usuario %></p>
        <p>Usuario por medio del metodo : <%= this.getUsuario() %></p>
        <p>Contador de visitas desde que se reinicio el contador : <%= this.contadorVisitas++ %></p>
    </body>
</html>
