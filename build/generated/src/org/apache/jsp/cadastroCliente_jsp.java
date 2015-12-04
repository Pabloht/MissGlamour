package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastroCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Cadastro Cliente</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://cidades-estados-js.googlecode.com/files/cidades-estados-v0.2.js\"></script>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link href=\"CSS/cadastroCliente.css\" rel=\"stylesheet\" type=\"text/css\" /> \n");
      out.write("         <link href=\"CSS/3-col-portfolio.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("window.onload = function() {\n");
      out.write("new dgCidadesEstados(document.getElementById('estado'), document.getElementById('cidade'), true);\n");
      out.write("}\n");
      out.write("</script> \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    <!-- Navigation -->\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">Miss Glamour</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"index.html\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Contato</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Informações</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"adm.html\">Adm</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"container\">\n");
      out.write("         <!-- Page Header -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <h1 class=\"page-header\">Cadastro de Cliente\n");
      out.write("                    <small></small>\n");
      out.write("                </h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <!-- Formulario -->\n");
      out.write("    <form action=\"ClienteServ\" method=\"post\" onsubmit=\"return validar(this);\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"exampleInputEmail1\">Nome</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"camponome\" name= \"nome\" placeholder=\"Nome\">   \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"radiobox\" name=\"pessoa\">\n");
      out.write("            \n");
      out.write("            <label>\n");
      out.write("                <input name=\"pessoa\" type=\"radio\" id=\"radiofisica\" value=\"Pessoa Física\" > Pessoa Física\n");
      out.write("            </label>\n");
      out.write("            <label>\n");
      out.write("            <input type=\"radio\" name=\"pessoa\" id=\"radiojuridica\" value=\"Pessoa Jurídica\" > Pessoa Jurídica\n");
      out.write("            </label>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\" id=\"divcpf\">\n");
      out.write("            <label for=\"exampleInputPassword1\">CPF/CNPJ</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"campocpf\"  name= \"cpf\" placeholder=\"CPF/CNPJ\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\" id=\"divrg\" >\n");
      out.write("            <label for=\"exampleInputPassword1\">RG/Ie</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"camporg\" name= \"rg\" placeholder=\"RG/Ie\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"radiobox\" name=\"sexo\">\n");
      out.write("            \n");
      out.write("            <label>\n");
      out.write("                <input name=\"sexo\" type=\"radio\" value=\"masculino\"> Masculino\n");
      out.write("            </label>\n");
      out.write("            <label>\n");
      out.write("            <input type=\"radio\" name=\"sexo\" value=\"feminino\"> Feminino\n");
      out.write("            </label>\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"styled-select\" id=\"divestado\" name=\"estado\">\n");
      out.write("            <label for=\"exampleInputPassword1\">Estado</label>\n");
      out.write("        <select id=\"estado\" name=\"estado\">                            \n");
      out.write("           \n");
      out.write("                         \n");
      out.write("        </select>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("         <div class=\"styled-select\" id=\"divcidade\" name=\"cidade\">\n");
      out.write("            <label for=\"exampleInputPassword1\">Cidade</label>\n");
      out.write("        <select id=\"cidade\" name=\"cidade\">\n");
      out.write("             \n");
      out.write("        </select>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <div class=\"form-group\" id=\"divendereco\">\n");
      out.write("            <label for=\"exampleInputPassword1\">Endereço</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"campoendereco\" name= \"endereco\" placeholder=\"R. Nome da sua rua\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"form-group\" id =\"divcep\">\n");
      out.write("            <label for=\"exampleInputPassword1\">CEP</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"campocep\" name= \"cep\" placeholder=\"CEP\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"form-group\" id=\"divnumero\">\n");
      out.write("            <label for=\"exampleInputPassword1\">Numero</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"camponumero\" name= \"numero\" placeholder=\"Nº\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\" id=\"divcomplemento\">\n");
      out.write("            <label for=\"exampleInputPassword1\">Complemento</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"campocomplemento\" name= \"complemento\" placeholder=\"Complemento\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\" id=\"divbairro\">\n");
      out.write("            <label for=\"exampleInputPassword1\">Bairro</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"campobairro\" name= \"bairro\" placeholder=\"Bairro\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\" id=\"divtelefone\">\n");
      out.write("            <label for=\"exampleInputPassword1\">Telefone</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"campotelefone\" name= \"telefone\" placeholder=\"Telefone\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\" id=\"divcelular\">\n");
      out.write("            <label for=\"exampleInputPassword1\">Celular</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"campocelular\" name= \"celular\" placeholder=\"Celular\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\" id=\"divtelefonerecado\">\n");
      out.write("            <label for=\"exampleInputPassword1\">Telefone para Recado(Opcional)</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"campotelefonerecado\" name= \"telefoneRecado\" placeholder=\"Telefone\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\" id=\"divemail\">\n");
      out.write("            <label for=\"exampleInputPassword1\">Email</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"campoemail\" name= \"email\" placeholder=\"Email\">\n");
      out.write("        </div>  \n");
      out.write("        <div class=\"form-group\" id=\"divlogin\">\n");
      out.write("            <label for=\"exampleInputPassword1\">Login</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"campologin\" name= \"login\" placeholder=\"Login\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\" id=\"divsenha\">\n");
      out.write("            <label for=\"exampleInputPassword1\">Senha</label>\n");
      out.write("            <input type=\"password\" class=\"form-control\" id=\"camposenha\" name= \"senha\" placeholder=\"Senha\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <button type=\"submit\" name=\"action\" value=\"cadastrar\" class=\"btn btn-default\">Enviar</button>\n");
      out.write("    </form>\n");
      out.write("        \n");
      out.write("    <!-- /.form -->\n");
      out.write("    \n");
      out.write("    <hr>\n");
      out.write("    <footer>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <p>Copyright &copy; Miss Glamour 2015</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("        </footer>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
