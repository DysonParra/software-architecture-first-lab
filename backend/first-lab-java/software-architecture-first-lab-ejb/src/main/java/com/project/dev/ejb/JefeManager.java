/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.dev.ejb;

import com.project.dev.domain.Jefe;
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
public class JefeManager implements JefeManagerLocal {

    @PersistenceContext(unitName = "com.project.dev_software-architecture-first-lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    public List<Jefe> getAllEntities() {
        Query query = em.createNamedQuery("Jefe.findAll");
        return query.getResultList();
    }

    @Override
    public Jefe update(Jefe jefe) {
        return em.merge(jefe);
    }

}
