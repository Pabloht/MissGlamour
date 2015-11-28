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
@Table(name = "estado")
public class Estado implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEstado")
    private int idEstado;
    @Column(name = "nomeEstado")
    private String nomeEstado;
    @Column(name = "regiaoEstado")
    private String regiaoEstado;
    
    @OneToMany (mappedBy="estado" , targetEntity=Cidade.class)
    private List<Cidade> cidade;
    
     @OneToMany (mappedBy="estado" , targetEntity=Cliente.class)
    private List<Cliente> cliente;

    /**
     * @return the idEstado
     */
    public int getIdEstado() {
        return idEstado;
    }

    /**
     * @param idEstado the idEstado to set
     */
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    /**
     * @return the nomeEstado
     */
    public String getNomeEstado() {
        return nomeEstado;
    }

    /**
     * @param nomeEstado the nomeEstado to set
     */
    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    /**
     * @return the regiaoEstado
     */
    public String getRegiaoEstado() {
        return regiaoEstado;
    }

    /**
     * @param regiaoEstado the regiaoEstado to set
     */
    public void setRegiaoEstado(String regiaoEstado) {
        this.regiaoEstado = regiaoEstado;
    }

    /**
     * @return the cidade
     */
    public List<Cidade> getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(List<Cidade> cidade) {
        this.cidade = cidade;
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
     
}
