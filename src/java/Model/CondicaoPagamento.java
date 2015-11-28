/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author PabloHenrique
 */
@Entity
@Table(name = "condicaopagamento")
public class CondicaoPagamento implements java.io.Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "idCondicao")
    private int idCondicao;
    @Column (name = "descricao")
    private String descricao;
    @Column (name = "desconto")
    private int desconto;
    @Column (name = "valorMinimo")
    private double valorMinimo;
    @Column (name = "valorMinimoParcela")
    private double valorMinimoParcela;
    @Column (name = "quantidadeParcela")
    private int quantidadeParcela;
    
//    @Column(name = "venda")   
//    @ManyToMany(mappedBy = "condicaopagamento", cascade = CascadeType.ALL)
//    private List<Venda> venda;

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
