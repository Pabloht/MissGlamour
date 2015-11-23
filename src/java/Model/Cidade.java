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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author PabloHenrique
 */
@Entity
@Table(name = "cidade")
public class Cidade {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idCidade")
    private int idCidade;
    @Column(name = "nomeCidade")
    private String nomeCidade;
    
    
     @OneToMany (mappedBy="cidade" , targetEntity=Cliente.class)
    private List<Cliente> cliente;
    
    @ManyToOne
    @JoinColumn(name = "idEstado")
    private Estado estado;

    /**
     * @return the idCidade
     */
    public int getIdCidade() {
        return idCidade;
    }

    /**
     * @param idCidade the idCidade to set
     */
    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    /**
     * @return the nomeCidade
     */
    public String getNomeCidade() {
        return nomeCidade;
    }

    /**
     * @param nomeCidade the nomeCidade to set
     */
    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    /**
     * @return the cliente
     */
    public List<Cliente> getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
