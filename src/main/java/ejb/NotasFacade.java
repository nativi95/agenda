/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Notas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author juan.ruizusam
 */
@Stateless
public class NotasFacade extends AbstractFacade<Notas> implements NotasFacadeLocal{
    
    @PersistenceContext(unitName="conexionPU")
    
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager(){
    return em;
    }
    
    public NotasFacade(){
    super(Notas.class);
    }

    String sql="select n from Notas n";
    Query query=em.createQuery(sql);
  List<Nota> lista=
}
