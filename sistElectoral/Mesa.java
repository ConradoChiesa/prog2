package sistElectoral;

import java.util.ArrayList;

public class Mesa extends LugarAbs {
    private ArrayList<Votante> padron = new ArrayList<>();

    private ArrayList<Voto> votos;

    public Mesa(String nombre) {
        super(nombre);
        this.padron = padron;
        this.votos = new ArrayList<>();
    }

    public void registrarVoto(Voto voto, Votante votante) {
        if (padron.contains(votante)){
            votos.add(voto);
            System.out.println("Su voto a sido ingresado de forma exitosa");
        } else {
            System.out.println("No esta registrado en esta mesa");

        }
    }


    @Override
    double getCantVotos() {
        return votos.size();
    }

    @Override
    double getPorcentajeVotos(Candidato c) {
        double porcentajeVotos = 0;
        for (Voto voto : votos) {
            if (voto.getCandidato().equals(c)) {
                porcentajeVotos++;
            }
        }
        return porcentajeVotos / votos.size() * 100;
    }

    public void addVotante(Votante v) {
        padron.add(v);
    }

}
