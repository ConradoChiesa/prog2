package Prefinal2018;

public class Potencia extends Operador {

    public Potencia(Expresion e1, Expresion e2) {
        super(e1, e2, "^");
    }

    @Override
    public double getValor() {
        return Math.pow(this.e1.getValor(), this.e2.getValor());
    }

    @Override
    public Expresion getExpresionInversa() {
        return new Raiz(this.e1.getExpresionInversa(), this.e2.getExpresionInversa());

    }
}
