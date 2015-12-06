/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DAO.PromocaoDao;
import Model.Promocao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asus
 */
public class PromocaoServ extends HttpServlet {

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
            String dataInicial = req.getParameter("dataInicial");          
            String dataFinal = req.getParameter("dataFinal"); 
            String desconto = req.getParameter("desconto");          
                    
                     
            
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Promocao c = new Promocao();
                c.setDataFinal((Date) sdf.parse(dataFinal));
                c.setDataInicial((Date) sdf.parse(dataInicial));
                c.setDisponivel(true);
                c.setDesconto(Integer.parseInt(desconto));
               
                PromocaoDao.incluirPromocao(c);
                
            } catch (Exception e) {
                
            }
            resp.sendRedirect("cadastroPromocao.html");
        }
    }

   

}
