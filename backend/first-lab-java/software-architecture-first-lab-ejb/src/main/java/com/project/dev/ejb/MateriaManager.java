/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.dev.ejb;

import com.project.dev.domain.Materia;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Developer
 */
@Stateless
public class MateriaManager implements MateriaManagerLocal {

    @PersistenceContext(unitName = "com.project.dev_software-architecture-first-lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    public List<Materia> getAllEntities() {
        Query query = em.createNamedQuery("Materia.findAll");
        return query.getResultList();
    }

    @Override
    public Materia update(Materia materia) {
        return em.merge(materia);
    }

}
