/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Model.Tamanho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Igor
 */
public class TamanhoDao {
      public Tamanho getAllTamanho(String descricao) {
        Tamanho tamanho = new Tamanho();

        try {
            Connection conexao = DataHelper.GetConexao();
            String sql = "select * from tamanho where descricaoTamanho= '"+descricao+"';";
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                tamanho.setIdTamanho(rs.getInt("idTamanho"));
                tamanho.setDescricaoTamanho(rs.getString("descricaoTamanho"));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tamanho;
    }
    
    
    public List<Tamanho> getTamanho() {
        List<Tamanho> tamanhoLista = new ArrayList<>();
        try {
            Connection conexao = DataHelper.GetConexao();
            String sql = "SELECT * FROM tamanho";
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                Tamanho tamanho = new Tamanho();
                tamanho.setIdTamanho(rs.getInt("idTamanho"));
                tamanho.setDescricaoTamanho(rs.getString("descricaoTamanho"));
                
                tamanhoLista.add(tamanho);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tamanhoLista;
    }
    
}
