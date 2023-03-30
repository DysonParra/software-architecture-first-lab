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
@Table(name = "solicitudes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Solicitudes.findAll", query = "SELECT h FROM Solicitudes h")
    , @NamedQuery(name = "Solicitudes.findById", query = "SELECT h FROM Solicitudes h WHERE h.id = :id")
    , @NamedQuery(name = "Solicitudes.findByTitle", query = "SELECT h FROM Solicitudes h WHERE h.title = :title")
    , @NamedQuery(name = "Solicitudes.findByStudent", query = "SELECT h FROM Solicitudes h WHERE h.student = :student")
    , @NamedQuery(name = "Solicitudes.findByJustification", query = "SELECT h FROM Solicitudes h WHERE h.justification = :justification")
    , @NamedQuery(name = "Solicitudes.findByStatus", query = "SELECT h FROM Solicitudes h WHERE h.status = :status")})
public class Solicitudes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 50)
    @Column(name = "title")
    private String title;
    @Size(max = 100)
    @Column(name = "student")
    private String student;
    @Size(max = 255)
    @Column(name = "justification")
    private String justification;
    @Size(max = 20)
    @Column(name = "status")
    private String status;

    public Solicitudes() {
    }

    public Solicitudes(Long id) {
        this.id = id;
    }

}
