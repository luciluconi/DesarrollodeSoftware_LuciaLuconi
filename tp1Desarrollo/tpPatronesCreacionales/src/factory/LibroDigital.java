package factory;

public class LibroDigital implements Libro{
    private String titulo;
    private String autor;
    private int precio;

    public LibroDigital(String titulo, String autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    @Override
    public void leerDatos() {
        System.out.println("El libro "+this.getTitulo()+" ($"+this.getPrecio()+") es de " + this.getAutor() + " y es digital");
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
