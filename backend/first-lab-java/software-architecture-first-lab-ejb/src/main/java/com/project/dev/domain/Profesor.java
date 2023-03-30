/*
 * @fileoverview    {ClassName}
 *
 * @version         1.0
 */
package com.project.dev.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name = "profesor", catalog = "sample", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profesor.findAll", query = "SELECT p FROM Profesor p")
    , @NamedQuery(name = "Profesor.findByCedula", query = "SELECT p FROM Profesor p WHERE p.cedula = :cedula")
    , @NamedQuery(name = "Profesor.findByNombre", query = "SELECT p FROM Profesor p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Profesor.findByApellido", query = "SELECT p FROM Profesor p WHERE p.apellido = :apellido")
    , @NamedQuery(name = "Profesor.findByCorreoInstitucional", query = "SELECT p FROM Profesor p WHERE p.correoInstitucional = :correoInstitucional")
    , @NamedQuery(name = "Profesor.findByCorreoPersonal", query = "SELECT p FROM Profesor p WHERE p.correoPersonal = :correoPersonal")
    , @NamedQuery(name = "Profesor.findByTelefono", query = "SELECT p FROM Profesor p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "Profesor.findByFechaVinculacion", query = "SELECT p FROM Profesor p WHERE p.fechaVinculacion = :fechaVinculacion")})
public class Profesor implements Serializable {

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
    @Column(name = "fecha_vinculacion")
    @Temporal(TemporalType.DATE)
    private Date fechaVinculacion;

    public Profesor() {
    }

    public Profesor(Long cedula) {
        this.cedula = cedula;
    }

}
