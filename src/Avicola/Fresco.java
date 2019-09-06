package Avicola;
import java.util.Date;

public class Fresco extends Producto {

    Date envasado;
    String origen;

    public Fresco(String n, Date vto, int lote, Date envasado, String origen) {
        super(n,vto,lote);
        setEnvasado(envasado);
        setOrigen(origen);
    }

    public void setEnvasado(Date envasado) {
        this.envasado = envasado;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Date getEnvasado() {
        return envasado;
    }

    public String getEtiqueta() {
        return "Nombre: " + nombre + "\nFecha de vto: " + vto + "\nLote N°: " + lote +
                "\nFecha de envase: " + envasado + "\nGranja de origen: " + origen;
    }
}
