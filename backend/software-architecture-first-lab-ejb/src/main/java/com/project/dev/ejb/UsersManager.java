/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.dev.ejb;

import com.project.dev.domain.Users;
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
public class UsersManager implements UsersManagerLocal {

    @PersistenceContext(unitName = "com.project.dev_software-architecture-first-lab-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    public List<Users> getAllEntities() {
        Query query = em.createNamedQuery("Users.findAll");
        return query.getResultList();
    }

    @Override
    public Users update(Users users) {
        return em.merge(users);
    }

}
