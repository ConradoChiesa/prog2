package Sueldos;

public class EmpleadoHorasExtra extends Empleado {

    double horasExtra;

    public EmpleadoHorasExtra(double sueldoSem, double horasExtra) {
        super(sueldoSem);
        setHoraExtra(horasExtra);
    }

    public void setHoraExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }

    @Override
    public double getPago(double sueldoSem) {
        return super.getPago(sueldoSem) + horasExtra;
    }
}
