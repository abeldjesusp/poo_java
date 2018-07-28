<%-- 
    Document   : reporteExcel
    Created on : 26/07/2018, 12:23:50 PM
    Author     : Abel
--%>

<%@page import="utilerias.Conversiones, java.util.Date"%>

<%@page contentType="application/vnd.ms-excel"%>
<%
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition","inline; filename=" + nombreArchivo);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte Excel</title>
    </head>
    <body>
        <h1>Reporte de Excel!</h1>
        <br/>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <td>1. Fundamentos de Java</td>
                <td>Aprenderemos la sintaxis basica de java</td>
                <td><%= Conversiones.format(new Date())%></td>
            </tr>
            <tr>
                <td>2. Programacion con Java</td>
                <td>
                    Pondremos en practica conceptos de 
                    la programacion Orientada a Objetos
                </td>
                <td><%= Conversiones.format(new Date())%></td>
            </tr>
        </table>
    </body>
</html>
