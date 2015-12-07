/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlets;

import DAO.CorDao;
import DAO.MarcaDao;
import DAO.ProdutoDao;
import DAO.PromocaoDao;
import DAO.TamanhoDao;
import Model.Cor;
import Model.Marca;
import Model.Produto;
import Model.Promocao;
import Model.Similar;
import Model.Tamanho;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Igor
 */
public class ProdutoServ extends HttpServlet {
    
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
        
        if (action.equalsIgnoreCase("cadastrarProduto")) {
            String descricao = req.getParameter("descricao");
            String quantidade = req.getParameter("quantidade");
            String disponivel = req.getParameter("disponivel");
            String valorProduto = req.getParameter("valorProduto");
            String pesoFisico = req.getParameter("pesoFisico");
            String pesoCubico = req.getParameter("pesoCubico");
            String marca = req.getParameter("marca");
            String cor = req.getParameter("cor");
            String tamanho = req.getParameter("tamanho");
            
            
            try {
                Marca m = new Marca();
                Cor c = new Cor();
                Tamanho t = new Tamanho();
                Promocao promo = new Promocao();
                Produto p = new Produto();
                Similar s = new Similar();
                    p.setDescricaoProduto(descricao);
                    
                    int quant = Integer.valueOf(quantidade);
                    p.setQuantidade(quant);
                    
                    p.setDisponivel(true);
                    
                    int valor = Integer.valueOf(valorProduto);
                    p.setValorProduto(valor);
                    
                    int pesoF = Integer.valueOf(pesoFisico);
                    p.setPesoFisico(pesoF);
                    
                    int pesoC = Integer.valueOf(pesoCubico);
                    p.setPesoCubico(pesoC);
                    
                    m = new MarcaDao().getAllMarca(marca);
                    p.setMarca(m);
                    
                    c = new CorDao().getAllCor(cor);
                    p.setCor(c);
                    
                    t = new TamanhoDao().getAllTamanho(tamanho);
                    p.setTamanho(t);
                    
                    s.setIdSimilar(1);
                    s.setDescricaoSimilar("Nenhum");
                    p.setSimilar(s);
                    promo = new PromocaoDao().getAllPromocao("Nenhuma");
                    p.setPromocao(promo);
                    ProdutoDao.incluirProduto(p);
            } catch (Exception e){
                System.out.println(e);
            }
            resp.sendRedirect("cadastroProduto.jsp");
        }
    }
}
