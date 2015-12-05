/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cidade;
import Model.Cliente;
import Model.Estado;
import Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author PabloHenrique
 */
public class FuncionarioDao {
    public Funcionario LoginFuncionario(String login, String senha, HttpServletRequest request) throws SQLException {
    Connection conexao = DataHelper.GetConexao();
    String sql= "select * from funcionario where login = '" + login + "' and senha = '" + senha + "'";
    Funcionario f = new Funcionario();
    PreparedStatement statement = conexao.prepareStatement(sql);
    ResultSet rs = statement.executeQuery();
    try {
        while (rs.next()) {
          f.setIdFuncionario(rs.getInt("idFuncionario"));
          f.setNomeFuncionario(rs.getString("nomeFuncionario"));
          f.setLogin(rs.getString("login"));
          f.setSenha(rs.getString("senha"));
          f.setEmailFuncionario(rs.getString("emailFuncionario"));
//        
        }
        
    } catch (Exception ex) {
        System.out.println("Erro em FuncionarioDao: " + ex);
    }
   
       return f;
    }
}
