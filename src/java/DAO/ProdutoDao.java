/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Igor
 */
public class ProdutoDao {
    
    public static void incluirProduto(Produto produto) throws Exception {
            
            Connection conexao = DataHelper.GetConexao();
    
    String sql = "Insert into produto (descricaoProduto, disponivel, quantidade, pesoCubico, pesoFisico, idMarca, valorProduto, idCor, idTamanho, idSimilar, idPromocao) "
                + "Values ((?),(?), (?), (?), (?), (?), (?), (?), (?), (?), (?))";
    
        PreparedStatement statement = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
    
        statement.setString(1, produto.getDescricaoProduto());
        statement.setBoolean(2, produto.isDisponivel());
        statement.setInt(3, produto.getQuantidade());
        statement.setDouble(4, produto.getPesoCubico());
        statement.setDouble(5, produto.getPesoFisico());
        statement.setInt(6, produto.getMarca().getIdMarca());
        statement.setDouble(7, produto.getValorProduto());
        statement.setInt(8, produto.getCor().getIdCor());
        statement.setInt(9, produto.getTamanho().getIdTamanho());
        statement.setInt(10, produto.getSimilar().getIdSimilar());
        statement.setInt(11, produto.getPromocao().getIdPromocao());
        
        statement.executeUpdate();

        ResultSet generatedkeys = statement.getGeneratedKeys();


        generatedkeys.next();
        produto.setIdProduto(generatedkeys.getInt(1));
        
    
        }
        
    }
