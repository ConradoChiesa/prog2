package libreria;

import java.util.Iterator;
import java.util.List;

public class Cliente extends Grupo {

    List<String>generos;
    @Override
    public boolean aceptarLibro(Libro l) {
        Iterator externo = l.getGeneros().iterator();
        while (externo.hasNext()) {
            if(generos.contains(externo.next()))
                return true;
        }
        return false;
    }
}
