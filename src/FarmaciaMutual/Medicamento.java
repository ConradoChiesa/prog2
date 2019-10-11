package FarmaciaMutual;

import java.util.Objects;

public class Medicamento extends Farmacia{
    String nombre;
    int precio;
    public Medicamento(String n, int p) {
        this.nombre = n;
        this.precio = p;
    }

    public int getPrecio() {
        return precio;
    }

    public void addSintoma(String s) {
        sintomas.add(s);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicamento med = (Medicamento) o;
        return Objects.equals(nombre, med.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
