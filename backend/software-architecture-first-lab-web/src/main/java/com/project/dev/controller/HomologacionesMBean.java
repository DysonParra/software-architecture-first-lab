/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.dev.controller;

import com.project.dev.domain.Administrador;
import com.project.dev.domain.ComiteAsuntosEstudiantiles;
import com.project.dev.domain.Customer;
import com.project.dev.domain.Estudiante;
import com.project.dev.domain.Jefe;
import com.project.dev.domain.Materia;
import com.project.dev.domain.Pensum;
import com.project.dev.domain.Profesor;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Developer
 */
public class HomologacionesMBean implements Serializable {

    @EJB
    private com.project.dev.ejb.CustomerManagerLocal customerManager;

    @EJB
    private com.project.dev.ejb.AdministradorManagerLocal administradorManager;
    @EJB
    private com.project.dev.ejb.ComiteAsuntosEstudiantilesManagerLocal comiteAsuntosEstudiantilesManager;
    @EJB
    private com.project.dev.ejb.EstudianteManagerLocal estudianteManager;
    @EJB
    private com.project.dev.ejb.JefeManagerLocal jefeManager;
    @EJB
    private com.project.dev.ejb.MateriaManagerLocal materiaManager;
    @EJB
    private com.project.dev.ejb.PensumManagerLocal pensumManager;
    @EJB
    private com.project.dev.ejb.ProfesorManagerLocal profesorManager;

    // Model properties:
    // For update in form and view data in dynamic table.
    private Customer customer;
    private List<Customer> customerList;

    // For update in form and view data in dynamic table.
    private Administrador administrador;
    private List<Administrador> administradorList;

    // For update in form and view data in dynamic table.
    private ComiteAsuntosEstudiantiles comiteAsuntosEstudiantiles;
    private List<ComiteAsuntosEstudiantiles> comiteAsuntosEstudiantilesList;

    // For update in form and view data in dynamic table.
    private Estudiante estudiante;
    private List<Estudiante> estudianteList;

    // For update in form and view data in dynamic table.
    private Jefe jefe;
    private List<Jefe> jefeList;

    // For update in form and view data in dynamic table.
    private Materia materia;
    private List<Materia> materiaList;

    // For update in form and view data in dynamic table.
    private Pensum pensum;
    private List<Pensum> pensumList;

    // For update in form and view data in dynamic table.
    private Profesor profesor;
    private List<Profesor> profesorList;

    /**
     * Creates a new instance of HomologacionesMBean
     */
    public HomologacionesMBean() {
    }

    /**
     * Action handler
     *
     * @return main view.
     */
    public String showIndex() {
        return "INDEX";
    }

    /**
     * Get customer list and add to data table JSF.
     *
     * @return
     */
    public List<Customer> getCustomerList() {
        if (customerList == null || customerList.isEmpty())
            refreshCustomer();
        return customerList;
    }

    /**
     * Get detail of each customer on the form.
     *
     * @return
     */
    public Customer getCustomerDetails() {
        return customer;
    }

    /**
     * Action handler
     *
     * @return customer list.
     */
    public String showCustomerList() {
        return "CUSTOMER LIST";
    }

    /**
     * Action handler called when a row of the table is clicked on the id.
     *
     * @param customer
     * @return
     */
    public String showCustomerDetails(Customer customer) {
        this.customer = customer;
        return "CUSTOMER DETAILS";
    }

    /**
     * Action handler that updates customer list on view.
     */
    public void refreshCustomer() {
        customerList = customerManager.getAllEntities();
    }

    /**
     * Action handler that updates the customer model on the database. Called
     * when update button is clicked.
     *
     * @return customer list.
     */
    public String updateCustomer() {
        customer = customerManager.update(customer);
        return "CUSTOMER SAVED";
    }

    /**
     * Get administrador list and add to data table JSF.
     *
     * @return
     */
    public List<Administrador> getAdministradorList() {
        if (administradorList == null || administradorList.isEmpty())
            refreshAdministrador();
        return administradorList;
    }

    /**
     * Get detail of each administrador on the form.
     *
     * @return
     */
    public Administrador getAdministradorDetails() {
        return administrador;
    }

    /**
     * Action handler
     *
     * @return administrador list.
     */
    public String showAdministradorList() {
        return "ADMINISTRADOR LIST";
    }

