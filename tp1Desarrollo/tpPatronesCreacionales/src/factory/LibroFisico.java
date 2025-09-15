package factory;

public class LibroFisico implements Libro{

    private String titulo;
    private String autor;
    private int precio;

    public LibroFisico(String titulo, String autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    @Override
    public void leerDatos() {
        System.out.println("El libro "+this.getTitulo()+" ($"+this.getPrecio()+") es de " + this.getAutor() + " y es físico");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}