<%-- 
    Document   : cadastroPromocao
    Created on : 06/12/2015, 14:13:39
    Author     : PabloHenrique
--%>

<%@page import="Model.Funcionario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cadastro de Promoção</title>
         <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="CSS/cadastroPromocao.css" rel="stylesheet" type="text/css" /> 
         <link href="CSS/3-col-portfolio.css" rel="stylesheet" type="text/css">
         <link rel="stylesheet" href="CSS/style.css" type="text/css" media="all" />
<!--<link rel="stylesheet" href="css/ie6.css" type="text/css" media="all" />-->
<script>
            //Esse script formata cpf e telefone.
            function formatar(mascara, documento) {
                var i = documento.value.length;
                var saida = mascara.substring(0, 1);
                var texto = mascara.substring(i)

                if (texto.substring(0, 1) != saida) {
                    documento.value += texto.substring(0, 1);
                }

            }
        </script>
 
</script> 
         
         
         
    </head>
    <body>
        <% 
            
            session = request.getSession();
            Funcionario funcionario = new Funcionario();
            funcionario.setIdFuncionario((Integer) session.getAttribute("idFuncionarioAutenticado"));
            funcionario.setNomeFuncionario((String) session.getAttribute("nomeFuncionarioAutenticado"));
            
            
            
            
            
            %>
   <!-- Shell -->
    <div class="shell">
 
        
    <div id="header">
    <h1 id="logo"><a href="#">Miss Glamour</a></h1>
    
   
    
    <!-- Navigation -->
    <div id="navigation">
      <ul>
        <li><a href="admin.jsp" >Home</a></li>
        <li><a href="contatoForm.html" >Cadastrar Produto</a></li>
        <li><a href="cadastroPromocao.jsp" class="active">Cadastrar Promocao</a></li>
        <li><a href="cadastroCliente.jsp" >Atendimento ao Cliente</a></li>
        <li><a href="cadastroCliente.jsp" >Funcionários</a></li>
        <li><a href="perfilFuncionario.jsp" ><% out.print(funcionario.getNomeFuncionario());        %></a></li>
        <li><a href="logout.jsp">Sair</a></li>
      </ul>
    </div>
    <!-- End Navigation -->
  </div>
        <div id="formulario">      
  <!-- End Header -->
    
         <!-- Page Header -->
        <div class="row">
            <div class="col-lg-12">
                <h25 class="page-header">Cadastro de Promoção
                    <small></small>
                </h25>
            </div>
        </div>
        <!-- /.row -->
        
        
    <!-- Formulario -->
    <br>
    <br>
    <form action="PromocaoServ" method="post" onsubmit="return validar(this);">
        
        <div class="form-group" id="divrg" >
            <label for="exampleInputPassword1">Data Inicial</label>
            <input type="text" class="form-control" id="camporg" name= "dataInicial" placeholder="dd/MM/aaaa" onkeyup="formatar('##/##/####',this)">
            
        </div>
        <div class="form-group" id="divrg" >
            <label for="exampleInputPassword1">Data Final</label>
            <input type="text" class="form-control" id="camporg" name= "dataFinal" placeholder="dd/MM/aaaa" onkeyup="formatar('##/##/####',this)">
         
        </div>
         <div class="form-group" id="divrg" >
            <label for="exampleInputPassword1">Desconto em Porcentagem</label>
            <input type="numeric" class="form-control" id="camporg" name= "desconto" placeholder="Desconto em Porcentagem">
         
        </div>
       
        <button type="submit" name="action" value="cadastrar" class="btn btn-default">Cadastrar</button>
    </form>
        </div>
        
    <br>
    <!-- /.form -->
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
    </body>
</html>
