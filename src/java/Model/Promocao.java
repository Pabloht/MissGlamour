/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
import java.util.List;


/**
 *
 * @author PabloHenrique
 */
public class Promocao implements java.io.Serializable {
    private int idPromocao;
    private Date dataInicial;
    private Date dataFinal;
    private boolean disponivel;
    
    

    /**
     * @return the idPromocao
     */
    public int getIdPromocao() {
        return idPromocao;
    }

    /**
     * @param idPromocao the idPromocao to set
     */
    public void setIdPromocao(int idPromocao) {
        this.idPromocao = idPromocao;
    }

    /**
     * @return the dataInicial
     */
    public Date getDataInicial() {
        return dataInicial;
    }

    /**
     * @param dataInicial the dataInicial to set
     */
    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    /**
     * @return the dataFinal
     */
    public Date getDataFinal() {
        return dataFinal;
    }

    /**
     * @param dataFinal the dataFinal to set
     */
    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    /**
     * @return the disponivel
     */
    public boolean isDisponivel() {
        return disponivel;
    }

    /**
     * @param disponivel the disponivel to set
     */
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    /**
     * @return the produto
     */
    
}
