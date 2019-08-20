/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package financascasa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dougl
 */
@Entity
@Table(name = "boleto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Boleto_1.findAll", query = "SELECT b FROM Boleto_1 b")
    , @NamedQuery(name = "Boleto_1.findByCodigoBoleto", query = "SELECT b FROM Boleto_1 b WHERE b.codigoBoleto = :codigoBoleto")
    , @NamedQuery(name = "Boleto_1.findByEmpresaBoleto", query = "SELECT b FROM Boleto_1 b WHERE b.empresaBoleto = :empresaBoleto")
    , @NamedQuery(name = "Boleto_1.findByServicoBoleto", query = "SELECT b FROM Boleto_1 b WHERE b.servicoBoleto = :servicoBoleto")
    , @NamedQuery(name = "Boleto_1.findByValorPagarBoleto", query = "SELECT b FROM Boleto_1 b WHERE b.valorPagarBoleto = :valorPagarBoleto")
    , @NamedQuery(name = "Boleto_1.findByVencimentoBoleto", query = "SELECT b FROM Boleto_1 b WHERE b.vencimentoBoleto = :vencimentoBoleto")
    , @NamedQuery(name = "Boleto_1.findByParcelasBoleto", query = "SELECT b FROM Boleto_1 b WHERE b.parcelasBoleto = :parcelasBoleto")
    , @NamedQuery(name = "Boleto_1.findByNumeroParcelasBoleto", query = "SELECT b FROM Boleto_1 b WHERE b.numeroParcelasBoleto = :numeroParcelasBoleto")
    , @NamedQuery(name = "Boleto_1.findByCicloBoleto", query = "SELECT b FROM Boleto_1 b WHERE b.cicloBoleto = :cicloBoleto")
    , @NamedQuery(name = "Boleto_1.findByFormaPagamentoBoleto", query = "SELECT b FROM Boleto_1 b WHERE b.formaPagamentoBoleto = :formaPagamentoBoleto")
    , @NamedQuery(name = "Boleto_1.findByDataPagamentoBoleto", query = "SELECT b FROM Boleto_1 b WHERE b.dataPagamentoBoleto = :dataPagamentoBoleto")
    , @NamedQuery(name = "Boleto_1.findByValorPagoBoleto", query = "SELECT b FROM Boleto_1 b WHERE b.valorPagoBoleto = :valorPagoBoleto")
    , @NamedQuery(name = "Boleto_1.findByLocalPagamentoBoleto", query = "SELECT b FROM Boleto_1 b WHERE b.localPagamentoBoleto = :localPagamentoBoleto")
    , @NamedQuery(name = "Boleto_1.findByPagadorBoleto", query = "SELECT b FROM Boleto_1 b WHERE b.pagadorBoleto = :pagadorBoleto")})
public class Boleto_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoBoleto")
    private Integer codigoBoleto;
    @Column(name = "empresaBoleto")
    private String empresaBoleto;
    @Column(name = "servicoBoleto")
    private String servicoBoleto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorPagarBoleto")
    private Double valorPagarBoleto;
    @Column(name = "vencimentoBoleto")
    @Temporal(TemporalType.DATE)
    private Date vencimentoBoleto;
    @Column(name = "parcelasBoleto")
    private Integer parcelasBoleto;
    @Column(name = "numeroParcelasBoleto")
    private String numeroParcelasBoleto;
    @Column(name = "cicloBoleto")
    private String cicloBoleto;
    @Column(name = "formaPagamentoBoleto")
    private String formaPagamentoBoleto;
    @Column(name = "dataPagamentoBoleto")
    @Temporal(TemporalType.DATE)
    private Date dataPagamentoBoleto;
    @Column(name = "valorPagoBoleto")
    private Double valorPagoBoleto;
    @Column(name = "localPagamentoBoleto")
    private String localPagamentoBoleto;
    @Column(name = "pagadorBoleto")
    private String pagadorBoleto;

    public Boleto_1() {
    }

    public Boleto_1(Integer codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    public Integer getCodigoBoleto() {
        return codigoBoleto;
    }

    public void setCodigoBoleto(Integer codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    public String getEmpresaBoleto() {
        return empresaBoleto;
    }

    public void setEmpresaBoleto(String empresaBoleto) {
        this.empresaBoleto = empresaBoleto;
    }

    public String getServicoBoleto() {
        return servicoBoleto;
    }

    public void setServicoBoleto(String servicoBoleto) {
        this.servicoBoleto = servicoBoleto;
    }

    public Double getValorPagarBoleto() {
        return valorPagarBoleto;
    }

    public void setValorPagarBoleto(Double valorPagarBoleto) {
        this.valorPagarBoleto = valorPagarBoleto;
    }

    public Date getVencimentoBoleto() {
        return vencimentoBoleto;
    }

    public void setVencimentoBoleto(Date vencimentoBoleto) {
        this.vencimentoBoleto = vencimentoBoleto;
    }

    public Integer getParcelasBoleto() {
        return parcelasBoleto;
    }

    public void setParcelasBoleto(Integer parcelasBoleto) {
        this.parcelasBoleto = parcelasBoleto;
    }

    public String getNumeroParcelasBoleto() {
        return numeroParcelasBoleto;
    }

    public void setNumeroParcelasBoleto(String numeroParcelasBoleto) {
        this.numeroParcelasBoleto = numeroParcelasBoleto;
    }

    public String getCicloBoleto() {
        return cicloBoleto;
    }

    public void setCicloBoleto(String cicloBoleto) {
        this.cicloBoleto = cicloBoleto;
    }

    public String getFormaPagamentoBoleto() {
        return formaPagamentoBoleto;
    }

    public void setFormaPagamentoBoleto(String formaPagamentoBoleto) {
        this.formaPagamentoBoleto = formaPagamentoBoleto;
    }

    public Date getDataPagamentoBoleto() {
        return dataPagamentoBoleto;
    }

    public void setDataPagamentoBoleto(Date dataPagamentoBoleto) {
        this.dataPagamentoBoleto = dataPagamentoBoleto;
    }

    public Double getValorPagoBoleto() {
        return valorPagoBoleto;
    }

    public void setValorPagoBoleto(Double valorPagoBoleto) {
        this.valorPagoBoleto = valorPagoBoleto;
    }

    public String getLocalPagamentoBoleto() {
        return localPagamentoBoleto;
    }

    public void setLocalPagamentoBoleto(String localPagamentoBoleto) {
        this.localPagamentoBoleto = localPagamentoBoleto;
    }

    public String getPagadorBoleto() {
        return pagadorBoleto;
    }

    public void setPagadorBoleto(String pagadorBoleto) {
        this.pagadorBoleto = pagadorBoleto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoBoleto != null ? codigoBoleto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Boleto_1)) {
            return false;
        }
        Boleto_1 other = (Boleto_1) object;
        if ((this.codigoBoleto == null && other.codigoBoleto != null) || (this.codigoBoleto != null && !this.codigoBoleto.equals(other.codigoBoleto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "financascasa.Boleto_1[ codigoBoleto=" + codigoBoleto + " ]";
    }

}
