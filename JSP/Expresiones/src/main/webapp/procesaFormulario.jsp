<%-- 
    Document   : procesaFormulario
    Created on : 6 dic. 2021, 5:47:12 p. m.
    Author     : Mauricio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      
        <title>JSP Procesa formulario</title>
    </head>
    <body>
        <h1>Resultados</h1>
        Usr: <%= request.getParameter("usuario") %>
        Pas: <%= request.getParameter("password") %><br/><!-- comment -->
         
    </body>
</html>
