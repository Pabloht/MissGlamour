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
@Table (name = "produto")
public class Produto implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idProduto")
    private int idProduto;
    @Column (name = "descricaoProduto")
    private String descricaoProduto;
    @Column (name = "disponivel")
    private boolean disponivel;
    @Column (name = "quantidade")
    private int quantidade;
    @Column (name = "pesoCubico")
    private double pesoCubico;
    @Column (name = "pesoFisico")
    private double pesoFisico;
    @Column (name = "valorProduto")
    private double valorProduto;
    
    @ManyToOne
    @JoinColumn(name = "idMarca")
    private Marca marca;
    
    @ManyToOne
    @JoinColumn(name = "idCor")
    private Cor cor;
    
    @ManyToOne
    @JoinColumn(name = "idSimilar")
    private Similar similar;
    
    @ManyToOne
    @JoinColumn(name = "idTamanho")
    private Tamanho tamanho;
    
    @ManyToOne
    @JoinColumn(name = "idPromocao")
    private Promocao promocao;
    
//    @OneToMany (mappedBy="produto" , targetEntity=Foto.class)
//    private List<Foto> foto;

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the descricaoProduto
     */
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    /**
     * @param descricaoProduto the descricaoProduto to set
     */
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
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
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the pesoCubico
     */
    public double getPesoCubico() {
        return pesoCubico;
    }

    /**
     * @param pesoCubico the pesoCubico to set
     */
    public void setPesoCubico(double pesoCubico) {
        this.pesoCubico = pesoCubico;
    }

    /**
     * @return the pesoFisico
     */
    public double getPesoFisico() {
        return pesoFisico;
    }

    /**
     * @param pesoFisico the pesoFisico to set
     */
    public void setPesoFisico(double pesoFisico) {
        this.pesoFisico = pesoFisico;
    }

    /**
     * @return the valorProduto
     */
    public double getValorProduto() {
        return valorProduto;
    }

    /**
     * @param valorProduto the valorProduto to set
     */
    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    /**
     * @return the cor
     */
    public Cor getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(Cor cor) {
        this.cor = cor;
    }

    /**
     * @return the similar
     */
    public Similar getSimilar() {
        return similar;
    }

    /**
     * @param similar the similar to set
     */
    public void setSimilar(Similar similar) {
        this.similar = similar;
    }

    /**
     * @return the tamanho
     */
    public Tamanho getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the foto
     */
//    public List<Foto> getFoto() {
//        return foto;
//    }
//
//    /**
//     * @param foto the foto to set
//     */
//    public void setFoto(List<Foto> foto) {
//        this.foto = foto;
//    }
}