    /**
     * Action handler called when a row of the table is clicked on the id.
     *
     * @param administrador
     * @return
     */
    public String showAdministradorDetails(Administrador administrador) {
        this.administrador = administrador;
        return "ADMINISTRADOR DETAILS";
    }

    /**
     * Action handler that updates administrador list on view.
     */
    public void refreshAdministrador() {
        administradorList = administradorManager.getAllEntities();
    }

    /**
     * Action handler that updates the administrador model on the database.
     * Called when update button is clicked.
     *
     * @return administrador list.
     */
    public String updateAdministrador() {
        administrador = administradorManager.update(administrador);
        return "ADMINISTRADOR SAVED";
    }

    /**
     * Get comiteAsuntosEstudiantiles list and add to data table JSF.
     *
     * @return
     */
    public List<ComiteAsuntosEstudiantiles> getComiteAsuntosEstudiantilesList() {
        if (comiteAsuntosEstudiantilesList == null || comiteAsuntosEstudiantilesList.isEmpty())
            refreshComiteAsuntosEstudiantiles();
        return comiteAsuntosEstudiantilesList;
    }

    /**
     * Get detail of each comiteAsuntosEstudiantiles on the form.
     *
     * @return
     */
    public ComiteAsuntosEstudiantiles getComiteAsuntosEstudiantilesDetails() {
        return comiteAsuntosEstudiantiles;
    }

    /**
     * Action handler
     *
     * @return comiteAsuntosEstudiantiles list.
     */
    public String showComiteAsuntosEstudiantilesList() {
        return "COMITE ASUNTOS ESTUDIANTILES LIST";
    }

    /**
     * Action handler called when a row of the table is clicked on the id.
     *
     * @param comiteAsuntosEstudiantiles
     * @return
     */
    public String showComiteAsuntosEstudiantilesDetails(ComiteAsuntosEstudiantiles comiteAsuntosEstudiantiles) {
        this.comiteAsuntosEstudiantiles = comiteAsuntosEstudiantiles;
        return "COMITE ASUNTOS ESTUDIANTILES DETAILS";
    }

    /**
     * Action handler that updates comiteAsuntosEstudiantiles list on view.
     */
    public void refreshComiteAsuntosEstudiantiles() {
        comiteAsuntosEstudiantilesList = comiteAsuntosEstudiantilesManager.getAllEntities();
    }

    /**
     * Action handler that updates the comiteAsuntosEstudiantiles model on the
     * database. Called when update button is clicked.
     *
     * @return comiteAsuntosEstudiantiles list.
     */
    public String updateComiteAsuntosEstudiantiles() {
        comiteAsuntosEstudiantiles = comiteAsuntosEstudiantilesManager.update(comiteAsuntosEstudiantiles);
        return "COMITE ASUNTOS ESTUDIANTILES SAVED";
    }

    /**
     * Get estudiante list and add to data table JSF.
     *
     * @return
     */
    public List<Estudiante> getEstudianteList() {
        if (estudianteList == null || estudianteList.isEmpty())
            refreshEstudiante();
        return estudianteList;
    }

    /**
     * Get detail of each estudiante on the form.
     *
     * @return
     */
    public Estudiante getEstudianteDetails() {
        return estudiante;
    }

    /**
     * Action handler
     *
     * @return estudiante list.
     */
    public String showEstudianteList() {
        return "ESTUDIANTE LIST";
    }

    /**
     * Action handler called when a row of the table is clicked on the id.
     *
     * @param estudiante
     * @return
     */
    public String showEstudianteDetails(Estudiante estudiante) {
        this.estudiante = estudiante;
        return "ESTUDIANTE DETAILS";
    }

    /**
     * Action handler that updates estudiante list on view.
     */
    public void refreshEstudiante() {
        estudianteList = estudianteManager.getAllEntities();
    }

    /**
     * Action handler that updates the estudiante model on the database. Called
     * when update button is clicked.
     *
     * @return estudiante list.
     */
    public String updateEstudiante() {
        estudiante = estudianteManager.update(estudiante);
        return "ESTUDIANTE SAVED";
    }

    /**
     * Get jefe list and add to data table JSF.
     *
     * @return
     */
    public List<Jefe> getJefeList() {
        if (jefeList == null || jefeList.isEmpty())
            refreshJefe();
        return jefeList;
    }

