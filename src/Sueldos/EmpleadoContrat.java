package Sueldos;

public class EmpleadoContrat extends Empleado {
    public EmpleadoContrat(double sueldoSem) {
        super(sueldoSem);
    }

    @Override
    public String getPagoTotal() {
        return "Pago total semanal: $" + (this.getPagoSem());
    }

    @Override
    public String detallePago() {
        return "Salario semanal: $" + (this.getPagoSem());
    }
}
