package final2019;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Compuesto extends Medicamento {
    private Set<Medicamento> medicamentos;

    public Compuesto() {
        this.medicamentos = new HashSet<>();
    }

    @Override
    public Set<String> getAccionTerapeutica() {
        Set<String>aux = new HashSet<>();
        for (Medicamento m :
                medicamentos) {
            aux.addAll(m.getAccionTerapeutica());
        }
        return aux;
    }

    @Override
    public Set<String> getContraindicaciones() {
        Set<String>aux = new HashSet<>();
        for (Medicamento m :
                medicamentos) {
            aux.addAll(m.getContraindicaciones());
        }
        return aux;
    }

    @Override
    public boolean contiene(String nombreDroga) {
        for (Medicamento m :
                medicamentos) {
            if (m.contiene(nombreDroga))
                return true;
        }
        return false;
    }

    @Override
    public String getNombre() {
        String aux = "";

        for (Medicamento m :
                medicamentos) {
            aux = aux +" " + m.getNombre();
        }
        return aux;
    }

    @Override
    public double getPrecio() {
        Set<String> aux = new HashSet<>();
        double precio = 0;
        for (Medicamento m :
                medicamentos) {
            if (aux.add(m.getNombre()))
                precio += getPrecio();
        }
        return precio;
    }
}