    /**
     * Get detail of each jefe on the form.
     *
     * @return
     */
    public Jefe getJefeDetails() {
        return jefe;
    }

    /**
     * Action handler
     *
     * @return jefe list.
     */
    public String showJefeList() {
        return "JEFE LIST";
    }

    /**
     * Action handler called when a row of the table is clicked on the id.
     *
     * @param jefe
     * @return
     */
    public String showJefeDetails(Jefe jefe) {
        this.jefe = jefe;
        return "JEFE DETAILS";
    }

    /**
     * Action handler that updates jefe list on view.
     */
    public void refreshJefe() {
        jefeList = jefeManager.getAllEntities();
    }

    /**
     * Action handler that updates the jefe model on the database. Called when
     * update button is clicked.
     *
     * @return jefe list.
     */
    public String updateJefe() {
        jefe = jefeManager.update(jefe);
        return "JEFE SAVED";
    }

    /**
     * Get materia list and add to data table JSF.
     *
     * @return
     */
    public List<Materia> getMateriaList() {
        if (materiaList == null || materiaList.isEmpty())
            refreshMateria();
        return materiaList;
    }

    /**
     * Get detail of each materia on the form.
     *
     * @return
     */
    public Materia getMateriaDetails() {
        return materia;
    }

    /**
     * Action handler
     *
     * @return materia list.
     */
    public String showMateriaList() {
        return "MATERIA LIST";
    }

    /**
     * Action handler called when a row of the table is clicked on the id.
     *
     * @param materia
     * @return
     */
    public String showMateriaDetails(Materia materia) {
        this.materia = materia;
        return "MATERIA DETAILS";
    }

    /**
     * Action handler that updates materia list on view.
     */
    public void refreshMateria() {
        materiaList = materiaManager.getAllEntities();
    }

    /**
     * Action handler that updates the materia model on the database. Called
     * when update button is clicked.
     *
     * @return materia list.
     */
    public String updateMateria() {
        materia = materiaManager.update(materia);
        return "MATERIA SAVED";
    }

    /**
     * Get pensum list and add to data table JSF.
     *
     * @return
     */
    public List<Pensum> getPensumList() {
        if (pensumList == null || pensumList.isEmpty())
            refreshPensum();
        return pensumList;
    }

    /**
     * Get detail of each pensum on the form.
     *
     * @return
     */
    public Pensum getPensumDetails() {
        return pensum;
    }

    /**
     * Action handler
     *
     * @return pensum list.
     */
    public String showPensumList() {
        return "PENSUM LIST";
    }

    /**
     * Action handler called when a row of the table is clicked on the id.
     *
     * @param pensum
     * @return
     */
    public String showPensumDetails(Pensum pensum) {
        this.pensum = pensum;
        return "PENSUM DETAILS";
    }

    /**
     * Action handler that updates pensum list on view.
     */
    public void refreshPensum() {
        pensumList = pensumManager.getAllEntities();
    }

    /**
     * Action handler that updates the pensum model on the database. Called when
     * update button is clicked.
     *
     * @return pensum list.
     */
    public String updatePensum() {
        pensum = pensumManager.update(pensum);
        return "PENSUM SAVED";
    }

    /**
     * Get profesor list and add to data table JSF.
     *
     * @return
     */
    public List<Profesor> getProfesorList() {
        if (profesorList == null || profesorList.isEmpty())
            refreshProfesor();
        return profesorList;
    }

    /**
     * Get detail of each profesor on the form.
     *
     * @return
     */
    public Profesor getProfesorDetails() {
        return profesor;
    }

    /**
     * Action handler
     *
     * @return profesor list.
     */
    public String showProfesorList() {
        return "PROFESOR LIST";
    }

    /**
     * Action handler called when a row of the table is clicked on the id.
     *
     * @param profesor
     * @return
     */
    public String showProfesorDetails(Profesor profesor) {
        this.profesor = profesor;
        return "PROFESOR DETAILS";
    }

    /**
     * Action handler that updates profesor list on view.
     */
    public void refreshProfesor() {
        profesorList = profesorManager.getAllEntities();
    }

    /**
     * Action handler that updates the profesor model on the database. Called
     * when update button is clicked.
     *
     * @return profesor list.
     */
    public String updateProfesor() {
        profesor = profesorManager.update(profesor);
        return "PROFESOR SAVED";
    }

}
