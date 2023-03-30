/*
 * @fileoverview    {ClassName}
 *
 * @version         1.0
 */
package com.project.dev.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 *
 * @author Developer
 */
@Data
@Entity
@Table(name = "administrador", catalog = "sample", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrador.findAll", query = "SELECT a FROM Administrador a")
    , @NamedQuery(name = "Administrador.findByCedula", query = "SELECT a FROM Administrador a WHERE a.cedula = :cedula")
    , @NamedQuery(name = "Administrador.findByNombre", query = "SELECT a FROM Administrador a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Administrador.findByApellido", query = "SELECT a FROM Administrador a WHERE a.apellido = :apellido")
    , @NamedQuery(name = "Administrador.findByCorreoInstitucional", query = "SELECT a FROM Administrador a WHERE a.correoInstitucional = :correoInstitucional")
    , @NamedQuery(name = "Administrador.findByCorreoPersonal", query = "SELECT a FROM Administrador a WHERE a.correoPersonal = :correoPersonal")
    , @NamedQuery(name = "Administrador.findByTelefono", query = "SELECT a FROM Administrador a WHERE a.telefono = :telefono")})
public class Administrador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cedula")
    private Long cedula;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 255)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 255)
    @Column(name = "correo_institucional")
    private String correoInstitucional;
    @Size(max = 255)
    @Column(name = "correo_personal")
    private String correoPersonal;
    @Column(name = "telefono")
    private Long telefono;

    public Administrador() {
    }

    public Administrador(Long cedula) {
        this.cedula = cedula;
    }

}
