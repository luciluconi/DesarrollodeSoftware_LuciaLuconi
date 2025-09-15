package singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import factory.Libro;

public class Database {
    private static Database instance;
    private List<Libro> libros;

    // APLICANDO DOUBLE-CHECKED LOCKING

    private Database() {
        libros = new ArrayList<>();
    }

    public static Database getInstance() {
        if (instance == null) { // Verificacion sin lock
            synchronized (Database.class) {
                if (instance == null){ // Verificacion con lock
                instance = new Database();
                }
            }
        }
        return instance;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println(libro.getTitulo() + " agregado a la BD");
    }

    public List<Libro> getLibros() {
        return Collections.unmodifiableList(libros);
    }
}