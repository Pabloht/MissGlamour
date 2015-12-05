/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cidade;
import Model.Cliente;
import Model.Estado;
import Model.Promocao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;



/**
 *
 * @author PabloHenrique
 */
public class ClienteDao {
  
    

            
public static void incluirCliente(Cliente cliente) throws Exception {


        Connection conexao = DataHelper.GetConexao();


        String sql = "Insert into cliente (nomeCliente, cpfCnpj, rgIe, rua, cep, numero, complemento, tipoPessoa, condicao, idEstado, idCidade, telefoneResidencial, "
                + "celular, telefoneRecado, senha, login, emailPrincipal, promocao, sexo, bairro) Values ((?),(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?))";

        PreparedStatement statement = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

        statement.setString(1, cliente.getNomeCliente());
        statement.setString(2, cliente.getCpfCnpj());
        statement.setString(3, cliente.getRgIe());
        statement.setString(4, cliente.getRua());
        statement.setString(5, cliente.getCep());
        statement.setInt(6, cliente.getNumero());
        statement.setString(7, cliente.getComplemento());
        statement.setInt(8, cliente.getTipoPessoa());
        statement.setBoolean(9, cliente.getCondicao());
        statement.setInt(10, cliente.getEstado().getIdEstado());
        statement.setInt(11, cliente.getCidade().getIdCidade());
        statement.setString(12, cliente.getTelefoneResidencial());
        statement.setString(13, cliente.getCelular());
        statement.setString(14, cliente.getTelefoneRecado());
        statement.setString(15, cliente.getSenha());
        statement.setString(16, cliente.getLogin());
        statement.setString(17, cliente.getEmail());
        statement.setBoolean(18, cliente.getPromocao());
        statement.setInt(19, cliente.getSexo());
        statement.setString(20, cliente.getBairro());
        
        


        statement.executeUpdate();

        ResultSet generatedkeys = statement.getGeneratedKeys();


        generatedkeys.next();
        cliente.setIdCliente(generatedkeys.getInt(1));

        
    }

public Cliente LoginCliente(String login, String senha, HttpServletRequest request) throws SQLException {
    Connection conexao = DataHelper.GetConexao();
    String sql= "select * from cliente where login = '" + login + "' and senha = '" + senha + "'";
    Cliente c = new Cliente();
    Estado e = new Estado();
    Cidade ci = new Cidade();
    PreparedStatement statement = conexao.prepareStatement(sql);
    ResultSet rs = statement.executeQuery();
    try {
        while (rs.next()) {
        c.setIdCliente(rs.getInt("idCliente"));
        c.setNomeCliente(rs.getString("nomeCliente"));
        c.setCpfCnpj(rs.getString("cpfCnpj"));
        c.setRgIe(rs.getString("rgIe"));
        c.setRua(rs.getString("rua"));
        c.setCep(rs.getString("cep"));
        c.setNumero(rs.getInt("numero"));
        c.setComplemento(rs.getString("complemento"));
        c.setTipoPessoa(rs.getInt("tipoPessoa"));
        c.setCondicao(rs.getBoolean("condicao"));
        c.setTelefoneResidencial(rs.getString("telefoneResidencial"));
        c.setCelular(rs.getString("celular"));
        c.setTelefoneRecado(rs.getString("telefoneRecado"));
        c.setLogin(rs.getString("login"));
        c.setSenha(rs.getString("senha"));
        c.setEmail(rs.getString("emailPrincipal"));
        c.setPromocao(rs.getBoolean("promocao"));
        c.setSexo(rs.getInt("sexo"));
        c.setBairro(rs.getString("bairro"));
        int idCidade = rs.getInt("idCidade");
        e.setIdEstado(rs.getInt("idEstado"));
        ci = new CidadeDao().getCidadePorId(idCidade);
        e = new EstadoDao().getEstado(ci.getEstado().getUfEstado());
        c.setEstado(e);
        c.setCidade(ci);
        }
        
    } catch (Exception ex) {
        System.out.println("Erro em ClienteDao: " + ex);
    }
    
    

		
       return c;
    }
}

