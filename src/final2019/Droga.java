package final2019;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Droga extends Medicamento {

    private String nombre;

    private Set<String>accionTerapeutica;

    private Set<String>contraindicaciones;

    private double precio;

    public Droga(String nombre, double precio) {
        this.nombre = nombre;
        this.accionTerapeutica = new HashSet<>();
        this.contraindicaciones = new HashSet<>();
        this.precio = precio;
    }

    @Override
    public Set<String> getAccionTerapeutica() {
        return accionTerapeutica;
    }

    @Override
    public Set<String> getContraindicaciones() {
        return contraindicaciones;
    }

    @Override
    public boolean contiene(String nombreDroga) {
        return nombre.contains(nombreDroga);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAccionTerapeutica(String accionTerapeutica) {
        this.accionTerapeutica.add(accionTerapeutica);
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones.add(contraindicaciones);
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }
}
