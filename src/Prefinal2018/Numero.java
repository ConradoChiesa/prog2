package Prefinal2018;

import java.util.ArrayList;
import java.util.List;

public class Numero extends Expresion {
    double valor;
    public Numero(double v) {
        this.valor = v;
    }

    @Override
   public double getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return ""+ valor;
    }

    @Override
    public Expresion getExpresionInversa() {
        return new Numero(valor);
    }

    @Override
    public List<Integer> getNumeros() {
        List aux = new ArrayList<>();
        aux.add(valor);
        return aux;
    }

    @Override
    public List<String> getOperadores() {
        return new ArrayList<>();
    }
}
