/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 0van
 */
@Entity
@Table(name = "solicitud_de_compras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SolicitudDeCompras.findAll", query = "SELECT s FROM SolicitudDeCompras s"),
    @NamedQuery(name = "SolicitudDeCompras.findByIdSolicitud", query = "SELECT s FROM SolicitudDeCompras s WHERE s.idSolicitud = :idSolicitud"),
    @NamedQuery(name = "SolicitudDeCompras.findByEstado", query = "SELECT s FROM SolicitudDeCompras s WHERE s.estado = :estado"),
    @NamedQuery(name = "SolicitudDeCompras.findByFecha", query = "SELECT s FROM SolicitudDeCompras s WHERE s.fecha = :fecha")})
public class SolicitudDeCompras implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_solicitud")
    private Integer idSolicitud;
    @Size(max = 20)
    @Column(name = "estado")
    private String estado;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(optional = false)
    private Productos idProducto;

    public SolicitudDeCompras() {
    }

    public SolicitudDeCompras(Integer idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Integer getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Integer idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Productos getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Productos idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSolicitud != null ? idSolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudDeCompras)) {
            return false;
        }
        SolicitudDeCompras other = (SolicitudDeCompras) object;
        if ((this.idSolicitud == null && other.idSolicitud != null) || (this.idSolicitud != null && !this.idSolicitud.equals(other.idSolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.SolicitudDeCompras[ idSolicitud=" + idSolicitud + " ]";
    }
    
}
