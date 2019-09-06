package Parcialito1;

public class CentroComputos {
    private final static int maxC = 10;
    private final static int maxT = 10;
    private Computadora [] cpus = new Computadora[maxC];
    private Tarea [] tareas = new Tarea[maxT];
    private int cpuCount = 0;
    private int tareaCount = 0;

    public CentroComputos() {

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
        Tarea aux = new Tarea();
        aux = tareas[0];
        for (int i = 0; i < tareaCount; i++) {
            if (tareas[i].getMemReq() > aux.getMemReq()) {
                aux = tareas[i];
            }
        }
        return aux;
    }
}
