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
@Table(name = "funcao")
public class Funcao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFuncao")
    private int idFuncao;
    @Column(name = "nomeFuncao")
    private String nomeFuncao;
    @Column(name = "condicao")
    private boolean condicao;
    @Column(name = "permissao")
    private int permissao;
    
    @OneToMany (mappedBy="funcao" , targetEntity=Funcionario.class)
    private List<Funcionario> funcionario;

    /**
     * @return the idFuncao
     */
    public int getIdFuncao() {
        return idFuncao;
    }

    /**
     * @param idFuncao the idFuncao to set
     */
    public void setIdFuncao(int idFuncao) {
        this.idFuncao = idFuncao;
    }

    /**
     * @return the nomeFuncao
     */
    public String getNomeFuncao() {
        return nomeFuncao;
    }

    /**
     * @param nomeFuncao the nomeFuncao to set
     */
    public void setNomeFuncao(String nomeFuncao) {
        this.nomeFuncao = nomeFuncao;
    }

    /**
     * @return the condicao
     */
    public boolean getCondicao() {
        return condicao;
    }

    /**
     * @param condicao the condicao to set
     */
    public void setCondicao(boolean condicao) {
        this.condicao = condicao;
    }

    /**
     * @return the permissao
     */
    public int getPermissao() {
        return permissao;
    }

    /**
     * @param permissao the permissao to set
     */
    public void setPermissao(int permissao) {
        this.permissao = permissao;
    }

    /**
     * @return the funcionario
     */
    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
}
