/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAO.MarcaDao;
import Model.Marca;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author PabloHenrique
 */
public class MarcaService {
    
        private MarcaDao marcaDao = new MarcaDao();
     public boolean incluirMarca(String descricao) {
        boolean retorno = false;
         Marca marca = new Marca(descricao);
        try {
            marcaDao.incluirMarca(marca);
            retorno = true;
            JOptionPane.showMessageDialog(null, "Sessão " + descricao + " cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro na inclusão da sessão... " + e);
        }
        return retorno;
    }
}
