<%-- 
    Document   : expresiones
    Created on : 6 dic. 2021, 5:46:45 p. m.
    Author     : Mauricio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        <title>JSP Expresiones</title>
    </head>
    <body>
        Concatenacion: <%= "" + "JSP" %>
        <br/><!-- comment -->
        <%= 2*3/2 %>
        Session id: <%= session.getId()  %>
        <br/>
        <a href="index.html">Inicio</a>
        
    </body>
</html>
