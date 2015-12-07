/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cor;
import Model.Promocao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class PromocaoDao {
    
     Connection conexao = DataHelper.GetConexao();

     public List<Promocao> getPromocao() {
        List<Promocao> promocaoLista = new ArrayList<>();
        try {
            Connection conexao = DataHelper.GetConexao();
            String sql = "SELECT * FROM promocao";
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            Promocao promocao = new Promocao();
            while (rs.next()) {

                promocao.setIdPromocao(rs.getInt("idPromocao"));
                promocao.setDataInicial(rs.getDate("dataInicial"));
                promocao.setDataFinal(rs.getDate("dataFinal"));
                promocao.setDisponivel(rs.getBoolean("disponivel"));
                
                promocaoLista.add(promocao);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return promocaoLista;
    }
     
     
       public Promocao getAllPromocao(String descricao) {
        Promocao promocao = new Promocao();

        try {
            Connection conexao = DataHelper.GetConexao();
            String sql = "select * from promocao where descricaoPromocao= '"+descricao+"';";
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                promocao.setIdPromocao(rs.getInt("idPromocao"));
                promocao.setDescricaoPromocao(rs.getString("descricaoPromocao"));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return promocao;
    }   
     
     
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
