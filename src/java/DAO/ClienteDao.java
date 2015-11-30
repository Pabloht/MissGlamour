/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



/**
 *
 * @author PabloHenrique
 */
public class ClienteDao {
  
    

            
public static void incluirCliente(Cliente cliente) throws Exception {


        Connection conexao = DataHelper.GetConexao();


        String sql = "Insert into cliente (nomeCliente, cpfCnpj, rgIe, rua, cep, numero, complemento, tipoPessoa, condicao, idEstado, idCidade, telefoneResidencia, "
                + "celular, telefoneRecado, senha, login, emailPrincipal, promocao, email, sexo, bairro) Values ((?), (?),(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?))";

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
        statement.setString(19, cliente.getEmail());
        statement.setInt(20, cliente.getSexo());
        statement.setString(21, cliente.getBairro());
        


        statement.executeUpdate();

        ResultSet generatedkeys = statement.getGeneratedKeys();


        generatedkeys.next();
        cliente.setIdCliente(generatedkeys.getInt(1));

        
    }
		
       
    }

