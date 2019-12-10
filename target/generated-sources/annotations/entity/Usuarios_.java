package entity;

import entity.Personas;
import entity.Tipo_Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-10T15:35:20")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, Integer> codigo;
    public static volatile SingularAttribute<Usuarios, Tipo_Usuario> tipo;
    public static volatile SingularAttribute<Usuarios, Boolean> estado;
    public static volatile SingularAttribute<Usuarios, Personas> persona;
    public static volatile SingularAttribute<Usuarios, String> pass;
    public static volatile SingularAttribute<Usuarios, String> usuario;

}