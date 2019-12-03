//package entity;
//
//import static entity.Notas_.codigo;
//import java.io.Serializable;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "usuarios")
//public class Usuarios implements Serializable {
//
//    @Id
//
//    private int codigo;
//    @Column(name = "usuario")
//    private String usuario;
//    @Column(name = "pass")
//    private String pass;
//
//    @JoinColumn(name = "tipo", referencedColumnName = "codigo", nullable = false)
//    @ManyToOne
//
////    private Tipo_usuarios tipo;
//    @Column(name = "estado")
//    private boolean estado;
//    
//   
//    @Column(name="persona",nullable = false)
//    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private Personas persona;
//
//    public Personas getPersona() {
//        return persona;
//    }
//
//    public void setPersona(Personas persona) {
//        this.persona = persona;
//    }
//
//    public int getCodigo() {
//        return codigo;
//    }
//
//    public void setCodigo(int codigo) {
//        this.codigo = codigo;
//    }
//
//    public String getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(String usuario) {
//        this.usuario = usuario;
//    }
//
//    public String getPass() {
//        return pass;
//    }
//
//    public void setPass(String pass) {
//        this.pass = pass;
//    }
//
////    public Tipo_usuarios getTipo() {
////        return tipo;
////    }
////
////    public void setTipo(Tipo_usuarios tipo) {
////        this.tipo = tipo;
////    }
//
//    public boolean isEstado() {
//        return estado;
//    }
//
//    public void setEstado(boolean estado) {
//        this.estado = estado;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 41 * hash + this.codigo;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Usuarios other = (Usuarios) obj;
//        if (this.codigo != other.codigo) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "Usuarios{" + "codigo=" + codigo + '}';
//    }
//
//}
