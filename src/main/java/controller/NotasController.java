/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.CategoriaFacadeLocal;
import ejb.NotasFacadeLocal;
import ejb.PersonasFacadeLocal;
import entity.Categoria;
import entity.Notas;
import entity.Personas;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author juan.ruizusam
 */
@Named(value = "notasController")
@SessionScoped
public class NotasController implements Serializable {

    @EJB
    private NotasFacadeLocal notasEJB;
    private Notas notas;
    private List<Notas> listaNota;

    @EJB

    private PersonasFacadeLocal PersonaEJB;
    private Personas persona;
    private List<Personas> listaPersona;
    
    @EJB
    private CategoriaFacadeLocal categoriaEJB;
    private Categoria categoria;
    private List<Categoria> listaCategoria;

    public Personas getPersona() {
        return persona;
    }

    public void setPersona(Personas persona) {
        this.persona = persona;
    }

    public List<Personas> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(List<Personas> listaPersona) {
        this.listaPersona = listaPersona;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Categoria> getListaCategoria() {
        return listaCategoria;
    }

    public void setListaCategoria(List<Categoria> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }
    
    

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

    public List<Notas> getLista() {
        return listaNota;
    }

    public void setLista(List<Notas> lista) {
        this.listaNota = lista;
    }

    @PostConstruct
    public void init() {
        notas = new Notas();
        persona = new Personas();
        categoria = new Categoria();
    }
    
    public void consultarCategoria(){
        try {
            listaCategoria=categoriaEJB.findAll();
        } catch (Exception e) {
        }
    }
    public void consultarPersona(){
        try {
            listaPersona=PersonaEJB.findAll();
        } catch (Exception e) {
        }
    }
    
    public void insertar(){
        try {
            
            notas.setCodigo(persona);
            notas.setCategoria(categoria);
            notasEJB.create(notas);
            FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_INFO, "Su registro fue guardado", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
        }
    }
    

}
