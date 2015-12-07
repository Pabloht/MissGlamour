<%-- 
    Document   : perfilCliente
    Created on : 05/12/2015, 01:03:41
    Author     : PabloHenrique
--%>

<%@page import="DAO.EstadoDao"%>
<%@page import="DAO.CidadeDao"%>
<%@page import="Model.Estado"%>
<%@page import="Model.Cidade"%>
<%@page import="Model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Sua conta </title>
         <link rel="stylesheet" href="CSS/perfilCliente.css" type="text/css" media="all" />
        <link rel="stylesheet" href="CSS/perfil.css" type="text/css" media="all" />
<!--<link rel="stylesheet" href="css/ie6.css" type="text/css" media="all" />-->
<script src="js/jquery-1.4.1.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/jquery.bpopup.min.js"></script>
<script src="js/jquery.jcarousel.pack.js" type="text/javascript"></script>
<script src="js/jquery-func.js" type="text/javascript"></script>
<script type="text/javascript">
(function($) {
                $(function() {


                    $('.logar').bind('click', function(e) {


                        $('#boxes').bPopup();

                    });

                });

            })(jQuery);

</script>

<script type="text/javascript">
(function($) {
                $(function() {


                    $('.logarendereco').bind('click', function(e) {


                        $('#boxesendereco').bPopup();

                    });

                });

            })(jQuery);

