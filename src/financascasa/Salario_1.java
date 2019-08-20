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
@Table(name = "salario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salario_1.findAll", query = "SELECT s FROM Salario_1 s")
    , @NamedQuery(name = "Salario_1.findByCodigoSalario", query = "SELECT s FROM Salario_1 s WHERE s.codigoSalario = :codigoSalario")
    , @NamedQuery(name = "Salario_1.findByEmpresaSalario", query = "SELECT s FROM Salario_1 s WHERE s.empresaSalario = :empresaSalario")
    , @NamedQuery(name = "Salario_1.findByValorSalario", query = "SELECT s FROM Salario_1 s WHERE s.valorSalario = :valorSalario")
    , @NamedQuery(name = "Salario_1.findByDataRecebimentoSalario", query = "SELECT s FROM Salario_1 s WHERE s.dataRecebimentoSalario = :dataRecebimentoSalario")
    , @NamedQuery(name = "Salario_1.findByCicloRecebimentoSalario", query = "SELECT s FROM Salario_1 s WHERE s.cicloRecebimentoSalario = :cicloRecebimentoSalario")})
public class Salario_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoSalario")
    private Integer codigoSalario;
    @Column(name = "empresaSalario")
    private String empresaSalario;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorSalario")
    private Double valorSalario;
    @Column(name = "dataRecebimentoSalario")
    @Temporal(TemporalType.DATE)
    private Date dataRecebimentoSalario;
    @Column(name = "cicloRecebimentoSalario")
    private String cicloRecebimentoSalario;

    public Salario_1() {
    }

    public Salario_1(Integer codigoSalario) {
        this.codigoSalario = codigoSalario;
    }

    public Integer getCodigoSalario() {
        return codigoSalario;
    }

    public void setCodigoSalario(Integer codigoSalario) {
        this.codigoSalario = codigoSalario;
    }

    public String getEmpresaSalario() {
        return empresaSalario;
    }

    public void setEmpresaSalario(String empresaSalario) {
        this.empresaSalario = empresaSalario;
    }

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public Date getDataRecebimentoSalario() {
        return dataRecebimentoSalario;
    }

    public void setDataRecebimentoSalario(Date dataRecebimentoSalario) {
        this.dataRecebimentoSalario = dataRecebimentoSalario;
    }

    public String getCicloRecebimentoSalario() {
        return cicloRecebimentoSalario;
    }

    public void setCicloRecebimentoSalario(String cicloRecebimentoSalario) {
        this.cicloRecebimentoSalario = cicloRecebimentoSalario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoSalario != null ? codigoSalario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salario_1)) {
            return false;
        }
        Salario_1 other = (Salario_1) object;
        if ((this.codigoSalario == null && other.codigoSalario != null) || (this.codigoSalario != null && !this.codigoSalario.equals(other.codigoSalario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "financascasa.Salario_1[ codigoSalario=" + codigoSalario + " ]";
    }

}
