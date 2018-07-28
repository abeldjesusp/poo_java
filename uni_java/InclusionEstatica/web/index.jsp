<%-- 
    Document   : index
    Created on : 26/07/2018, 08:32:29 PM
    Author     : Abel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inclusion Estatica</title>
        <link href="recursos/estilos.css" type="text/css" rel="stylesheet"/>
        <script src="recursos/funciones.js"></script>
    </head>
    <body>
        <h1>Inclusion de archivos estaticos</h1>
        <!-- Esto es por cada menu -->
        <br/>
        <!-- Menu principal -->
        <span class="noticias" align="left">
            <a href="javascript:desplegar('noticias');">
                <img border="0" src="http://icursos.net/cursos/ServletsJSPs/Leccion14/noticias.gif"/>
            </a>
        </span>
        <span id="noticias" class="ocultar_menu">
            <!-- Submenu -->
            <ul>
                <li><%@include file="pages/noticia1.html" %></li>
                <li><%@include file="pages/noticia2.html" %></li>
            </ul>
        </span>
         <!-- Esto es por cada menu -->
        <br/>
        <!-- Menu principal -->
        <span class="videos" align="left">
            <a href="javascript:desplegar('videos');">
                <img border="0" src="http://icursos.net/cursos/ServletsJSPs/Leccion14/videos.gif"/>
            </a>
        </span>
        <span id="videos" class="ocultar_menu">
            <!-- Submenu -->
            <ul>
                <li><%@include file="pages/video1.html" %></li>
            </ul>
        </span>
    </body>
</html>
