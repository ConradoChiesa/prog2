package Prefinal2018;

import java.util.ArrayList;
import java.util.List;

public abstract class Operador extends Expresion{
    protected Expresion e1, e2;
    protected String operador;

    protected Operador(Expresion e1, Expresion e2, String op) {
        this.e1 = e1;
        this.e2 = e2;
        this.operador = op;
    }

//    abstract double calcular(Expresion e1, Expresion e2);
    public String getOperador() {
        return this.operador;
    }

    @Override
    public List<Integer> getNumeros() {
        List aux = new ArrayList();
        aux.addAll(e1.getNumeros());
        aux.addAll(e2.getNumeros());
        return aux;
    }

    @Override
    public List<String> getOperadores() {
        List aux = new ArrayList();
        aux.addAll(e1.getOperadores());
        aux.addAll(e2.getOperadores());
        aux.add(this.operador);
        return aux;
    }

    @Override
    public String toString() {
        return "("+ this.e1 + this.getOperador() + this.e2 +")";
    }

}
