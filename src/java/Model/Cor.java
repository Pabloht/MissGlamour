/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;


/**
 *
 * @author PabloHenrique
 */
public class Cor implements java.io.Serializable{
    private int idCor;
    private String descricaoCor;
    
    /**
     * @return the idCor
     */
    public int getIdCor() {
        return idCor;
    }

    /**
     * @param idCor the idCor to set
     */
    public void setIdCor(int idCor) {
        this.idCor = idCor;
    }

    /**
     * @return the descricaoCor
     */
    public String getDescricaoCor() {
        return descricaoCor;
    }

    /**
     * @param descricaoCor the descricaoCor to set
     */
    public void setDescricaoCor(String descricaoCor) {
        this.descricaoCor = descricaoCor;
    }

    /**
     * @return the produto
     */
//    public List<Produto> getProduto() {
//        return produto;
//    }
//
//    /**
//     * @param produto the produto to set
//     */
//    public void setProduto(List<Produto> produto) {
//        this.produto = produto;
//    }
}