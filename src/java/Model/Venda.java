/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author PabloHenrique
 */
@Entity
@Table(name = "venda")
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idVenda")
    private int idVenda;
    @Column(name = "dataVenda")
    private Date dataVenda;
    @Column(name = "valorFrete")
    private double valorFrete;
    @Column(name = "valorDesconto")
    private double valorDesconto;
    @Column(name = "valorTotalProduto")
    private double valorTotalProduto;
    @Column(name = "valorTotal")
    private double valorTotal;
    
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;
    
    @ManyToMany 
    @JoinTable(name="pagamentoVenda", 
    joinColumns=@JoinColumn(name="idVenda"),
    inverseJoinColumns=@JoinColumn(name="idCondicao"))
    @Column(name = "vendaCondicao")
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
