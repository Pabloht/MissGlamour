/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DAO.CidadeDao;
import DAO.ClienteDao;
import DAO.EstadoDao;
import DAO.MarcaDao;
import Model.Cidade;
import Model.Cliente;
import Model.Estado;
import Model.Marca;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
        HttpSession session = req.getSession(true);
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
                Estado e = new Estado();
                Cidade ci = new Cidade();
                ci = new CidadeDao().getAllCidade(cidade);
                if(estado.equals(ci.getEstado().getUfEstado())) {
                    e = new EstadoDao().getEstado(estado);
                    
                }
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
                c.setTelefoneRecado(telefoneRecado);
                c.setEmail(email);
                c.setLogin(login);
                c.setSenha(senha);
                
                c.setPromocao(false);
                
                
                c.setEstado(e);
                c.setCidade(ci);
                c.setCondicao(true);
                c.setBairro(bairro);
                if(sexo.equals("masculino")) {
                    c.setSexo(0);
                } else {
                    c.setSexo(1);
                }
                if(pessoa.equals("Pessoa Física")) {
                    c.setTipoPessoa(0);
                } else {
                    c.setTipoPessoa(1);    
                }
               ClienteDao.incluirCliente(c);
                
            } catch (Exception e) {
                
            }
            resp.sendRedirect("login.html");
        } else if (action.equalsIgnoreCase("alterarDados")) {
            Cliente cl = (Cliente) req.getSession().getAttribute("cliente");
            
            String nome = req.getParameter("nome");          
            String cpf = req.getParameter("cpf");          
            String rg = req.getParameter("rg");  
            String telefone = req.getParameter("telefoneResidencial");          
            String celular = req.getParameter("celular");          
            String telefoneRecado = req.getParameter("telefoneRecado");          
            String email = req.getParameter("email");          
            String senha = req.getParameter("senha");          
            String sexo = req.getParameter("sexo");
            Cliente c = new Cliente();
            try {
                c.setIdCliente(cl.getIdCliente());
                c.setNomeCliente(nome);
                c.setCpfCnpj(cpf);
                c.setRgIe(rg);
                c.setTelefoneResidencial(telefone);
                c.setCelular(celular);
                c.setTelefoneRecado(telefoneRecado);
                c.setEmail(email);
                c.setSenha(senha);
                if(sexo.equals("Masculino")) {
                    c.setSexo(0);
                } else {
                    c.setSexo(1);
                }
                
                new ClienteDao().AlterarDados(c);
                session.setAttribute("cliente", null);
                resp.sendRedirect("home.jsp");
            } catch (Exception ex) {
                System.out.println(ex);
            }
            
        } else if (action.equalsIgnoreCase("alterarEndereco")) {
            Cliente cl = (Cliente) req.getSession().getAttribute("clientes");
            
            String estado = req.getParameter("estado");          
            String cidade = req.getParameter("cidade");          
            String bairro = req.getParameter("bairro");  
            String complemento = req.getParameter("complemento");          
            String numero = req.getParameter("numero");          
            String cep = req.getParameter("cep");          
            String rua = req.getParameter("rua");          
            Estado e = new Estado();
            Cidade ci = new Cidade();
            Cliente c = new Cliente();
            try {
                
                ci = new CidadeDao().getAllCidade(cidade);
                if(estado.equals(ci.getEstado().getUfEstado())) {
                    e = new EstadoDao().getEstado(estado);
                    
                }
                c.setIdCliente(cl.getIdCliente());
                c.setRua(rua);
                c.setCep(cep);
                c.setComplemento(complemento);
                int num = Integer.valueOf(numero);
                c.setNumero(num);
                c.setBairro(bairro);
                c.setEstado(e);
                c.setCidade(ci);
                new ClienteDao().AlterarEndereco(c);
                session.setAttribute("clientes", null);
                resp.sendRedirect("home.jsp");
            } catch (Exception ex) {
                System.out.println(ex);
            }
            
        }
        
        
        else if (action.equalsIgnoreCase("mostrar")) 
        {
            int id = Integer.valueOf(req.getParameter("id"));
            
            try {
            Cliente c = ClienteDao.getCliente(id);

            session.setAttribute("cliente", c);
            RequestDispatcher dispacher;

        dispacher = getServletContext().getRequestDispatcher("/perfilCliente.jsp");      

        dispacher.forward(req, resp);
            } catch(Exception ex) {
                System.out.println(ex);
            }
             
            

          

        }  else if (action.equalsIgnoreCase("mostrarEndereco")) 
        {
            int id = Integer.valueOf(req.getParameter("id"));
            
            try {
            Cliente c = ClienteDao.getCliente(id);

            session.setAttribute("clientes", c);
            RequestDispatcher dispacher;

        dispacher = getServletContext().getRequestDispatcher("/perfilCliente.jsp");      

        dispacher.forward(req, resp);
            } catch(Exception ex) {
                System.out.println(ex);
            }
             
            

          

        }
    }

   

}
