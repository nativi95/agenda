/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Personas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author juan.ruizusam
 */
@Local
public interface PersonasFacadeLocal {
    void create(Personas persona);
    void edit(Personas persona);
    void remove(Personas persona);
    Personas find(Object id);
    List<Personas> findAll();
}
