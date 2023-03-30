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
@Table(name = "jefe", catalog = "sample", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jefe.findAll", query = "SELECT j FROM Jefe j")
    , @NamedQuery(name = "Jefe.findByCedula", query = "SELECT j FROM Jefe j WHERE j.cedula = :cedula")
    , @NamedQuery(name = "Jefe.findByNombre", query = "SELECT j FROM Jefe j WHERE j.nombre = :nombre")
    , @NamedQuery(name = "Jefe.findByApellido", query = "SELECT j FROM Jefe j WHERE j.apellido = :apellido")
    , @NamedQuery(name = "Jefe.findByCorreoInstitucional", query = "SELECT j FROM Jefe j WHERE j.correoInstitucional = :correoInstitucional")
    , @NamedQuery(name = "Jefe.findByCorreoPersonal", query = "SELECT j FROM Jefe j WHERE j.correoPersonal = :correoPersonal")
    , @NamedQuery(name = "Jefe.findByTelefono", query = "SELECT j FROM Jefe j WHERE j.telefono = :telefono")
    , @NamedQuery(name = "Jefe.findByCodigoPrograma", query = "SELECT j FROM Jefe j WHERE j.codigoPrograma = :codigoPrograma")})
public class Jefe implements Serializable {

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
    @Column(name = "codigo_programa")
    private Long codigoPrograma;

    public Jefe() {
    }

    public Jefe(Long cedula) {
        this.cedula = cedula;
    }

}
