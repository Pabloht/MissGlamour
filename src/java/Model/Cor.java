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
@Table(name = "cor")
public class Cor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCor")
    private int idCor;
    @Column(name = "descricaoCor")
    private String descricaoCor;
    
    @OneToMany (mappedBy="produto" , targetEntity=Produto.class)
    private List<Produto> produto;

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