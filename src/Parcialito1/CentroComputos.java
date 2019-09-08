package Parcialito1;

public class CentroComputos {
    private final static int maxC = 10;
    private final static int maxT = 10;
    private Computadora [] cpus;
    private Tarea [] tareas;
    private int cpuCount;
    private int tareaCount;

    public CentroComputos(int compu, int tarea) {
        setCpuCount(compu);
        setTareaCount(tarea);
        cpus = new Computadora[maxC];
        tareas = new Tarea[maxT];
    }

    public void setCpus(Computadora[] cpus) {
        this.cpus = cpus;
    }

    public void setTareas(Tarea[] tareas) {
        this.tareas = tareas;
    }

    public void setCpuCount(int cpuCount) {
        this.cpuCount = cpuCount;
    }

    public void setTareaCount(int tareaCount) {
        this.tareaCount = tareaCount;
    }


    public void addCpu(int vel, int memo) {
        if (cpuCount < maxC) {
            cpus[cpuCount] = new Computadora(vel, memo);
            cpuCount++;
        }
    }

    public void addTarea(String nombre, int memReq) {
        if (tareaCount < maxT) {
            tareas[tareaCount] = new Tarea();
            tareaCount++;
        }
    }

    public int getNumCpus() {
        return cpuCount;
    }

    public int getNumtareas() {
        return tareaCount;
    }

    public Tarea getTareaMaxMemReq() {
        Tarea aux;
        aux = tareas[0];
        for (int i = 0; i < tareaCount; i++) {
            if (tareas[i].getMemReq() > aux.getMemReq()) {
                aux = tareas[i];
            }
        }
        return aux;
    }
}
