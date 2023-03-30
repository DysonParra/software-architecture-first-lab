/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.dev.ejb;

import com.project.dev.domain.Solicitudes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Developer
 */
@Local
public interface SolicitudesManagerLocal {

    List<Solicitudes> getAllEntities();

    Solicitudes update(Solicitudes solicitudes);

}
