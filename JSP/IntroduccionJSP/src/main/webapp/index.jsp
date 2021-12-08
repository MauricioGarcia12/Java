<%-- 
    Document   : index
    Created on : 5 dic. 2021, 3:10:46 p. m.
    Author     : Mauricio
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Introduccion JSPs</h1>
        <<ul>
            <li> <% out.print("Hola mundo con scriplets");%> </li>
            <li>${"Impresion expresion Language"}</li>
            <li><%= "Hola desde expresiones"  %></li>
            <<li><c:out value="hola desde jstl "/></li>
        </ul>

    </body>
</html>
