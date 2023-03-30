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
@Table(name = "estudiante", catalog = "sample", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiante.findAll", query = "SELECT e FROM Estudiante e")
    , @NamedQuery(name = "Estudiante.findByCedula", query = "SELECT e FROM Estudiante e WHERE e.cedula = :cedula")
    , @NamedQuery(name = "Estudiante.findByNombre", query = "SELECT e FROM Estudiante e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Estudiante.findByApellido", query = "SELECT e FROM Estudiante e WHERE e.apellido = :apellido")
    , @NamedQuery(name = "Estudiante.findByCorreoInstitucional", query = "SELECT e FROM Estudiante e WHERE e.correoInstitucional = :correoInstitucional")
    , @NamedQuery(name = "Estudiante.findByCorreoPersonal", query = "SELECT e FROM Estudiante e WHERE e.correoPersonal = :correoPersonal")
    , @NamedQuery(name = "Estudiante.findByTelefono", query = "SELECT e FROM Estudiante e WHERE e.telefono = :telefono")
    , @NamedQuery(name = "Estudiante.findByFechaIngreso", query = "SELECT e FROM Estudiante e WHERE e.fechaIngreso = :fechaIngreso")
    , @NamedQuery(name = "Estudiante.findByEstrato", query = "SELECT e FROM Estudiante e WHERE e.estrato = :estrato")})
public class Estudiante implements Serializable {

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
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    @Size(max = 255)
    @Column(name = "estrato")
    private String estrato;

    public Estudiante() {
    }

    public Estudiante(Long cedula) {
        this.cedula = cedula;
    }

}
