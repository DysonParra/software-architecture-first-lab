/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.dev.ejb;

import com.project.dev.domain.Pensum;
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
public class PensumManager implements PensumManagerLocal {

    @PersistenceContext(unitName = "com.project.dev_software-architecture-first-lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    public List<Pensum> getAllEntities() {
        Query query = em.createNamedQuery("Pensum.findAll");
        return query.getResultList();
    }

    @Override
    public Pensum update(Pensum pensum) {
        return em.merge(pensum);
    }

}
