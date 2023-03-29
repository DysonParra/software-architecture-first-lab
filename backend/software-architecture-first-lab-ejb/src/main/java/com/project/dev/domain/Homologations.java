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
@Table(name = "homologations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Homologations.findAll", query = "SELECT h FROM Homologations h")
    , @NamedQuery(name = "Homologations.findById", query = "SELECT h FROM Homologations h WHERE h.id = :id")
    , @NamedQuery(name = "Homologations.findByTitle", query = "SELECT h FROM Homologations h WHERE h.title = :title")
    , @NamedQuery(name = "Homologations.findByStudent", query = "SELECT h FROM Homologations h WHERE h.student = :student")
    , @NamedQuery(name = "Homologations.findByJustification", query = "SELECT h FROM Homologations h WHERE h.justification = :justification")
    , @NamedQuery(name = "Homologations.findByStatus", query = "SELECT h FROM Homologations h WHERE h.status = :status")})
public class Homologations implements Serializable {

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

    public Homologations() {
    }

    public Homologations(Long id) {
        this.id = id;
    }

}
