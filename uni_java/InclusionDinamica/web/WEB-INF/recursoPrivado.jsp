<%-- 
    Document   : recursoPrivado
    Created on : 27/07/2018, 08:43:29 AM
    Author     : Abel
--%>

<%
    String fondoColor = request.getParameter("colorFondo");
    if(fondoColor == null || fondoColor.trim().equals(""))
        fondoColor = "white"; //Valor por default
%>

<body bgColor="<%= fondoColor%>">
    Despliegue del contenido desde un jsp privado en WEB-INF
</body>