/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.dev.ejb;

import com.project.dev.domain.Jefe;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Developer
 */
@Local
public interface JefeManagerLocal {

    List<Jefe> getAllEntities();

    Jefe update(Jefe jefe);

}
