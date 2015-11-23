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
@Table(name = "marca")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMarca")
    private int idMarca;
    @Column(name = "descricaoMarca")
    private String descricaoMarca;
    
    @OneToMany (mappedBy="produto" , targetEntity=Produto.class)
    private List<Produto> produto;

    public Marca(String descricao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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