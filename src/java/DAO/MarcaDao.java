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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author PabloHenrique
 */
public class MarcaDao {
    public List<Marca> getMarca() {
        List<Marca> marcaLista = new ArrayList<>();
        try {
            Connection conexao = DataHelper.GetConexao();
            String sql = "SELECT * FROM marca";
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            Marca marca = new Marca();
            while (rs.next()) {

                marca.setIdMarca(rs.getInt("idMarca"));
                marca.setDescricaoMarca(rs.getString("descricaoMarca"));
                
                marcaLista.add(marca);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return marcaLista;
    }
    
    public Marca getAllMarca(String descricao) {
        Marca marca = new Marca();

        try {
            Connection conexao = DataHelper.GetConexao();
            String sql = "select * from marca where descricaoMarca= '"+descricao+"';";
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                marca.setIdMarca(rs.getInt("idMarca"));
                marca.setDescricaoMarca(rs.getString("descricaoMarca"));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return marca;
    }
    
    
 
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

