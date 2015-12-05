<%-- 
    Document   : checarLogin
    Created on : 03/12/2015, 21:39:19
    Author     : PabloHenrique
--%>

<%@page import="DAO.ClienteDao"%>
<%@page import="Model.Cliente"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%    
            ClienteDao clienteDao = new ClienteDao();
            Cliente cliente = new Cliente();
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            cliente = clienteDao.LoginCliente(login, senha, request);
            String comLogin = cliente.getLogin();
            if (login.equals(comLogin)) {
                session.invalidate();
                session = request.getSession(true);
                session.setAttribute("idClienteAutenticado", cliente.getIdCliente());
                session.setAttribute("nomeClienteAutenticado", cliente.getNomeCliente());
                session.setAttribute("cpfCnpjAutenticado", cliente.getCpfCnpj());
                session.setAttribute("rgIeAutenticado", cliente.getRgIe());
                session.setAttribute("ruaAutenticado", cliente.getRua());
                session.setAttribute("cepAutenticado", cliente.getCep());
                session.setAttribute("numeroAutenticado", cliente.getNumero());
                session.setAttribute("complementoAutenticado", cliente.getComplemento());
                session.setAttribute("tipoPessoaAutenticado", cliente.getTipoPessoa());
                session.setAttribute("condicaoAutenticado", cliente.getCondicao());
                session.setAttribute("telefoneResidencialAutenticado", cliente.getTelefoneResidencial());
                session.setAttribute("celularAutenticado", cliente.getCelular());
                session.setAttribute("telefoneRecadoAutenticado", cliente.getTelefoneRecado());
                session.setAttribute("loginAutenticado", cliente.getLogin());
                session.setAttribute("senhaAutenticado", cliente.getSenha());
                session.setAttribute("emailAutenticado", cliente.getEmail());
                session.setAttribute("promocaoAutenticado", cliente.getPromocao());
                session.setAttribute("sexoAutenticado", cliente.getSexo());
                session.setAttribute("bairroAutenticado", cliente.getBairro());
                session.setAttribute("cidadeAutenticado", cliente.getCidade());
                session.setAttribute("estadoAutenticado", cliente.getEstado().getIdEstado());
                response.sendRedirect("home.jsp");
                
            } else {
                out.println("Login ou senha invalidos");
                
            }
            %>
    </body>
</html>
