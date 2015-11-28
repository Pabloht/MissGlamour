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
@Table(name = "tamanho")
public class Tamanho implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTamanho")
    private int idTamanho;
    @Column(name = "descricaoTamanho")
    private String descricaoTamanho;
    
    @OneToMany (mappedBy="tamanho" , targetEntity=Produto.class)
    private List<Produto> produto;
    /**
     * @return the idTamanho
     */
    public int getIdTamanho() {
        return idTamanho;
    }

    /**
     * @param idTamanho the idTamanho to set
     */
    public void setIdTamanho(int idTamanho) {
        this.idTamanho = idTamanho;
    }

    /**
     * @return the descricaoTamanho
     */
    public String getDescricaoTamanho() {
        return descricaoTamanho;
    }

    /**
     * @param descricaoTamanho the descricaoTamanho to set
     */
    public void setDescricaoTamanho(String descricaoTamanho) {
        this.descricaoTamanho = descricaoTamanho;
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
