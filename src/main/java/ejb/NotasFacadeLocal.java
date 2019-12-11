/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Notas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author juan.ruizusam
 */@Local

public interface NotasFacadeLocal {
    void create (Notas nota);
   void edit (Notas nota);
   void remove (Notas nota);
   Notas find (Object id);
   List<Notas> findAll();
    
}
