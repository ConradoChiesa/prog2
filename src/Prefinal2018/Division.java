package Prefinal2018;

public class Division extends Operador {

    public Division(Expresion e1, Expresion e2) {
        super(e1, e2, "/");
    }

    @Override
    public double getValor() {
        if (this.e2.getValor()!=0)
        return this.e1.getValor() / this.e2.getValor();
        else return valorError;
    }

    @Override
    public Expresion getExpresionInversa() {
        return new Multiplicacion(this.e1.getExpresionInversa(), this.e2.getExpresionInversa());

    }
}
