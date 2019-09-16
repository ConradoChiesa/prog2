package Sueldos;

public class EmpleadoHorasExtra extends Empleado {

    int horasExtra;
    float monto;

    public EmpleadoHorasExtra(float sueldoSem, float monto, int horasExtra) {
        super(sueldoSem);
        setHoraExtra(horasExtra);
        setMonto(monto);
    }

    public void setHoraExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public void setMonto(float monto) { this.monto = monto; }

    @Override
    public String getPagoTotal() {
        return "El pago total del empleado es de: $" + (super.getPagoSem() + (this.horasExtra * this.monto));
    }

    @Override
    public String detallePago() {
        return "El sueldo Básico es de: $" + super.getPagoSem() + " y cobra $" + getTotalPagoHorasE() + " por horas extra";
    }

    public double getTotalPagoHorasE() {
        return this.horasExtra * this.monto;
    }
}
