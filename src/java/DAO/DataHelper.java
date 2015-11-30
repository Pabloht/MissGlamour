/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PabloHenrique
 */
public class DataHelper {
    private static Connection conexao;

    public static Connection GetConexao() {
        try {
            if (conexao == null) {

                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conexao = DriverManager.getConnection("jdbc:mysql://localhost/missglamour?user=root&password=vertrigo");

            }
        } catch (Exception e) {
            e.printStackTrace();
            if (e.getMessage().equals("Unknown database 'missglamour'")) {
                
                return GetConexao();
            }
        }
        return conexao;


    }
    public String nome = "";
    public boolean result = false;
}
