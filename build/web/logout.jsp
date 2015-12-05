<%-- 
    Document   : logout
    Created on : 05/12/2015, 13:58:55
    Author     : PabloHenrique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%   
        session.invalidate();
         response.sendRedirect("home.html");        
       
        %>
    </body>
</html>
