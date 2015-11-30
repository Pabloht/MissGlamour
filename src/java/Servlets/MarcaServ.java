/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DAO.MarcaDao;
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
public class MarcaServ extends HttpServlet {
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
            String descricao = req.getParameter("descricao");          

            try {
                Marca m = new Marca();
                m.setDescricaoMarca(descricao);
                MarcaDao.incluirMarca(m);
            } catch (Exception e) {
                
            }
            resp.sendRedirect("deuCerto.html");
        }
    }

   
}
