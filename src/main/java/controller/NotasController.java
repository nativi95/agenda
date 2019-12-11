/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.NotasFacadeLocal;
import entity.Notas;
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
@Named(value = "notasController")
@SessionScoped
public class NotasController implements Serializable {

    @EJB
    private NotasFacadeLocal notasEJB;
    private Notas notas;
    private List<Notas> lista;

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

    public List<Notas> getLista() {
        return lista;
    }

    public void setLista(List<Notas> lista) {
        this.lista = lista;
    }
    
    @PostConstruct
    public void init(){
    notas=new Notas();
    }
    
    
    
}
