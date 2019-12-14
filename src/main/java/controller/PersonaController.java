/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.CategoriaFacadeLocal;
import ejb.PersonasFacadeLocal;
import entity.Categoria;
import entity.Personas;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author juan.ruizusam
 */
@Named(value = "personaController")
@SessionScoped
public class PersonaController implements Serializable {

   @EJB
   private PersonasFacadeLocal PersonaEJB;
   private Personas persona;
   private List<Personas> lista;
   
    @EJB
    private CategoriaFacadeLocal categoriaEJB;
    private Categoria categoria;
    private List<Categoria> listac;

    public Personas getPersona() {
        return persona;
    }

    public void setPersona(Personas persona) {
        this.persona = persona;
    }

    public List<Personas> getLista() {
        return lista;
    }

    public void setLista(List<Personas> lista) {
        this.lista = lista;
    }
   
    @PostConstruct
    public void init(){
    persona=new Personas();
    }
    
    public void insert(){
    
        try {
            PersonaEJB.create(persona);
            listar();
        } catch (Exception e) {
        }
    }
    
    public void listar(){
    
        try {
            lista=PersonaEJB.findAll();
        } catch (Exception e) {
        }
    }
    
    public void leerid(Personas per){
        try {
            this.persona=per;
        } catch (Exception e) {
        }
    }
    
    public void modificar(){
        try {
            PersonaEJB.edit(persona);
            listar();
        } catch (Exception e) {
        }
    }
    
    public void eliminar(Personas per){
        try {
            this.persona=per;
            PersonaEJB.remove(persona);
            lista=PersonaEJB.findAll();
        } catch (Exception e) {
        }
    }
  
}
