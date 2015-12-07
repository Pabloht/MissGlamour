/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Model.Cor;
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
public class CorDao {
     public Cor getAllCor(String descricao) {
        Cor cor = new Cor();

        try {
            Connection conexao = DataHelper.GetConexao();
            String sql = "select * from cor where descricaoCor= '"+descricao+"';";
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                cor.setIdCor(rs.getInt("idCor"));
                cor.setDescricaoCor(rs.getString("descricaoCor"));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cor;
    }
    
    public List<Cor> getCor() {
        List<Cor> corLista = new ArrayList<>();
        try {
            Connection conexao = DataHelper.GetConexao();
            String sql = "SELECT * FROM cor";
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                Cor cor = new Cor();
                cor.setIdCor(rs.getInt("idCor"));
                cor.setDescricaoCor(rs.getString("descricaoCor"));
                
                corLista.add(cor);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return corLista;
    }
    
}
