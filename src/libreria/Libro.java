package libreria;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    String nombre;
    String autor;
    String resumen;
    List<String> generos;
    double precio;

    public Libro(String nombre, String autor, String resumen, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.resumen = resumen;
        this.generos = new ArrayList<>();
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
