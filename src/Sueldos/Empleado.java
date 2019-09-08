package Sueldos;

public class Empleado {
    double sueldoSem;

    public Empleado(double sueldoSem) {
        setSueldoSem(sueldoSem);
    }

    public void setSueldoSem(double sueldoSem) {
        this.sueldoSem = sueldoSem;
    }

    public double getPago(double sueldoSem) {
        return sueldoSem;
    }
}
