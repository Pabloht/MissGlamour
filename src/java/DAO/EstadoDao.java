/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Estado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author PabloHenrique
 */
public class EstadoDao {
 public Estado getEstado(String uf) {
        Estado e = new Estado();
        try {
            Connection conexao = DataHelper.GetConexao();
            String sql = "SELECT * FROM estado where uf = '" + uf + "'";
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {

                e.setIdEstado(rs.getInt("idEstado"));
                e.setNomeEstado(rs.getString("nomeEstado"));
                e.setRegiaoEstado(rs.getString("regiao"));
                e.setUfEstado(rs.getString("uf"));
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return e;
    }
}
