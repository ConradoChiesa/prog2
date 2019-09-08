package Sueldos;

public class EmpleadoComision extends Empleado {

    double comisiones;

    public EmpleadoComision(double sueldo, double comisiones) {
        super(sueldo);
        setComision(comisiones);
    }

    public void setComision(double comisiones) {
        this.comisiones = comisiones;
    }

    @Override
    public double getPago(double sueldoSem) {
        return super.getPago(sueldoSem) + comisiones;
    }
}