</script>
    </head>
    
     <script type="text/javascript">

        (function($) {
            $(function() {

        <%

            Cliente cl = (Cliente) session.getAttribute("cliente");

            if (cl != null) {
                out.print(" $('#edit').bPopup();");
            }

        %>

            });

        })(jQuery);

    </script>
    <body>
        <%    
         session = request.getSession();
         Cliente cliente = new Cliente();
         Cidade cidade = new Cidade();
         Estado estado = new Estado();
           cliente.setNomeCliente((String) session.getAttribute("nomeClienteAutenticado"));
            cliente.setCpfCnpj((String) session.getAttribute("cpfCnpjAutenticado"));
            cliente.setRgIe((String) session.getAttribute("rgIeAutenticado"));
            cliente.setRua((String) session.getAttribute("ruaAutenticado"));
            cliente.setCep((String) session.getAttribute("cepAutenticado"));
            cliente.setNumero((Integer) session.getAttribute("numeroAutenticado"));
            cliente.setComplemento((String) session.getAttribute("complementoAutenticado"));
            cliente.setTipoPessoa((Integer) session.getAttribute("tipoPessoaAutenticado"));
            cliente.setCondicao((Boolean) session.getAttribute("condicaoAutenticado"));
            cliente.setTelefoneResidencial((String) session.getAttribute("telefoneResidencialAutenticado"));
            cliente.setCelular((String) session.getAttribute("celularAutenticado"));
            cliente.setTelefoneRecado((String) session.getAttribute("telefoneRecadoAutenticado"));    
            cliente.setLogin((String) session.getAttribute("loginAutenticado"));
            cliente.setSenha((String) session.getAttribute("senhaAutenticado"));
            cliente.setEmail((String) session.getAttribute("emailAutenticado"));
            cliente.setPromocao((Boolean) session.getAttribute("promocaoAutenticado"));
            cliente.setSexo((Integer) session.getAttribute("sexoAutenticado"));
            cliente.setBairro((String) session.getAttribute("bairroAutenticado"));
            String sexo;
            if(cliente.getSexo() == 0) {
                sexo = "Masculino";
            }    else {
                sexo = "Feminino";
            }
            int idCidade = (Integer) session.getAttribute("cidadeAutenticado");
            cidade = new CidadeDao().getCidadePorId(idCidade);
        estado = new EstadoDao().getEstado(cidade.getEstado().getUfEstado());
        cliente.setEstado(estado);
        cliente.setCidade(cidade);
        %>
        
         <div class="shell">
  <!-- Header -->
  <div id="header">
    <h1 id="logo"><a href="#">Miss Glamour</a></h1>
    
    <!-- Cart -->
    <div id="cart"> <a href="#" class="cart-link">Seu carrinho</a>
        
      <div class="cl">&nbsp;</div>
      <span> Peças: <strong>0</strong></span> &nbsp;&nbsp; <span>Total: <strong>R$0.00</strong></span> 
    </div>
    <!-- End Cart -->
    
    <!-- Navigation -->
    <div id="navigation">
      <ul>
        <li><a href="home.jsp" >Home</a></li>
        <li><a href="contatoForm.html" >Fale conosco</a></li>
        <li><a href="informacoes.html" >Informações</a></li>
        <li><a href="#" class="active"  ><% out.print(cliente.getNomeCliente());   %></a></li>
        <li><a href="logout.jsp" >Sair</a></li>
      </ul>
    </div>
    <!-- End Navigation -->
  </div>
  <!-- End Header -->
 <div id="main">            
         <!-- Page Header -->
        <div class="row">
            <div class="col-lg-12">
                <h25 class="page-header" id="titulologin"><% out.print(cliente.getNomeCliente());   %>
                    <small></small>
                </h25>
            </div>
                    <br>
        
                    <div id="content">
                        <!-- Dados Pessoais-->
                        <div id="dados">
                        <fieldset id="fieldsetperfil">
                            <legend><h4>Dados Pessoais:</h4></legend>
                            <br>
           <div class="form-group" id="divcamposesquerda">
            <label for="exampleInputPassword1" id="telaPerfil">CPF/CNPJ</label>
            <input type="text" class="form-control" id="campoesquerda"  name= "cpf" value="<% out.print(cliente.getCpfCnpj()); %>" readonly>
        </div>
        <div class="form-group" id="divcamposdireita" >
            <label for="exampleInputPassword1">RG/Ie</label>
            <input type="text" class="form-control" id="campodireita" name= "rg" value="<% out.print(cliente.getRgIe()); %>" readonly>
        </div>
        <div class="form-group" id="divcamposesquerda">
            <label for="exampleInputPassword1">Sexo</label>
            <input type="text" class="form-control" id="campoesquerda" name= "sexo" value="<% out.print(sexo);   %>" readonly>
        </div>
        <div class="form-group" id="divcamposdireita">
            <label for="exampleInputPassword1">Telefone</label>
            <input type="text" class="form-control" id="campodireita" name= "telefoneResidencial" value="<% out.print(cliente.getTelefoneResidencial());   %>" readonly>
        </div>
        <div class="form-group" id="divcamposesquerda">
            <label for="exampleInputPassword1">Celular</label>
            <input type="text" class="form-control" id="campoesquerda" name= "celular" value="<% out.print(cliente.getCelular());   %>" readonly>
        </div>
        <div class="form-group" id="divcamposdireita">
            <label for="exampleInputPassword1">Telefone Recado</label>
            <input type="text" class="form-control" id="campodireita" name= "telefoneRecado" value="<% out.print(cliente.getTelefoneRecado());   %>" readonly>
        </div>
        <div class="form-group" id="divemailesquerda">
            <label for="exampleInputPassword1" id="textoemail">Email</label>
            <input type="text" class="form-control" id="campoemailcliente" name= "email" value="<% out.print(cliente.getEmail());   %>" readonly>
        </div>
        
        <div class="form-group" id="divcamposesquerda">
            <label for="exampleInputPassword1">Login</label>
            <input type="text" class="form-control" id="campoesquerda" name= "login" value="<% out.print(cliente.getLogin());   %>" readonly>
        </div>
        <div class="form-group" id="divcamposdireita">
            <label for="exampleInputPassword1">Senha</label>
            <input type="password" class="form-control" id="campodireita" name= "senha" value="<% out.print(cliente.getSenha());   %>" readonly>
        </div>
            <button type="submit" class="logar btn btn-default" name="modal" name="action" value="cadastrar" id="botaoalterar">Alterar</button>
            <br>
            <br>
                        </fieldset>
        </div>
        <br>
                        <!-- Endereço -->
        <div id="dados">
                        <fieldset id="fieldsetperfil">
                            <legend><h4>ENDEREÇO:</h4></legend>
                            <br>
           <div class="form-group" id="divcamposesquerda">
            <label for="exampleInputPassword1" id="telaPerfil">Estado</label>
            <input type="text" class="form-control" id="campoesquerda"  name= "estado" value="<% out.print(cliente.getEstado().getNomeEstado()); %>" readonly>
        </div>
        <div class="form-group" id="divcamposdireita" >
            <label for="exampleInputPassword1">Cidade</label>
            <input type="text" class="form-control" id="campodireita" name= "cidade" value="<% out.print(cliente.getCidade().getNomeCidade()); %>" readonly>
        </div>
        <div class="form-group" id="divcamposesquerda">
            <label for="exampleInputPassword1">Bairro</label>
            <input type="text" class="form-control" id="campoesquerda" name= "bairro" value="<% out.print(cliente.getBairro());   %>" readonly>
        </div>
        <div class="form-group" id="divcamposdireita">
            <label for="exampleInputPassword1">Complemento</label>
            <input type="text" class="form-control" id="campodireita" name= "complemento" value="<% out.print(cliente.getComplemento());   %>" readonly>
        </div>
        <div class="form-group" id="divcamposesquerda">
            <label for="exampleInputPassword1">Número</label>
            <input type="text" class="form-control" id="campoesquerda" name= "numero" value="<% out.print(cliente.getNumero());   %>" readonly>
        </div>
        <div class="form-group" id="divcamposdireita">
            <label for="exampleInputPassword1">CEP</label>
            <input type="text" class="form-control" id="campodireita" name= "cep" value="<% out.print(cliente.getCep());   %>" readonly>
        </div>
        <div class="form-group" id="divemailesquerda">
            <label for="exampleInputPassword1" id="textoemail">Endereço</label>
            <input type="text" class="form-control" id="campoenderecocliente" name= "rua" value="<% out.print(cliente.getRua());   %>" readonly>
        </div>
        
            <button type="submit" name="modal" id="botaoalterar" class="logarendereco btn btn-default">Alterar</button>
            <br>
            <br>
                        </fieldset>
        <br>
        <br>
        </div>
        </div>
        
                   <div id="sidebar2">
      <!-- Search -->
      <div class="box search">
        <h2>Procure por <span></span></h2>
        <div class="box-content">
          <form action="#" method="post">
            <label>Palavra-chave</label>
            <input type="text" class="field" />
            <label>Categoria</label>
            <select class="field">
              <option value="">-- Selecione a Categoria --</option>
            </select>
            <div class="inline-field">
              <label>Preço</label>
              <select class="field small-field">
                <option value="">$100</option>
              </select>
              <label>to:</label>
              <select class="field small-field">
                <option value="">$200</option>
              </select>
            </div>
            <input type="submit" class="search-submit" value="Procurar" />
            <p> <a href="contatoForm.html" class="bul">Entre em Contato/Suporte</a> </p>
          </form>
        </div>
      </div>
      <!-- End Search -->
      <!-- Categories -->
      <div class="box categories">
        <h2>Categorias <span></span></h2>
        <div class="box-content">
          <ul>
            <li><a href="painelCalças.html"> Calças </a></li>
            <li><a href="painelSaias.html"> Saias </a></li>
            <li><a href="#"> Casacos </a></li>
            <li><a href="#"> Blusas </a></li>
            <li><a href="#"> Jaquetas </a></li>
            <li><a href="#"> @Lança Perfume </a></li>
            <li><a href="#"> </a></li>
            <li><a href="#"> </a></li>
            <li><a href="#"> </a></li>
            <li><a href="#"> </a></li>
            <li><a href="#"> </a></li>
            <li class="last"><a href="#"> </a></li>
          </ul>
        </div>
      </div>
      <!-- End Categories -->
    </div>
    <!-- End Sidebar -->
    <div class="cl">&nbsp;</div>
  </div>     
         <div class="side-full">
    <!-- More Products -->
    <div class="more-products">
      <div class="more-products-holder">
        <ul>
          <li><a href="#"><img src="CSS/imagens/mini.jpg" alt="" /></a></li>
          <li><a href="#"><img src="CSS/imagens/mini1.jpg" alt="" /></a></li>
          <li><a href="#"><img src="CSS/imagens/mini2.jpg" alt="" /></a></li>
          <li><a href="#"><img src="CSS/imagens/mini3.jpg" alt="" /></a></li>
          <li><a href="#"><img src="CSS/imagens/mini9.jpg" alt="" /></a></li>
          <li><a href="#"><img src="CSS/imagens/mini10.jpg" alt="" /></a></li>
          <li><a href="#"><img src="CSS/imagens/mini4.jpg" alt="" /></a></li>
          <li><a href="#"><img src="CSS/imagens/mini5.jpg" alt="" /></a></li>
          <li><a href="#"><img src="CSS/imagens/mini6.jpg" alt="" /></a></li>
          <li><a href="#"><img src="CSS/imagens/mini7.jpg" alt="" /></a></li>
          <li class="last"><a href="#"><img src="CSS/imagens/mini8.jpg" alt="" /></a></li>
          
        </ul>
      </div>
      <div class="more-nav"> <a href="CSS/imagens/prev.gif" class="prev">previous</a> <a href="CSS/imagens/next.gif" class="next">next</a> </div>
    </div>
    <!-- End More Products -->
    <!-- Text Cols -->
    
    
    <div class="cols">
      <div class="cl">&nbsp;</div>
      
      
      <!-- Espaço para acesso ao Instagram -->
      <div class="col">
        <h3 class="ico ico1">Confira nosso Instagram</h3>
        <p>Acesse nosso Instagram para nos seguir e compartilhar com seus amigos!!</p>
        
        <br>
        <br>
        <br>
            
        <style>.ig-b- { display: inline-block; }
        .ig-b- img { visibility: hidden; }
        .ig-b-:hover { background-position: 0 -60px; } .ig-b-:active { background-position: 0 -120px; }
        .ig-b-v-24 { width: 137px; height: 24px; background: url(//badges.instagram.com/static/images/ig-badge-view-sprite-24.png) no-repeat 0 0; }
        @media only screen and (-webkit-min-device-pixel-ratio: 2), only screen and (min--moz-device-pixel-ratio: 2), only screen and (-o-min-device-pixel-ratio: 2 / 1), only screen and (min-device-pixel-ratio: 2), only screen and (min-resolution: 192dpi), only screen and (min-resolution: 2dppx) {
        .ig-b-v-24 { background-image: url(//badges.instagram.com/static/images/ig-badge-view-sprite-24@2x.png); background-size: 160px 178px; } }</style>
        <a href="http://instagram.com/missglamour_store?ref=badge" class="ig-b- ig-b-v-24"><img src="//badges.instagram.com/static/images/ig-badge-view-24.png" alt="Instagram" /></a>
        
      </div>
      
      <!-- Espaço para compartilhar Facebook-->
      <div class="col">
        <h3 class="ico ico2">Curta e Compartilhe no         Facebook</h3>
        <p>Nos ajude a divulgar a loja curtindo e compartilhando no Facebook para seus amigos!!</p>
        <br>
                    <!-- BOTÃO FACEBOOK -->
            <div id="fb-root"></div>
            <script>(function(d, s, id) {
              var js, fjs = d.getElementsByTagName(s)[0];
              if (d.getElementById(id)) return;
              js = d.createElement(s); js.id = id;
              js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.5";
              fjs.parentNode.insertBefore(js, fjs);
                }(document, 'script', 'facebook-jssdk'));
            </script>
            <div id="botaoFacebook" class="fb-like" data-href="https://www.facebook.com/missglamourstore02/" 
                 data-layout="button_count" data-action="like" data-show-faces="true" data-share="true">
            </div>
      </div>
      
      <!-- Espaço para seguir no twitter-->
      <div class="col">
        <h3 class="ico ico3">Siga-nos no Twitter</h3>
        <p>Siga-nos no Twitter para ficar por dentro de promoções e de roupas e acessórios novos!!</p>
        <br>
            <br>
        <!-- BOTÃO DE SEGUIR NO TWITTER -->
            <a href="https://twitter.com/missglamour01" id="shareTwitter" class="twitter-follow-button" data-show-count="false" data-size="large">Follow @missglamour01</a>
            <script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';
            if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';
                fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');</script>
      </div>
     
      <!-- Espaço para compartilhar twits-->
      <div class="col col-last">
        <h3 class="ico ico4">Twite Sua Opinião</h3>
        <p>Use este botão para twittar algo sobre sua experiência com a loja.</p>
        <br>
        <br>
        <br>
            
            <a href="https://twitter.com/share" class="twitter-share-button" data-url="https://www.facebook.com/missglamourstore02/?fref=ts" data-text="Twite algo!!" data-size="large" data-related="missglamour01" data-hashtags="passaNois">Tweet</a>
            
            <script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');</script>
        
      </div>
      
      <div class="cl">&nbsp;</div>
    </div>
    <!-- End Text Cols -->
  </div>
  <!-- Footer -->
        <div id="footer">
          <p class="left"> <a href="home.html">Home</a> <span>|</span> <a href="contatoForm">Fale conosco</a> <span>| <a href="informacoes.html">Informações</a> </p>
          <p class="right"> &copy; 2015 Miss Glamour. Design by <a href="http://fean.com.br">fean.com.br</a> </p>
        </div>
  <!-- End Footer -->
        </div>
         </div>
         <div id="boxes">     
            <span class="b-close"> X </span>
            <form name="" method="post" action="ClienteServ"><br>
               <div id="dadosbox">
                        <fieldset id="fieldsetperfil">
                            <legend><h4>Dados Pessoais:</h4></legend>
                            <br>
           <div class="form-group" id="campoesquerda">
            <label for="exampleInputPassword1" id="telaPerfil">Nome</label>
            <input type="text" class="form-control" id="camponome"  name= "nome" value="<% out.print(cliente.getNomeCliente()); %>" >
        </div>
           <div class="form-group" id="divcamposesquerda">
            <label for="exampleInputPassword1" id="telaPerfil">CPF/CNPJ</label>
            <input type="text" class="form-control" id="campoesquerda"  name= "cpf" value="<% out.print(cliente.getCpfCnpj()); %>" >
        </div>
        <div class="form-group" id="divcamposdireita" >
            <label for="exampleInputPassword1">RG/Ie</label>
            <input type="text" class="form-control" id="campodireita" name= "rg" value="<% out.print(cliente.getRgIe()); %>" >
        </div>
        <div class="form-group" id="divcamposesquerda">
            <label for="exampleInputPassword1">Sexo</label>
            <input type="text" class="form-control" id="campoesquerda" name= "sexo" value="<% out.print(sexo);   %>" >
        </div>
        <div class="form-group" id="divcamposdireita">
            <label for="exampleInputPassword1">Telefone</label>
            <input type="text" class="form-control" id="campodireita" name= "telefoneResidencial" value="<% out.print(cliente.getTelefoneResidencial());   %>" >
        </div>
        <div class="form-group" id="divcamposesquerda">
            <label for="exampleInputPassword1">Celular</label>
            <input type="text" class="form-control" id="campoesquerda" name= "celular" value="<% out.print(cliente.getCelular());   %>" >
        </div>
        <div class="form-group" id="divcamposdireita">
            <label for="exampleInputPassword1">Telefone Recado</label>
            <input type="text" class="form-control" id="campodireita" name= "telefoneRecado" value="<% out.print(cliente.getTelefoneRecado());   %>" >
        </div>
        <div class="form-group" id="divemailesquerda">
            <label for="exampleInputPassword1" id="textoemail">Email</label>
            <input type="text" class="form-control" id="campoemailcliente" name= "email" value="<% out.print(cliente.getEmail());   %>" >
        </div>
        
        <div class="form-group" id="divcamposesquerda">
            <label for="exampleInputPassword1">Senha</label>
            <input type="text" class="form-control" id="campoesquerda" name= "senha" >
        </div>
        <div class="form-group" id="divcamposdireita">
            <label for="exampleInputPassword1">Nova Senha</label>
            <input type="password" class="form-control" id="campodireita" name= "nnnao" placeholder="Senha..." >
        </div>
            <button type="submit" name="action" value="alterarDados" id="botaoalterar" class="btn btn-default">Alterar</button>
            <br>
            <br>
                        </fieldset>
        </div>
            </form>

        </div>
        
        <div id="boxesendereco">     
            <span class="b-close"> X </span>
            <form name="" method="post" action="check.jsp"><br>
              <div id="dadosbox">
                        <fieldset id="fieldsetperfil">
                            <legend><h4>ENDEREÇO:</h4></legend>
                            <br>
           <div class="form-group" id="divcamposesquerda">
            <label for="exampleInputPassword1" id="telaPerfil">Estado</label>
            <input type="text" class="form-control" id="campoesquerda"  name= "estado" value="<% out.print(cliente.getEstado().getNomeEstado()); %>" readonly>
        </div>
        <div class="form-group" id="divcamposdireita" >
            <label for="exampleInputPassword1">Cidade</label>
            <input type="text" class="form-control" id="campodireita" name= "cidade" value="<% out.print(cliente.getCidade().getNomeCidade()); %>" readonly>
        </div>
        <div class="form-group" id="divcamposesquerda">
            <label for="exampleInputPassword1">Bairro</label>
            <input type="text" class="form-control" id="campoesquerda" name= "bairro" value="<% out.print(cliente.getBairro());   %>" readonly>
        </div>
        <div class="form-group" id="divcamposdireita">
            <label for="exampleInputPassword1">Complemento</label>
            <input type="text" class="form-control" id="campodireita" name= "complemento" value="<% out.print(cliente.getComplemento());   %>" readonly>
        </div>
        <div class="form-group" id="divcamposesquerda">
            <label for="exampleInputPassword1">Número</label>
            <input type="text" class="form-control" id="campoesquerda" name= "numero" value="<% out.print(cliente.getNumero());   %>" readonly>
        </div>
        <div class="form-group" id="divcamposdireita">
            <label for="exampleInputPassword1">CEP</label>
            <input type="text" class="form-control" id="campodireita" name= "cep" value="<% out.print(cliente.getCep());   %>" readonly>
        </div>
        <div class="form-group" id="divemailesquerda">
            <label for="exampleInputPassword1" id="textoemail">Endereço</label>
            <input type="text" class="form-control" id="campoenderecocliente" name= "rua" value="<% out.print(cliente.getRua());   %>" readonly>
        </div>
        
            <button type="submit" name="modal" id="botaoalterar" class="logar btn btn-default">Alterar</button>
            <br>
            <br>
                        </fieldset>
        <br>
        <br>
        </div>
            </form>

        </div>

        
    </body>
</html>
