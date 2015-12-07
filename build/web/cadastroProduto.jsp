<%-- 
    Document   : cadastroProduto
    Created on : 06/12/2015, 22:32:50
    Author     : Igor
--%>

<%@page import="DAO.PromocaoDao"%>
<%@page import="Model.Promocao"%>
<%@page import="Model.Marca"%>
<%@page import="DAO.MarcaDao"%>
<%@page import="DAO.TamanhoDao"%>
<%@page import="Model.Tamanho"%>
<%@page import="Model.Cor"%>
<%@page import="DAO.CorDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Produto</title>
        <script type="text/javascript" src="http://cidades-estados-js.googlecode.com/files/cidades-estados-v0.2.js"></script>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link href="CSS/cadastroCliente.css" rel="stylesheet" type="text/css" /> 
         <link href="CSS/3-col-portfolio.css" rel="stylesheet" type="text/css">
         <link rel="stylesheet" href="CSS/style.css" type="text/css" media="all" />
        <!--<link rel="stylesheet" href="css/ie6.css" type="text/css" media="all" />-->
        <script src="js/jquery-1.4.1.min.js" type="text/javascript"></script>
        <script src="js/jquery.jcarousel.pack.js" type="text/javascript"></script>
        <script src="js/jquery-func.js" type="text/javascript"></script>
    </head>
    
     <body>
        
   <!-- Shell -->
    <div class="shell">
   
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
        <li><a href="home.html">Home</a></li>
        <li><a href="contatoForm.html" >Fale conosco</a></li>
        <li><a href="informacoes.html" >Informações</a></li>
        <li><a href="cadastroCliente.jsp" class="active">Criar uma Conta</a></li>
        <li><a href="login.html"  >Logar</a></li>
      </ul>
    </div>
    <!-- End Navigation -->
  </div>
  <!-- End Header -->
  <div id="main">
         <!-- Page Header -->
         <div id="content">
        <div class="row">
            <div class="col-lg-12">
                <h25 class="page-header">Cadastro de Produto
                    <small></small>
                </h25>
            </div>
        </div>
        <!-- /.row -->
        
        
    <!-- Formulario -->
    <br>
    <br>
    <div id="dadoscadastrar">
        <fieldset id="fieldsetcadastro">
                            <legend></legend>
                            <br>
    <form action="ProdutoServ" method="post" onsubmit="return validar(this);">
        
        <div class="form-group" >
            <label for="exampleInputEmail1" id="letra">Descrição do Produto</label>
            <input type="text" class="form-control" id="camponome" name= "descricao" placeholder="Nome do Produto">   
        </div>
        
        <div class="form-group" >
            <label for="exampleInputEmail1" id="letra">Quantidade do Produto</label>
            <input type="text" class="form-control" id="camponome" name= "quantidade" placeholder="Quantidade do Produto">   
        </div>
        
        <div class="form-group" >
            <label for="exampleInputEmail1" id="letra">Valor do Produto</label>
            <input type="text" class="form-control" id="camponome" name= "valorProduto" placeholder="R$">   
        </div>
        
        <div class="form-group" id ="divcep">
            <label for="exampleInputPassword1">Peso Físico</label>
            <input type="text" class="form-control" id="campocep" name= "pesoFisico" placeholder="Peso Físico">
        </div>
        
        <div class="form-group" id ="divcep">
            <label for="exampleInputPassword1">Peso Cúbico</label>
            <input type="text" class="form-control" id="campocep" name= "pesoCubico" placeholder="Peso Cúbico">
        </div>
        
        

        <% 
            CorDao corDao = new CorDao();
                java.util.List<Cor> corLista = corDao.getCor();
        %>
        <div class="styled-select" id="divestado" name="cor">
            <label for="exampleInputPassword1">Cor</label>
            
        <select id="cor" name="cor">    
            <option>
                Selecione uma cor
            </option>
            
            <% for (int i = 0; i < corLista.size(); i++) {
                            Cor cor = corLista.get(i);        
            %>
            
            <option>
                <%=cor.getDescricaoCor() %>
            </option>
            
            <% } %>
                
        </select>
        </div>

            
         <% 
            TamanhoDao tamanhoDao = new TamanhoDao();
                java.util.List<Tamanho> tamanhoLista = tamanhoDao.getTamanho();
        %>
         <div class="styled-select" id="divtamanho" name="tamanho">
            <label for="exampleInputPassword1">Tamanho</label>
            
        <select id="tamanho" name="tamanho">
            <option>
                Selecione um tamanho
            </option>
            
            <% for (int i = 0; i < tamanhoLista.size(); i++) {
                            Tamanho tamanho = tamanhoLista.get(i);        
            %>
            
            <option>
                <%=tamanho.getDescricaoTamanho() %>
            </option>
            
            <% } %>        
        </select>
         </div>
        <br>
        
        <% 
            PromocaoDao promocaoDao = new PromocaoDao();
                java.util.List<Promocao> promocaoLista = promocaoDao.getPromocao();
        %>
         <div class="styled-select" id="divestado" name="promocao">
            <label for="exampleInputPassword1">Promoção</label>
            
        <select id="promocao" name="promocao">
            <option>
                Seleciona uma promoção
            </option>
            <option>
                Nenhuma
            </option>
            
            <% for (int i = 0; i < promocaoLista.size(); i++) {
                            Promocao promocao = promocaoLista.get(i);        
            %>
            
            <option>
                <%=promocao.getDescricaoPromocao()%>
            </option>
            
            <% } %>        
        </select>      
        </div>
        
                 <% 
            MarcaDao marcaDao = new MarcaDao();
                java.util.List<Marca> marcaLista = marcaDao.getMarca();
        %>
         <div class="styled-select" id="divcidade" name="marca">
            <label for="exampleInputPassword1">Marca</label>
            
        <select id="marca" name="marca">
            <option>
                Selecione uma marca
            </option>
            
            <% for (int i = 0; i < marcaLista.size(); i++) {
                            Marca marca = marcaLista.get(i);        
            %>
            
            <option>
                <%=marca.getDescricaoMarca()%>
            </option>
            
            <% } %>        
        </select>
         </div>
        <br>
        <br>
        <br>
        
        <div class="form-group">
            <label for="exampleInputEmail1" id="letra">Upload Imagem</label>
            <input type="file" id="letra">
            <p class="help-block" id="letra">Seleciona uma imagem para o produto</p>
        </div>
        <br>

        <button type="submit" name="action" value="cadastrarProduto" id="botaocadastrar" class="btn btn-default">Cadastrar</button>
        </form>
                            <br>
                            </fieldset>
        </div>
    <br>
    <!-- /.form -->
    </div>
    <div id="sidebar">
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
    </div>
   
    </div>
    </body>
</html>
