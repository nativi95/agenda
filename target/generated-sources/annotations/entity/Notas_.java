package entity;

import entity.Categoria;
import entity.Personas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T15:37:33")
@StaticMetamodel(Notas.class)
public class Notas_ { 

    public static volatile SingularAttribute<Notas, String> comentario_admin;
    public static volatile SingularAttribute<Notas, Integer> codigo;
    public static volatile SingularAttribute<Notas, Personas> persona;
    public static volatile SingularAttribute<Notas, Categoria> categoria;
    public static volatile SingularAttribute<Notas, String> encabezado;
    public static volatile SingularAttribute<Notas, Integer> valoracion;
    public static volatile SingularAttribute<Notas, Date> fecha_creacion;
    public static volatile SingularAttribute<Notas, String> cuerpo;

}