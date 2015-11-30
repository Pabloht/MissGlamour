/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DAO.ClienteDao;
import DAO.MarcaDao;
import Model.Cidade;
import Model.Cliente;
import Model.Estado;
import Model.Marca;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PabloHenrique
 */
public class ClienteServ extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        execute(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        execute(req, resp);
    }
    
    protected void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String action = req.getParameter("action");
        
        if (action.equalsIgnoreCase("cadastrar")) {
            String nome = req.getParameter("nome");          
            String cpf = req.getParameter("cpf");          
            String rg = req.getParameter("rg");          
            String estado = req.getParameter("estado");          
            String cidade = req.getParameter("cidade");          
            String endereco = req.getParameter("endereco");          
            String cep = req.getParameter("cep");          
            String numero = req.getParameter("numero");          
            String complemento = req.getParameter("complemento");          
            String bairro = req.getParameter("bairro");          
            String telefone = req.getParameter("telefone");          
            String celular = req.getParameter("celular");          
            String telefoneRecado = req.getParameter("telefoneRecado");          
            String email = req.getParameter("email");          
            String login = req.getParameter("login");          
            String senha = req.getParameter("senha");          
            String sexo = req.getParameter("sexo");          
            String pessoa = req.getParameter("pessoa");          
            
            try {
                Cliente c = new Cliente();
                c.setNomeCliente(nome);
                c.setCpfCnpj(cpf);
                c.setRgIe(rg);
               
                c.setRua(endereco);
                c.setCep(cep);
                int num = Integer.valueOf(numero);
                c.setNumero(num);
                c.setComplemento(complemento);
                c.setTelefoneResidencial(telefone);
                c.setCelular(celular);
                c.setTelefoneResidencial(telefoneRecado);
                c.setEmail(email);
                c.setLogin(login);
                c.setSenha(senha);
                c.setSexo(0);
                c.setPromocao(false);
                Estado e = new Estado();
                
                Cidade ci = new Cidade();
                c.setEstado(e);
                c.setCidade(ci);
                c.setCondicao(true);
                c.setTipoPessoa(0);
                c.setBairro(bairro);
//                if(pessoa.equals("fisica")) {
//                    c.setTipoPessoa(0);
//                } else {
//                    c.setTipoPessoa(1);    
//                }
                new ClienteDao().incluirCliente(c);
                
            } catch (Exception e) {
                
            }
            resp.sendRedirect("deuCerto.html");
        }
    }

   

}
