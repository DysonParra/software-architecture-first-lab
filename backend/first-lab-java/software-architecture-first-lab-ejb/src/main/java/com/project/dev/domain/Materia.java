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
@Table(name = "materia", catalog = "sample", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materia.findAll", query = "SELECT m FROM Materia m")
    , @NamedQuery(name = "Materia.findByCodigo", query = "SELECT m FROM Materia m WHERE m.codigo = :codigo")
    , @NamedQuery(name = "Materia.findByCantidadCreditos", query = "SELECT m FROM Materia m WHERE m.cantidadCreditos = :cantidadCreditos")
    , @NamedQuery(name = "Materia.findByNombre", query = "SELECT m FROM Materia m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Materia.findByPrerequisito", query = "SELECT m FROM Materia m WHERE m.prerequisito = :prerequisito")
    , @NamedQuery(name = "Materia.findByCorrequisito", query = "SELECT m FROM Materia m WHERE m.correquisito = :correquisito")})
public class Materia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private Long codigo;
    @Column(name = "cantidad_creditos")
    private Long cantidadCreditos;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "prerequisito")
    private Long prerequisito;
    @Column(name = "correquisito")
    private Long correquisito;

    public Materia() {
    }

    public Materia(Long codigo) {
        this.codigo = codigo;
    }

}
