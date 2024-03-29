package parcial;

public class CondicionAnd implements Condicion {
    Condicion c1, c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Territorio t) {
        return c1.cumple(t)&&c2.cumple(t);
    }
}
