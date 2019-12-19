package libreria;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

    List<Libro>libros;
    List<Grupo>clientes;

    public Libreria() {
        this.libros = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public List<Libro> getLibrosParaCliente(Grupo g) {
        List<Libro> aux = new ArrayList<>();
        for (Libro l :
                libros) {
            if (g.aceptarLibro(l))
                aux.add(l);
            }
        return aux;
    }
}

