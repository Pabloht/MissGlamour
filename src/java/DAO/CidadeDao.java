/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cidade;
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
public class CidadeDao {
public Cidade getAllCidade(String nome) {
        Estado e = new Estado();
            Cidade c = new Cidade();

        try {
            Connection conexao = DataHelper.GetConexao();
            String sql = "select c.idCidade, c.nomeCidade, e.nomeEstado, e.idEstado, e.regiao, e.uf "
                    + "from cidade as c left join estado as e  "
                    + "on c.idEStado = e.idEstado where c.NomeCidade = '" + nome + "'";
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                c.setIdCidade(rs.getInt("c.idCidade"));
                c.setNomeCidade(rs.getString("c.nomeCidade"));
                e.setIdEstado(rs.getInt("e.idEstado"));
                e.setNomeEstado(rs.getString("e.nomeEstado"));
                e.setRegiaoEstado(rs.getString("e.regiao"));
                e.setUfEstado(rs.getString("e.uf"));
                c.setEstado(e);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return c;
    }
public Cidade getCidadePorId(int id) {
        Estado e = new Estado();
            Cidade c = new Cidade();

        try {
            Connection conexao = DataHelper.GetConexao();
            String sql = "select c.idCidade, c.nomeCidade, e.nomeEstado, e.idEstado, e.regiao, e.uf "
                    + "from cidade as c left join estado as e  "
                    + "on c.idEStado = e.idEstado where c.idCidade = " + id ;
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                c.setIdCidade(rs.getInt("c.idCidade"));
                c.setNomeCidade(rs.getString("c.nomeCidade"));
                e.setIdEstado(rs.getInt("e.idEstado"));
                e.setNomeEstado(rs.getString("e.nomeEstado"));
                e.setRegiaoEstado(rs.getString("e.regiao"));
                e.setUfEstado(rs.getString("e.uf"));
                c.setEstado(e);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return c;
    }
}
