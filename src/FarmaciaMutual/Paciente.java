package FarmaciaMutual;

import java.util.ArrayList;

public class Paciente implements Cobertura {
    private String mutual;
    private int cobertura;
    private ArrayList<Medicamento> alergico = new ArrayList<Medicamento>();

    public Paciente(String m, int c) {

        this.mutual = m;
        this.cobertura = c;
    }

    public String getMutual() {
        return mutual;
    }

    public void setMutual(String mutual) {
        this.mutual = mutual;
    }

    public void setCobertura(int cobertura) {
        this.cobertura = cobertura;
    }

    @Override
    public int getCobertura() {
        return cobertura;
    }

    public boolean isAlergico(Medicamento m) {
        for (int i = 0; i < alergico.size(); i++) {

            if (alergico.equals(m)) {
                return true;
            }
        }
            return false;
    }
}
