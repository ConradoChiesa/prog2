package Prefinal2018;

public class Raiz extends Operador {

    public Raiz(Expresion e1, Expresion e2) {
        super(e1, e2, "-/");
    }

    @Override
    public double getValor() {
        if (e1.getValor()>0)
        return Math.pow(this.e2.getValor(), 1 / this.e1.getValor());
        else return valorError;
    }

    @Override
    public Expresion getExpresionInversa() {
        return new Potencia(this.e1.getExpresionInversa(), this.e2.getExpresionInversa());

    }
}
