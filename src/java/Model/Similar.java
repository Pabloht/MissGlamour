/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author PabloHenrique
 */
@Entity
@Table(name = "similar")
public class Similar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSimilar")
    private int idSimilar;
    @Column (name = "descricaoSimilar")
    private String descricaoSimilar;
    
    @OneToMany (mappedBy="produto" , targetEntity=Produto.class)
    private List<Produto> produto;

    /**
     * @return the idSimilar
     */
    public int getIdSimilar() {
        return idSimilar;
    }

    /**
     * @param idSimilar the idSimilar to set
     */
    public void setIdSimilar(int idSimilar) {
        this.idSimilar = idSimilar;
    }

    /**
     * @return the descricaoSimilar
     */
    public String getDescricaoSimilar() {
        return descricaoSimilar;
    }

    /**
     * @param descricaoSimilar the descricaoSimilar to set
     */
    public void setDescricaoSimilar(String descricaoSimilar) {
        this.descricaoSimilar = descricaoSimilar;
    }

    /**
     * @return the produto
     */
    public List<Produto> getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
}

