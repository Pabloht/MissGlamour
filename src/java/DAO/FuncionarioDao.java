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
    public static Funcionario getFuncionario(int id) throws SQLException {

        
        Funcionario f = new Funcionario();
        Connection conexao = DataHelper.GetConexao();
        
                String sql = "SELECT * FROM funcionario where idFuncionario= " + String.valueOf(id);
                PreparedStatement statement = conexao.prepareStatement(sql);
                ResultSet rs = statement.executeQuery();
        try {
            while (rs.next()) {
                f.setIdFuncionario(rs.getInt("idFuncionario"));
                f.setLogin(rs.getString("login"));
                f.setSenha(rs.getString("senha"));
                f.setEmailFuncionario(rs.getString("emailFuncionario"));
                f.setNomeFuncionario(rs.getString("nome"));
                f.setCondicao(rs.getBoolean("condicao"));
                
            }        
                
                
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return f;
    }
    
    public static void AlterarDados(Funcionario funcionario) throws Exception {

        Connection conexao = DataHelper.GetConexao();


        String sql = "UPDATE  funcionario SET nomeFuncionario = (?), senha = (?), emailFuncionario = (?) WHERE idFuncionario=(?)";

        PreparedStatement statement = conexao.prepareStatement(sql);

        statement.setString(1, funcionario.getNomeFuncionario());
        statement.setString(2, funcionario.getSenha());
        statement.setString(3, funcionario.getEmailFuncionario());
        statement.setInt(4, funcionario.getIdFuncionario());


        statement.executeUpdate();

    }
}
