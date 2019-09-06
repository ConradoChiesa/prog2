package Avicola;
import java.util.Date;

public class Congelado extends Producto{

    String tipo;
    int codigo, tempRec;
    Date envasado;
    String origen;

    public Congelado(String nom, Date vto, int lote, String t, int cod, int tempRec, Date envasado, String ori) {
        super(nom, vto, lote);
        setTipo(t);
        setCodigo(cod);
        setTempRec(tempRec);
        setEnvasado(envasado);
        setOrigen(ori);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTempRec(int tempRec) {
        this.tempRec = tempRec;
    }

    public void setEnvasado(Date envasado) {
        this.envasado = envasado;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }


    public String getEtiqueta() {
        return  "Nombre: " + nombre + "\nFecha de vto: " + vto + "\nLote N°: " + lote +
                "\nTipo: " + tipo + "\nCodigo: " + codigo + "\nTemperatura de mantenimiento: " + tempRec +
                "\nFecha de envase: " + envasado + "\nGranja de origen: " + origen;
    }
}
