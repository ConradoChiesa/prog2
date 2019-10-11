package FarmaciaMutual;

import java.util.ArrayList;

public class Farmacia {
    ArrayList<String> sintomas = new ArrayList<String>();

    public Farmacia() {

    }

    public boolean evaluarVenta(Medicamento m, Paciente p) {
        return false;
    }

    public double determinarValor(Medicamento m, Paciente p) {
        return (m.getPrecio() * p.getCobertura()) / 100;
    }
}
