package final2019;

import java.util.*;

public abstract class Medicamento {
    public abstract Set<String>getAccionTerapeutica();
    public abstract Set<String>getContraindicaciones();
//    public abstract Set<String>getNombre();
    public abstract boolean contiene(String nombreDroga);
    public abstract String getNombre();
    public abstract double getPrecio();
    /*{
        double precio = 0;
        Set<Medicamento>drogasContenidas = new HashSet<>();
//        Iterator it = medicamento.iterator();
//        Map<String, Integer>mapa = new HashMap<>();
        if(drogasContenidas.add(medicamento.getNombre())
        while (it.hasNext()) {
            ;
            if(drogasContenidas.add(it.next()))
        }
        return precio;
    }*/
}
