<%-- 
    Document   : deuCerto
    Created on : 04/12/2015, 02:56:45
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
            session = request.getSession();
            String nomeCliente = (String) session.getAttribute("nomeClienteAutenticado");
            %>
            
            <%  out.print(nomeCliente);    %> Logado com Sucesso!
    </body>
</html>
