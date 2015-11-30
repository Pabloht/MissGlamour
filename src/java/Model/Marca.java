/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 *
 * @author PabloHenrique
 */
public class Marca implements java.io.Serializable {
    private int idMarca;
    private String descricaoMarca;
    


    public Marca(String descricao) {
       
    }

    public Marca() {
       
    }

    /**
     * @return the idMarca
     */
    public int getIdMarca() {
        return idMarca;
    }

    /**
     * @param idMarca the idMarca to set
     */
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    /**
     * @return the descricaoMarca
     */
    public String getDescricaoMarca() {
        return descricaoMarca;
    }

    /**
     * @param descricaoMarca the descricaoMarca to set
     */
    public void setDescricaoMarca(String descricaoMarca) {
        this.descricaoMarca = descricaoMarca;
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