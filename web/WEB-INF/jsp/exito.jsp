<%-- 
    Document   : Exito
    Created on : 21/03/2018, 04:56:00 PM
    Author     : es_es
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Exito!</h1>
        
        <p>Id: ${requestScope.auto.id}</p>
        <p>Marca: ${requestScope.auto.marca}</p>
        <p>Color: ${requestScope.auto.color}</p>
        
    </body>
</html>
