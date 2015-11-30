/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Model.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author PabloHenrique
 */
public class MarcaDao {
    
    
    
 
 public static Marca incluirMarca(Marca marca) throws Exception {


        Connection conexao = DataHelper.GetConexao();


        String sql = "Insert into marca (descricaoMarca) Values ((?))";

        PreparedStatement statement = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

        statement.setString(1, marca.getDescricaoMarca());
        
        


        statement.executeUpdate();

        ResultSet generatedkeys = statement.getGeneratedKeys();


        generatedkeys.next();
        marca.setIdMarca(generatedkeys.getInt(1));

        return marca;
    } 
	
}

