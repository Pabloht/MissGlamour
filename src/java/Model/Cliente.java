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
@Table(name = "cliente")
public class Cliente implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
    private int idCliente;
    @Column(name = "nomeCliente")
    private String nomeCliente;
    @Column(name = "cpfCnpj")
    private String cpfCnpj;
    @Column(name = "rgIe")
    private String rgIe;
    @Column(name = "rua")
    private String rua;
    @Column(name = "cep")
    private String cep;
    @Column(name = "complemento")
    private String complemento;
    @Column(name = "numero")
    private int numero;
    @Column(name = "telefoneResidencial")
    private String telefoneResidencial;
    @Column(name = "celular")
    private String celular;
    @Column(name = "telefoneRecado")
    private String telefoneRecado;
    @Column(name = "email")
    private String email;
    @Column(name = "login")
    private String login;
    @Column(name = "senha")
    private String senha;
    @Column(name = "condicao")
    private boolean condicao;
    @Column(name = "tipoPessoa")
    private int tipoPessoa;
    @Column (name = "promocao")
    private boolean promocao;
    @Column(name = "sexo")
    private int sexo;
    @Column(name = "bairro")
    private String bairro;
    
    @ManyToOne
    @JoinColumn(name = "idEstado")
    private Estado estado;
    
    @ManyToOne
    @JoinColumn(name = "idCidade")
    private Cidade cidade;
    
    @OneToMany (mappedBy="cliente" , targetEntity=Venda.class)
    private List<Venda> venda;

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the cpfCnpj
     */
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    /**
     * @param cpfCnpj the cpfCnpj to set
     */
    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    /**
     * @return the rgIe
     */
    public String getRgIe() {
        return rgIe;
    }

    /**
     * @param rgIe the rgIe to set
     */
    public void setRgIe(String rgIe) {
        this.rgIe = rgIe;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the telefoneResidencial
     */
    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    /**
     * @param telefoneResidencial the telefoneResidencial to set
     */
    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the telefoneRecado
     */
    public String getTelefoneRecado() {
        return telefoneRecado;
    }

    /**
     * @param telefoneRecado the telefoneRecado to set
     */
    public void setTelefoneRecado(String telefoneRecado) {
        this.telefoneRecado = telefoneRecado;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
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
     * @return the tipoPessoa
     */
    public int getTipoPessoa() {
        return tipoPessoa;
    }

    /**
     * @param tipoPessoa the tipoPessoa to set
     */
    public void setTipoPessoa(int tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
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

    /**
     * @return the cidade
     */
    public Cidade getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the venda
     */
    public List<Venda> getVenda() {
        return venda;
    }

    /**
     * @param venda the venda to set
     */
    public void setVenda(List<Venda> venda) {
        this.venda = venda;
    }

    /**
     * @return the promocao
     */
    public boolean isPromocao() {
        return promocao;
    }

    /**
     * @param promocao the promocao to set
     */
    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

    /**
     * @return the sexo
     */
    public int getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
