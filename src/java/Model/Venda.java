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
public class Venda implements java.io.Serializable {
    private int idVenda;
    private Date dataVenda;
    private double valorFrete;
    private double valorDesconto;
    private double valorTotalProduto;
    private double valorTotal;
    
    private Cliente cliente;
    

    private List<CondicaoPagamento> condicaoPagamento;

    /**
     * @return the idVenda
     */
    public int getIdVenda() {
        return idVenda;
    }

    /**
     * @param idVenda the idVenda to set
     */
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    /**
     * @return the dataVenda
     */
    public Date getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the valorFrete
     */
    public double getValorFrete() {
        return valorFrete;
    }

    /**
     * @param valorFrete the valorFrete to set
     */
    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    /**
     * @return the valorDesconto
     */
    public double getValorDesconto() {
        return valorDesconto;
    }

    /**
     * @param valorDesconto the valorDesconto to set
     */
    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    /**
     * @return the valorTotalProduto
     */
    public double getValorTotalProduto() {
        return valorTotalProduto;
    }

    /**
     * @param valorTotalProduto the valorTotalProduto to set
     */
    public void setValorTotalProduto(double valorTotalProduto) {
        this.valorTotalProduto = valorTotalProduto;
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the condicao
     */
    

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the condicaoPagamento
     */
    public List<CondicaoPagamento> getCondicaoPagamento() {
        return condicaoPagamento;
    }

    /**
     * @param condicaoPagamento the condicaoPagamento to set
     */
    public void setCondicaoPagamento(List<CondicaoPagamento> condicaoPagamento) {
        this.condicaoPagamento = condicaoPagamento;
    }
}
