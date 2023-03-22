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
@Table(name = "comite_asuntos_estudiantiles", catalog = "sample", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComiteAsuntosEstudiantiles.findAll", query = "SELECT c FROM ComiteAsuntosEstudiantiles c")
    , @NamedQuery(name = "ComiteAsuntosEstudiantiles.findById", query = "SELECT c FROM ComiteAsuntosEstudiantiles c WHERE c.id = :id")
    , @NamedQuery(name = "ComiteAsuntosEstudiantiles.findByValue", query = "SELECT c FROM ComiteAsuntosEstudiantiles c WHERE c.value = :value")})
public class ComiteAsuntosEstudiantiles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id", nullable = false)
    private Long id;
    @Size(max = 255)
    @Column(name = "value", length = 255)
    private String value;

    public ComiteAsuntosEstudiantiles() {
    }

    public ComiteAsuntosEstudiantiles(Long id) {
        this.id = id;
    }

}
