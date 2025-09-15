package factory;

public interface Libro { // Clase abstracta con atributos y metodos comunes

    public abstract void leerDatos();

    public String getTitulo();

    public String getAutor();
    public int getPrecio();
}
