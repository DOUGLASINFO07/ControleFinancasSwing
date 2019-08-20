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
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario_1.findAll", query = "SELECT u FROM Usuario_1 u")
    , @NamedQuery(name = "Usuario_1.findByCodigoUsuario", query = "SELECT u FROM Usuario_1 u WHERE u.codigoUsuario = :codigoUsuario")
    , @NamedQuery(name = "Usuario_1.findByNomeUsuario", query = "SELECT u FROM Usuario_1 u WHERE u.nomeUsuario = :nomeUsuario")
    , @NamedQuery(name = "Usuario_1.findByTelefoneUsuario", query = "SELECT u FROM Usuario_1 u WHERE u.telefoneUsuario = :telefoneUsuario")
    , @NamedQuery(name = "Usuario_1.findByEmailUsuario", query = "SELECT u FROM Usuario_1 u WHERE u.emailUsuario = :emailUsuario")
    , @NamedQuery(name = "Usuario_1.findByLoginUsuario", query = "SELECT u FROM Usuario_1 u WHERE u.loginUsuario = :loginUsuario")
    , @NamedQuery(name = "Usuario_1.findBySenhaUsuario", query = "SELECT u FROM Usuario_1 u WHERE u.senhaUsuario = :senhaUsuario")})
public class Usuario_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoUsuario")
    private Integer codigoUsuario;
    @Column(name = "nomeUsuario")
    private String nomeUsuario;
    @Column(name = "telefoneUsuario")
    private String telefoneUsuario;
    @Column(name = "emailUsuario")
    private String emailUsuario;
    @Column(name = "loginUsuario")
    private String loginUsuario;
    @Column(name = "senhaUsuario")
    private String senhaUsuario;

    public Usuario_1() {
    }

    public Usuario_1(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoUsuario != null ? codigoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario_1)) {
            return false;
        }
        Usuario_1 other = (Usuario_1) object;
        if ((this.codigoUsuario == null && other.codigoUsuario != null) || (this.codigoUsuario != null && !this.codigoUsuario.equals(other.codigoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "financascasa.Usuario_1[ codigoUsuario=" + codigoUsuario + " ]";
    }

}
