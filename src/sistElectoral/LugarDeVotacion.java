package sistElectoral;
import java.util.ArrayList;
public class LugarDeVotacion extends LugarAbs {
    ArrayList<LugarAbs> ubicaciones;

    public LugarDeVotacion(String nombre) {
        super(nombre);
        this.ubicaciones = new ArrayList<>();
    }

    @Override
    double getCantVotos() {
        double suma = 0;
        for (LugarAbs u :
                ubicaciones) {
            suma += u.getCantVotos();
        }
        return suma;
    }

    @Override
    double getPorcentajeVotos(Candidato c) {

        double prom = 0;
        int cont = 0;
        for (LugarAbs u :
                ubicaciones) {
            prom += u.getPorcentajeVotos(c);
            cont++;
        }
        return prom / cont;
    }

    public void addMesa(Mesa m) {

        ubicaciones.add(m);
    }

}
