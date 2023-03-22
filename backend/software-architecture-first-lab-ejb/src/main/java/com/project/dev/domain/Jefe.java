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
    , @NamedQuery(name = "Jefe.findById", query = "SELECT j FROM Jefe j WHERE j.id = :id")
    , @NamedQuery(name = "Jefe.findByValue", query = "SELECT j FROM Jefe j WHERE j.value = :value")})
public class Jefe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id", nullable = false)
    private Long id;
    @Size(max = 255)
    @Column(name = "value", length = 255)
    private String value;

    public Jefe() {
    }

    public Jefe(Long id) {
        this.id = id;
    }

}
