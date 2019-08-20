/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package financascasa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dougl
 */
@Entity
@Table(name = "empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresa_1.findAll", query = "SELECT e FROM Empresa_1 e")
    , @NamedQuery(name = "Empresa_1.findByCodigoEmpresa", query = "SELECT e FROM Empresa_1 e WHERE e.codigoEmpresa = :codigoEmpresa")
    , @NamedQuery(name = "Empresa_1.findByNome", query = "SELECT e FROM Empresa_1 e WHERE e.nome = :nome")
    , @NamedQuery(name = "Empresa_1.findByTipoServico", query = "SELECT e FROM Empresa_1 e WHERE e.tipoServico = :tipoServico")
    , @NamedQuery(name = "Empresa_1.findByTelefoneEmpresa", query = "SELECT e FROM Empresa_1 e WHERE e.telefoneEmpresa = :telefoneEmpresa")
    , @NamedQuery(name = "Empresa_1.findBySiteEmpresa", query = "SELECT e FROM Empresa_1 e WHERE e.siteEmpresa = :siteEmpresa")
    , @NamedQuery(name = "Empresa_1.findByEmailEmpresa", query = "SELECT e FROM Empresa_1 e WHERE e.emailEmpresa = :emailEmpresa")
    , @NamedQuery(name = "Empresa_1.findByLogin", query = "SELECT e FROM Empresa_1 e WHERE e.login = :login")
    , @NamedQuery(name = "Empresa_1.findBySenha", query = "SELECT e FROM Empresa_1 e WHERE e.senha = :senha")})
public class Empresa_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoEmpresa")
    private Integer codigoEmpresa;
    @Column(name = "nome")
    private String nome;
    @Column(name = "tipoServico")
    private String tipoServico;
    @Column(name = "telefoneEmpresa")
    private String telefoneEmpresa;
    @Column(name = "siteEmpresa")
    private String siteEmpresa;
    @Column(name = "emailEmpresa")
    private String emailEmpresa;
    @Column(name = "login")
    private String login;
    @Column(name = "senha")
    private String senha;

    public Empresa_1() {
    }

    public Empresa_1(Integer codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public Integer getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(Integer codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getTelefoneEmpresa() {
        return telefoneEmpresa;
    }

    public void setTelefoneEmpresa(String telefoneEmpresa) {
        this.telefoneEmpresa = telefoneEmpresa;
    }

    public String getSiteEmpresa() {
        return siteEmpresa;
    }

    public void setSiteEmpresa(String siteEmpresa) {
        this.siteEmpresa = siteEmpresa;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoEmpresa != null ? codigoEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa_1)) {
            return false;
        }
        Empresa_1 other = (Empresa_1) object;
        if ((this.codigoEmpresa == null && other.codigoEmpresa != null) || (this.codigoEmpresa != null && !this.codigoEmpresa.equals(other.codigoEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "financascasa.Empresa_1[ codigoEmpresa=" + codigoEmpresa + " ]";
    }

}
