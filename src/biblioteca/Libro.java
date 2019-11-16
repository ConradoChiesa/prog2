package biblioteca;

import java.util.Date;

public class Libro {
    int isbn;
    String autor, genero;
    Date edicion;

    public Libro(int isbn, String autor, String genero, Date edicion) {
        this.isbn = isbn;
        this.autor = autor;
        this.genero = genero;
        this.edicion = edicion;
    }

}
