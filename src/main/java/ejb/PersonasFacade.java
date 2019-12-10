/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Personas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author juan.ruizusam
 */
@Stateless
public class PersonasFacade extends AbstractFacade<Personas> implements PersonasFacadeLocal {

    @PersistenceContext(unitName = "conexionPU")
     
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonasFacade() {
        super(Personas.class);
    }
}
