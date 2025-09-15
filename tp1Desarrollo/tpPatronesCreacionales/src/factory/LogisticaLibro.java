package factory;

public class LogisticaLibro {
    /**
     * Segun el tipo, se crea el libro digital o fisico
     * */
    public static Libro crearLibro(String titulo, String autor, int precio, String tipo){
        switch (tipo.toLowerCase()) {
            case "digital": return new LibroDigital(titulo,autor,precio);
            case "fisico": return new LibroFisico(titulo,autor,precio);
            default: throw new IllegalArgumentException("Tipo de libro desconocido");
        }
    }
}
