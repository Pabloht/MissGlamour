/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Promocao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author asus
 */
public class PromocaoDao {
    
     Connection conexao = DataHelper.GetConexao();

                 
public static void incluirPromocao(Promocao promocao) throws Exception {
    
        System.out.println("Tela Dao Inicio");
        Connection conexao = DataHelper.GetConexao();

        String sql = "insert into promocao  (dataInicial,dataFinal,disponivel,desconto) values((?),(?),(?),(?))";

        PreparedStatement statement = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

        statement.setDate(1, promocao.getDataInicial());
        statement.setDate(2, promocao.getDataFinal());
        statement.setBoolean(3, promocao.getDisponivel());
        statement.setInt(4, promocao.getDesconto());
        
        
        


        statement.executeUpdate();

        ResultSet generatedkeys = statement.getGeneratedKeys();


        generatedkeys.next();
        promocao.setIdPromocao(generatedkeys.getInt(1));

        
    }
    
}
