package prototype;

import java.time.LocalDate;

import abstractfactory.AbstractFactory;
import builder.Usuario;
import factory.Libro;
import factory.LogisticaLibro;

public class Prestamo implements Cloneable { // Si no implementa CLoneable no puede clonarse
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Prestamo(Libro libro, Usuario usuario, LocalDate fechaInicio, LocalDate fechaFin) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Override  // Metodo para clonar
    public Prestamo clone(){
        try{
            return (Prestamo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    protected Prestamo cloneDeep() {
        try {
            Prestamo clon = (Prestamo) super.clone();
            clon.libro = LogisticaLibro.crearLibro(this.libro.getTitulo(),this.libro.getAutor(),this.libro.getPrecio(),"Fisico");
            return clon;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void mostrar(){
        System.out.println("Prestamo de "+usuario.getNombre()+" del libro '"+libro.getTitulo()+"' desde "+fechaInicio+" hasta "+fechaFin);
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}

