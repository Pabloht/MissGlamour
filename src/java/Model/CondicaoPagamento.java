/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.util.List;


/**
 *
 * @author PabloHenrique
 */

public class CondicaoPagamento implements java.io.Serializable {
    private int idCondicao;
    private String descricao;
    private int desconto;   
    private double valorMinimo;
    private double valorMinimoParcela;
    private int quantidadeParcela;
    
    /**
     * @return the idCondicao
     */
    public int getIdCondicao() {
        return idCondicao;
    }

    /**
     * @param idCondicao the idCondicao to set
     */
    public void setIdCondicao(int idCondicao) {
        this.idCondicao = idCondicao;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the desconto
     */
    public int getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the valorMinimo
     */
    public double getValorMinimo() {
        return valorMinimo;
    }

    /**
     * @param valorMinimo the valorMinimo to set
     */
    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    /**
     * @return the valorMinimoParcela
     */
    public double getValorMinimoParcela() {
        return valorMinimoParcela;
    }

    /**
     * @param valorMinimoParcela the valorMinimoParcela to set
     */
    public void setValorMinimoParcela(double valorMinimoParcela) {
        this.valorMinimoParcela = valorMinimoParcela;
    }

    /**
     * @return the quantidadeParcela
     */
    public int getQuantidadeParcela() {
        return quantidadeParcela;
    }

    /**
     * @param quantidadeParcela the quantidadeParcela to set
     */
    public void setQuantidadeParcela(int quantidadeParcela) {
        this.quantidadeParcela = quantidadeParcela;
    }

    /**
     * @return the venda
     */
//    public List<Venda> getVenda() {
//        return venda;
//    }
//
//    /**
//     * @param venda the venda to set
//     */
//    public void setVenda(List<Venda> venda) {
//        this.venda = venda;
//    }
//    
    
}
