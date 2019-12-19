package Prefinal2018;

public class Resta extends Operador {

    public Resta(Expresion e1, Expresion e2) {
        super(e1, e2, "-");
    }

    @Override
    public double getValor() {
        return this.e1.getValor() - this.e2.getValor();
    }

    @Override
    public Expresion getExpresionInversa() {
        return new Suma(this.e1.getExpresionInversa(), this.e2.getExpresionInversa());

    }
}
