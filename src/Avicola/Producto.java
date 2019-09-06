package Avicola;
import java.util.Date;

public class Producto {

    String nombre;
    Date vto;

    int lote;

    public Producto(String n, Date vto, int lote) {
        setNombre(n);
        setVto(vto);
        setLote(lote);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVto(Date vto) {
        this.vto = vto;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }
    
    
}
