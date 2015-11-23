/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author PabloHenrique
 */
public class Foto {
    private int idFoto;
    private int ordem;
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "idProduto")
    private Produto produto;

    /**
     * @return the idFoto
     */
    public int getIdFoto() {
        return idFoto;
    }

    /**
     * @param idFoto the idFoto to set
     */
    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    /**
     * @return the ordem
     */
    public int getOrdem() {
        return ordem;
    }

    /**
     * @param ordem the ordem to set
     */
    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
