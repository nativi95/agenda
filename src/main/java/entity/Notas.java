package entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "notas")

public class Notas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @ManyToOne
    @JoinColumn(name = "persona", referencedColumnName="codigo",nullable = false)
    
    
    private Personas persona;
      @ManyToOne
   @JoinColumn(name = "categoria", referencedColumnName="codigo",nullable = false)
  
      private Categoria categoria;
    
    @Column(name = "encabezado")
    private String encabezado;
    
    @Column(name = "cuerpo")
    private String cuerpo;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_creacion")
    private Date fecha_creacion= new Date();
    
    @Column(name = "comentario_admin")
    private String comentario_admin;
    
    @Column(name = "valoracion")
    private int valoracion;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Personas getPersona() {
        return persona;
    }

    public void setPersonas(Personas persona) {
        this.codigo = codigo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getComentario_admin() {
        return comentario_admin;
    }

    public void setComentario_admin(String comentario_admin) {
        this.comentario_admin = comentario_admin;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Notas other = (Notas) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Notas{" + "codigo=" + codigo + '}';
    }

   

    
}
