/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Bruna Rossini
 */
@Entity
@Table(name = "movimentacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimentacao.findAll", query = "SELECT m FROM Movimentacao m")
    , @NamedQuery(name = "Movimentacao.findByIdmovimentacao", query = "SELECT m FROM Movimentacao m WHERE m.idmovimentacao = :idmovimentacao")
    , @NamedQuery(name = "Movimentacao.findByValorMovimentacao", query = "SELECT m FROM Movimentacao m WHERE m.valorMovimentacao = :valorMovimentacao")
    , @NamedQuery(name = "Movimentacao.findByDataPagamento", query = "SELECT m FROM Movimentacao m WHERE m.dataPagamento = :dataPagamento")
    , @NamedQuery(name = "Movimentacao.findByDataCadastro", query = "SELECT m FROM Movimentacao m WHERE m.dataCadastro = :dataCadastro")
    , @NamedQuery(name = "Movimentacao.findByObservacaoMovimento", query = "SELECT m FROM Movimentacao m WHERE m.observacaoMovimento = :observacaoMovimento")})
public class Movimentacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idmovimentacao")
    private Integer idmovimentacao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorMovimentacao")
    private Double valorMovimentacao;
    @Column(name = "dataPagamento")
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    @Column(name = "dataCadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;
    @Column(name = "observacaoMovimento")
    private String observacaoMovimento;
    @JoinColumn(name = "idcategoria", referencedColumnName = "idcategoria")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Categoria idcategoria;

    public Movimentacao() {
    }

    public Movimentacao(Integer idmovimentacao) {
        this.idmovimentacao = idmovimentacao;
    }

    public Integer getIdmovimentacao() {
        return idmovimentacao;
    }

    public void setIdmovimentacao(Integer idmovimentacao) {
        this.idmovimentacao = idmovimentacao;
    }

    public Double getValorMovimentacao() {
        return valorMovimentacao;
    }

    public void setValorMovimentacao(Double valorMovimentacao) {
        this.valorMovimentacao = valorMovimentacao;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getObservacaoMovimento() {
        return observacaoMovimento;
    }

    public void setObservacaoMovimento(String observacaoMovimento) {
        this.observacaoMovimento = observacaoMovimento;
    }

    public Categoria getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Categoria idcategoria) {
        this.idcategoria = idcategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmovimentacao != null ? idmovimentacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimentacao)) {
            return false;
        }
        Movimentacao other = (Movimentacao) object;
        if ((this.idmovimentacao == null && other.idmovimentacao != null) || (this.idmovimentacao != null && !this.idmovimentacao.equals(other.idmovimentacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.modelo.Movimentacao[ idmovimentacao=" + idmovimentacao + " ]";
    }
    
}
