package entity;

import static entity.Notas_.codigo;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//para indicarle a jpa que este es una llave auto incrementable
    private int codigo;
    

    private String usuario;
   
    private String pass;


    private Tipo_Usuario tipo;
   
    private boolean estado;
    
   
  
    private Personas persona;

    

}
