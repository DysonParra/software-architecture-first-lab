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
@Table(name = "pensum", catalog = "sample", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pensum.findAll", query = "SELECT p FROM Pensum p")
    , @NamedQuery(name = "Pensum.findByCodigo", query = "SELECT p FROM Pensum p WHERE p.codigo = :codigo")
    , @NamedQuery(name = "Pensum.findByNombrePrograma", query = "SELECT p FROM Pensum p WHERE p.nombrePrograma = :nombrePrograma")
    , @NamedQuery(name = "Pensum.findByVersion", query = "SELECT p FROM Pensum p WHERE p.version = :version")})
public class Pensum implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private Long codigo;
    @Size(max = 255)
    @Column(name = "nombre_programa")
    private String nombrePrograma;
    @Column(name = "version")
    private Long version;

    public Pensum() {
    }

    public Pensum(Long codigo) {
        this.codigo = codigo;
    }

}
