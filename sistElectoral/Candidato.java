package sistElectoral;

public class Candidato {
    String nombre;
    String partPol;
    String agrup;

    public Candidato(String n, String pP, String a){
        this.nombre=n;
        this.partPol=pP;
        this.agrup=a;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPartPol() {
        return partPol;
    }

    public String getAgrup() {
        return agrup;
    }

    @Override
    public String toString() {
        return "Nombre='" + nombre + '\'' +
                ", Partido Politico='" + partPol + '\'' +
                ", Agrupación='" + agrup + '\'';
    }
}
